package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import org.openqa.selenium.WebElement;

import java.util.List;

public class INTERN_12 {
    LeftNav leftNav     =   new LeftNav();
    DialogContent   dialogContent   =   new DialogContent();

    @And("Click on the element in Nationalities")
    public void clickOnTheElementInNationalities(DataTable dt) {
        List<String> clickElement     =   dt.asList(String.class);
        for (String clickBtn : clickElement) {
            WebElement  clickAddBtn   =   leftNav.getWebElement(clickBtn);
            leftNav.clickFunction(clickAddBtn);
        }
    }

    @And("Click on the element in LeftNavMenu")
    public void clickOnTheElementInLeftNavMenu(DataTable dt) {
        List<String> parent     =   dt.asList(String.class);
        for (String parentBtn : parent) {
            WebElement  leftButton      =   leftNav.getWebElement(parentBtn);
            leftNav.clickFunction(leftButton);
        }
    }

    @And("Editing the user you added in the transaction")
    public void editingTheUserYouAddedInTheTransaction(DataTable dt) {
        List<String> parent     =   dt.asList(String.class);
        for (String parentTxt : parent) {
            dialogContent.findPagesAndClick(parentTxt);
        }
    }

    @And("Deleting the user you added in the transaction")
    public void deletingTheUserYouAddedInTheTransaction(DataTable dt) {
        List<String> strLabel   =  dt.asList(String.class);
        for (String strText : strLabel) {
            dialogContent.findPagesAndDelete(strText);
        }
    }

    @And("Find and delete to add data")
    public void findAndDeleteToAddData(DataTable dt) {
        List< List<String> > items= dt.asLists(String.class);
        for (int i = 0; i < items.size(); i++) {
            WebElement element= dialogContent.getWebElement(items.get(i).get(0));
            dialogContent.deleteItem(element, items.get(i).get(1));
        }
    }
}
