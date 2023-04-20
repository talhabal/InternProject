package Runners.StepDefinitions;

import Pages.DialogContent;
import Utilities.GeneralWebDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LOGIN {
    DialogContent   dialogContent   =   new DialogContent();

    @Given("Navigate to Campus login page")
    public void navigateToCampusLoginPage() {
        GeneralWebDriver.getDriver().get("https://test.mersys.io");
        GeneralWebDriver.getDriver().manage().window().maximize();
    }

    @When("Enter username and password and click login button")
    public void enterUsernameAndPasswordAndClickLoginButton() {
        dialogContent.sendKeysFunction(dialogContent.userName,"turkeyts");
        dialogContent.sendKeysFunction(dialogContent.passWord,"TechnoStudy123");
        dialogContent.clickFunction(dialogContent.loginButton);
    }

    @Then("User should login successfully")
    public void userShouldLoginSuccessfully() {
        dialogContent.verifyContainsTextFunction(dialogContent.panelNavTitle,"Techno Study");
    }
}
