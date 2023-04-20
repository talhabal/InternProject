package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;

import java.util.List;

public class INTERN_8 {
    DialogContent dialogContent     =   new DialogContent();
    LeftNav leftNav     =   new LeftNav();
    @Then("Verify that the operation was unsuccessful")
    public void verifyThatTheOperationWasUnsuccessful() {
      dialogContent.undefinedContainsTextFunction(dialogContent.errorMessageContent, "already");
    }


    @And("Click on the element on the screen")
    public void clickOnTheElementOnTheScreen(DataTable dt) {
        List<String> strButtons=dt.asList(String.class);
        for (String strButton: strButtons) {
            WebElement element=dialogContent.getWebElement(strButton); // webelemnti bul
            dialogContent.clickFunction(element); // webelemente tıklat
        }
    }

    @And("Enter a value for the input on the screen")
    public void enterAValueForTheInputOnTheScreen(DataTable dt) {
        List< List<String> > items= dt.asLists(String.class);
        for (int i = 0; i < items.size(); i++) {
            WebElement element= dialogContent.getWebElement(items.get(i).get(0));
            dialogContent.sendKeysFunction(element, items.get(i).get(1));
        }
    }

    @And("Find at pages and click")
    public void findAtPagesAndClick(DataTable dt) {
        List<String> strButtons=dt.asList(String.class);
        for (String strText: strButtons) {
            dialogContent.findPagesAndClick(strText);
        }
    }

    @And("Click on the element in LeftNavMenuu")
    public void clickOnTheElementInLeftNavMenuu(DataTable dt) {
        List<String> parent     =   dt.asList(String.class);
        for (String parentBtn : parent) {
            WebElement  leftButton      =   leftNav.getWebElement(parentBtn);
            leftNav.clickFunction(leftButton);
        }
    }
}
