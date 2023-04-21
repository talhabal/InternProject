package StepDefinitions;

import Pages.DialogContent;
import Utilities.GeneralWebDriver;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class INTERN_3 {
    DialogContent dialogContent =   new DialogContent();
    @And("click outside select option")
    public void clickOutsideSelectOption() {
        new Actions(GeneralWebDriver.getDriver()).sendKeys(Keys.ESCAPE).perform();
    }

    @And("Edit the entered value and save")
    public void editTheEnteredValueAndSave(DataTable dt) {
        List<List<String>> items= dt.asLists(String.class);
        for (int i = 0; i < items.size(); i++) {
            WebElement element= dialogContent.getWebElement(items.get(i).get(0));
            dialogContent.editItem(element, items.get(i).get(1));
        }
    }
}
