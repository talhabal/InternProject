package Pages;

import Utilities.GeneralWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class DialogContent extends Parent {
    public DialogContent() {
        PageFactory.initElements(GeneralWebDriver.getDriver(), this);
    }

    @FindBy(css = "input[formcontrolname='username']")
    public WebElement userName;

    @FindBy(css = "input[formcontrolname='password']")
    public WebElement passWord;

    @FindBy(css = "button[aria-label='LOGIN']")
    public WebElement loginButton;

    @FindBy(css = "div>span[class='mat-tooltip-trigger logo-text']")
    public WebElement panelNavTitle;

    @FindBy(xpath = "//ms-add-button[contains(@class,'ng-star-inserted')]//button")
    public WebElement addButton;

    @FindBy(xpath = "(//ms-delete-button//button)[1]")
    public WebElement deleteButton;

    @FindBy(xpath = "//ms-search-button//button")
    public WebElement searchButton;

    @FindBy(xpath = "//ms-save-button/button")
    public WebElement saveButton;

    @FindBy(xpath = "//ms-edit-button/button")
    public WebElement editButton;

    @FindBy(xpath = "//ms-text-field[@placeholder='GENERAL.FIELD.NAME']/input")
    public WebElement mainName;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='name']/input")
    public WebElement name;

    @FindBy(xpath = "//div[contains(text(),'successfully')]")
    public WebElement successMessage;

    @FindBy(xpath = "//*[text()=' Delete ']")
    public WebElement deleteAgain;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='shortName']/input")
    public WebElement shortName;

    @FindBy(xpath = "//div[contains(text(),'already')]")
    public WebElement errorMessageContent;

    @FindBy(xpath = "//div[contains(text(),'There is no data to display')]")
    public WebElement tableIsNotSet;

    public WebElement getWebElement(String strButton) {

        switch (strButton) {
            case "addButton"     : return addButton;
            case "nameSearch"    : return mainName;
            case "successMessage":return successMessage;
            case "nameInput"     : return name;
            case "searchButton"  : return searchButton;
            case "editButton"    : return editButton;
            case "saveButton"    : return saveButton;
            case "shortName"     : return shortName;
            case "deleteButton"  : return deleteButton;
            case "deleteAgain"   : return deleteAgain;
            case "already"       : return errorMessageContent;
        }

        return null;
    }


    public void deleteItem(String searchText) {
//        sendKeysFunction(searchInput,searchText);
//        clickFunction(searchButton);
//        wait.until(ExpectedConditions.numberOfElementsToBe(By.xpath("//fuse-progress-bar/*") , 0));
//        clickFunction(deleteImageBtn);
//        clickFunction(deleteDialogBtn);
    }

}
