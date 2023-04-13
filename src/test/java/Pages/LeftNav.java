package Pages;

import Utilities.GeneralWebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class LeftNav extends Parent{
    public LeftNav() {
        PageFactory.initElements(GeneralWebDriver.getDriver(),this);
    }


    public WebElement getWebElement(String strButton){
        switch (strButton)
        {
            //case "setup" : return setup;
            //case "parameters" : return parameters;
        }
        return null;
    }

}
