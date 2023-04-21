package Intern_9;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;

import java.util.List;

public class INTERN_9 {
    LeftNav leftNav = new LeftNav();
    DialogContent dialogContent = new DialogContent();

    @And("Click on the element in LeftNav")
    public void clickOnTheElementInLeftNav(DataTable items) {

        List<String> buttons = items.asList(String.class);

        for (String button : buttons) {
            WebElement element = leftNav.getWebElement(button);
            leftNav.clickFunction(element);
        }
    }

    @And("Click on the element in Dialog")
    public void clickOnTheElementInDialog(DataTable dt) {

        List<String> buttons = dt.asList(String.class);
        for (String addButton : buttons) {
            WebElement element = dialogContent.getWebElement(addButton);
            dialogContent.clickFunction(element);
        }
    }

    @And("User sending the keys in Dialog Content")
    public void userSendingTheKeysInDialogContent(DataTable dt) {
        List<List<String>> items = dt.asLists(String.class);

        for (int i = 0; i < items.size(); i++) {
            WebElement element = dialogContent.getWebElement(items.get(i).get(0));
            dialogContent.sendKeysFunction(element, items.get(i).get(1));
        }
    }
    @Then("Success message should be displayed")
    public void successMessageShouldBeDisplayed() {
        dialogContent.verifyContainsTextFunction(dialogContent.successMessage,"successfully");
    }

    @And("User delete item from Dialog Content")
    public void userDeleteItemFromDialogContent(DataTable dt) {
        List<List<String>> items    =   dt.asLists(String.class);
        for (int i = 0; i < items.size(); i++) {
            WebElement  itemElement = dialogContent.getWebElement(items.get(i).get(0));
            dialogContent.deleteItem(itemElement,items.get(i).get(1));
        }
    }

    @Then("Already exist message should be displayed")
    public void alreadyExistMessageShouldBeDisplayed() {
        dialogContent.verifyContainsTextFunction(dialogContent.alreadyMessage,"already");
    }

    @Then("No data message should be displayed")
    public void noDataMessageShouldBeDisplayed() {
        dialogContent.verifyContainsTextFunction(dialogContent.dataMessage,"data");
    }
}
