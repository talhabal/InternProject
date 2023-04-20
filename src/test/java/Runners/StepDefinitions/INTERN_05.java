package Runners.StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;

import java.util.List;

public class INTERN_05 {
    LeftNav ln = new LeftNav();
    DialogContent dc = new DialogContent();

    @And("click element in leftMenu in Positions")
    public void clickElementInLeftMenuInPositions(DataTable dt) {
        List<String> buttons = dt.asList(String.class);
        for (String button : buttons) {
            WebElement element = ln.getWebElement(button);
            ln.clickFunction(element);
        }
    }

    @And("click element in DialogContent in Positions")
    public void clickElementInDialogContentInPositions(DataTable dt) {
        List<String> buttons = dt.asList(String.class);
        for (String button : buttons) {
            WebElement element = dc.getWebElement(button);
            dc.clickFunction(element);
        }
    }

    @And("sendKeys element in DialogContentin Positions")
    public void sendkeysElementInDialogContentinPositions(DataTable dt) {
        List<List<String>> inputName = dt.asLists(String.class);
        for (int i = 0; i < inputName.size(); i++) {
            WebElement inputElement = dc.getWebElement(inputName.get(i).get(0));
            dc.sendKeysFunction(inputElement, inputName.get(i).get(1));
        }
    }

    @Then("verify element in DialogContent in Positions")
    public void verifyElementInDialogContentinPositions() {
        dc.verifyContainsTextFunction(dc.successMessage, "successfully");

    }

    @And("sendKeys element in DialogContent in Positions")
    public void sendkeysElementInDialogContentInPositions(DataTable dt) {
        List<List<String>> inputName = dt.asLists(String.class);
        for (int i = 0; i < inputName.size(); i++) {
            WebElement inputElement = dc.getWebElement(inputName.get(i).get(0));
            dc.sendKeysFunction(inputElement, inputName.get(i).get(1));
        }
    }
}