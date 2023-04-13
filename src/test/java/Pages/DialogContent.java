package Pages;

import Utilities.GeneralWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class DialogContent extends Parent {
    public DialogContent() {
        PageFactory.initElements(GeneralWebDriver.getDriver(),this);
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

    @FindBy(xpath = "(//ms-edit-button/button)[1]")
    public WebElement editButton;




    public WebElement getWebElement(String strButton){

        switch (strButton)
        {
//            case "addButton" : return addButton;
//            case "saveButton" : return saveButton;
//            case "nameInput" : return nameInput;
//            case "codeInput" : return codeInput;
//            case "integrationCode" : return integrationCode;
//            case "priorityCode" : return priorityCode;
//            case "toggleBar" : return toggleBar;
//            case "academicPeriod" : return academicPeriod;
//            case "academicPeriod1" : return academicPeriod1;
//            case "gradeLevel" : return gradeLevel;
//            case "gradeLevel2" : return gradeLevel2;
        }

        return null;
    }


    public void deleteItem(String searchText){
//        sendKeysFunction(searchInput,searchText);
//        clickFunction(searchButton);
//        wait.until(ExpectedConditions.numberOfElementsToBe(By.xpath("//fuse-progress-bar/*") , 0));
//        clickFunction(deleteImageBtn);
//        clickFunction(deleteDialogBtn);
    }

}
