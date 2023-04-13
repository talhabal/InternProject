package Pages;

import Utilities.GeneralWebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftNav extends Parent{
    public LeftNav() {
        PageFactory.initElements(GeneralWebDriver.getDriver(),this);
    }
    @FindBy(xpath = "(//span[text()='Setup'])[1]")
    public WebElement setup;

    @FindBy(xpath = "//span[text()='Parameters']")
    public WebElement parameters;

    @FindBy(xpath = "//*[text()='Bank Accounts']")
    public WebElement bankButton;


    public WebElement getWebElement(String strButton){
        switch (strButton)
        {
            case "setup" : return setup;
            case "parameters": return parameters;
            case "bankAccount": return bankButton;
        }
        return null;
    }

}
