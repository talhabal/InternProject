package Pages;

import Utilities.GeneralWebDriver;
import org.openqa.selenium.support.PageFactory;

public class DialogContent extends Parent {
    public DialogContent() {
        PageFactory.initElements(GeneralWebDriver.getDriver(),this);
    }

}
