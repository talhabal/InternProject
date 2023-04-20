package Runners.StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import org.openqa.selenium.WebElement;

import java.util.List;

public class INTERN_9 {
    LeftNav leftNav=new LeftNav();

    DialogContent dialogContent=new DialogContent();
    @And("Click on the element in LeftNav")
    public void clickOnTheElementInLeftNav(DataTable items) {

        List<String> buttons=items.asList(String.class);

        for (String button:buttons){
            WebElement element=leftNav.getWebElement(button);
            dialogContent.clickFunction(element);
        }
    }
    @And("Click on the element in Dialog")
    public void clickOnTheElementInDialog(DataTable dt) {

        List<String> buttons=dt.asList(String.class);
    }

    @And("User sending the keys in Dialog Content")
    public void userSendingTheKeysInDialogContent() {

    }
}
