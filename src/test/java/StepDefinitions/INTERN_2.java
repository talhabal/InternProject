package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import org.openqa.selenium.WebElement;

import java.util.List;

public class INTERN_2 {
    LeftNav leftNav     =   new LeftNav();
    DialogContent dialogContent   =   new DialogContent();


    @And("Click element in Menu")
    public void clickElementInMenu(DataTable dt) {
        List<String> parent     =   dt.asList(String.class);
        for (String parentBtn : parent) {
            WebElement leftButton      =   leftNav.getWebElement(parentBtn);
            leftNav.clickFunction(leftButton);
        }
    }

    @And("Click element in Dialog")
    public void clickElementInDialog(DataTable dt) {
        List<String> clicks     =   dt.asList(String.class);
        for (String clickName : clicks) {
            WebElement  btnName     =   dialogContent.getWebElement(clickName);
            dialogContent.clickFunction(btnName);
        }
    }

    @And("Enter a value on the screen")
    public void enterAValueOnTheScreen(DataTable dt) {
        List<List<String>> inputName      =   dt.asLists(String.class);
        for (int i = 0; i < inputName.size(); i++) {
            WebElement inputElement = dialogContent.getWebElement(inputName.get(i).get(0));
            dialogContent.sendKeysFunction(inputElement,inputName.get(i).get(1));
        }
    }

    @And("Verify that the operation")
    public void verifyThatTheOperation() {
        dialogContent.verifyContainsTextFunction(dialogContent.messageContent,"success");
    }
}
