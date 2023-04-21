package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import Utilities.GeneralWebDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class INTERN_04 {

    DialogContent dc=new DialogContent();
    LeftNav ln=new LeftNav();
    @And("Navigate to fields page")
    public void navigateToFieldsPage() {
        ln.clickFunction(ln.setup);
        ln.clickFunction(ln.parameters);
        ln.clickFunction(ln.fields);

    }

    @When("Add a field")
    public void addAField() {
        dc.clickFunction(dc.addButton);
        dc.sendKeysFunction(dc.name, "Alan1");
        dc.sendKeysFunction(dc.codeInput, "AlanCode");
        dc.clickFunction(dc.saveButton);
    }


    @Then("Success message should be displayed")
    public void successMessageShouldBeDisplayed() {
        dc.verifyContainsTextFunction(dc.successMessage,"success");
    }

    @When("Edit a exist field")
    public void EditAExistField() {
        dc.sendKeysFunction(dc.mainName,"Alan1");
        dc.clickFunction(dc.searchButton);
        dc.clickFunction(dc.editButton);
        dc.sendKeysFunction(dc.name,"Bolge45");
        dc.sendKeysFunction(dc.codeInput,"BolgeCode");
        dc.clickFunction(dc.saveButton);


    }

    @And("Delete field")
    public void deleteField() {
        dc.sendKeysFunction(dc.mainName,"Bolge45");
        dc.clickFunction(dc.searchButton);
        dc.clickFunction(dc.deleteButton);
        dc.clickFunction(dc.deleteAgain);

    }

    @Then("Then Verify that the operation was unsuccessful")
    public void thenVerifyThatTheOperationWasUnsuccessful() {
        dc.verifyContainsTextFunction(dc.errorMessageContent, "already");
    }
}
