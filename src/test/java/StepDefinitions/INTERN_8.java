package StepDefinitions;

import Pages.DialogContent;
import io.cucumber.java.en.Then;

public class INTERN_8 {
    DialogContent dialogContent     =   new DialogContent();
    @Then("Verify that the operation was unsuccessful")
    public void verifyThatTheOperationWasUnsuccessful() {
      dialogContent.undefinedContainsTextFunction(dialogContent.errorMessageContent, "already");
    }
}
