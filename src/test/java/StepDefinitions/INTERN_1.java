package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;

import java.util.List;

public class INTERN_1 {
    LeftNav ln = new LeftNav();
    DialogContent dc = new DialogContent();


    @And("click element in leftMenu")
    public void clickElementInLeftMenu(DataTable dt) {

        List<String> buttons = dt.asList(String.class);
        for (String button : buttons) {
            WebElement element = ln.getWebElement(button);
            ln.clickFunction(element);
        }
    }

    @And("click element in DialogContent")
    public void clickElementInDialogContent(DataTable dt) {
        List<String> buttons = dt.asList(String.class);
        for (String button : buttons) {
            WebElement element = dc.getWebElement(button);
            dc.clickFunction(element);
        }
    }

    @And("sendKeys element in DialogContent")
    public void sendkeysElementInDialogContent(DataTable dt) {
        List<List<String>> inputName = dt.asLists(String.class);
        for (int i = 0; i < inputName.size(); i++) {
            WebElement inputElement = dc.getWebElement(inputName.get(i).get(0));
            dc.sendKeysFunction(inputElement, inputName.get(i).get(1));
        }
    }


    @Then("verify element in DialogContent")
    public void verifyElementInDialogContent() {
        dc.verifyContainsTextFunction(dc.successMessage, "successfully");
    }

    @Then("Then Verify that the operation was unsuccessful")
    public void thenVerifyThatTheOperationWasUnsuccessful() {
        dc.undefinedContainsTextFunction(dc.errorMessageContent,"already");
    }

    @And("Find at pages and delete item")
    public void findAtPagesAndDeleteItem(DataTable dt) {
        List<List<String>> inputName = dt.asLists(String.class);
        for (int i = 0; i < inputName.size(); i++) {
            WebElement inputElement = dc.getWebElement(inputName.get(i).get(0));
            dc.deleteItem(inputElement, inputName.get(i).get(1));
        }
    }

//    @Then("Verify that the operation was unsuccessful in Table")
//    public void verifyThatTheOperationWasUnsuccessfulInTable() {
//        dc.undefinedTablesTextFunction(dc.tableIsNotSet, "no data");
//    }
}