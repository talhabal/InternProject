package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;

import java.util.List;

public class INTERN_7 {

    LeftNav leftNav     =   new LeftNav();
    DialogContent dialogContent   =   new DialogContent();
    @And("Click on the screen")
    public void clickOnTheScreen(DataTable dt) {
        List<String> clicks     =   dt.asList(String.class);
        for (String clickName : clicks) {
            WebElement btnName     =   dialogContent.getWebElement(clickName);
            dialogContent.clickFunction(btnName);
        }
    }

    @And("Enter a value for the input")
    public void enterAValueForTheInput(DataTable dt) {
        List<List<String>> inputName      =   dt.asLists(String.class);
        for (int i = 0; i < inputName.size(); i++) {
            WebElement inputElement = dialogContent.getWebElement(inputName.get(i).get(0));
            dialogContent.sendKeysFunction(inputElement,inputName.get(i).get(1));
        }
    }

    @Then("Verify that the operation was successful")
    public void verifyThatTheOperationWasSuccessful() {
        dialogContent.verifyContainsTextFunction(dialogContent.successMessage,"successfully ");
    }
}
