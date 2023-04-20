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

    @FindBy(xpath = "//span[text()='Nationalities']")
    private WebElement nationalities;
    @FindBy(xpath = "//*[text()='Bank Accounts']")
    public WebElement bankButton;

    @FindBy(xpath="//span[text()='Human Resources']")
    public WebElement humanResource;

    @FindBy(xpath = "(//span[text()='Setup'])[3]")
    public WebElement setupHR;

    @FindBy(xpath="(//*[text()='Position Categories'])[1]")
    public WebElement PositionsCategories;

    @FindBy(xpath=" (//*[text()='Positions'])[1]")
    public WebElement Positions;


    public WebElement getWebElement(String strButton){
        switch (strButton)
        {
            case "setup"               : return setup;
            case "parameters"          : return parameters;
            case "nationalities"       : return nationalities;
            case "bankAccount"         : return bankButton;
            case "HumanResource"       : return humanResource;
            case "SetUpHR"             : return setupHR;
            case "PositionsCategories" : return PositionsCategories;
            case "Position"           : return Positions;
        }
        return null;
    }

}
