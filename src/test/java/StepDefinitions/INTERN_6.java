package StepDefinitions;

import Pages.DialogContent;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class INTERN_6 {
    DialogContent   dialogContent   =   new DialogContent();
    @Then("Verify that the operation was successfuly")
    public void verifyThatTheOperationWasSuccessfuly() {
        dialogContent.verifyContainsTextFunction(dialogContent.successMessage,"success");
    }

    @Then("Verify that the operation was unsuccessfuly")
    public void verifyThatTheOperationWasUnsuccessfuly() {
        dialogContent.verifyContainsTextFunction(dialogContent.errorMessageContent,"already");
    }


}
