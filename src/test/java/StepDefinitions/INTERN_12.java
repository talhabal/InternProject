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
    public void deletingTheUserYouAddedInTheTransaction() {
    }
}
