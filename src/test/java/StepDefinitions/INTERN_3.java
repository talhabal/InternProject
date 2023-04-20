package StepDefinitions;

import Pages.DialogContent;
import io.cucumber.java.en.Then;

public class INTERN_3 {
    DialogContent dialogContent     =   new DialogContent();
    @Then("Verify that the operation was unsuccessful in Table")
    public void verifyThatTheOperationWasUnsuccessfulInTable() {
        dialogContent.undefinedTablesTextFunction(dialogContent.tableIsNotSet, "no data");
    }
}
