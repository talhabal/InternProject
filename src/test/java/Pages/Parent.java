package Pages;

import Utilities.GeneralWebDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class Parent {
    // Sayfa işlemi bitirene kadar bekletiyoruz. Eğer 8 saniyeyi geçerse otomatik olarak kapatılır.
    // Eğer erken bitirirse 8 saniye beklemeden kapatılır.
    WebDriverWait wait    =   new WebDriverWait(GeneralWebDriver.getDriver(), Duration.ofSeconds(8));

    // Elemente tıklama işlemi yapılabilmesi için oluşturulan bir metottur.
    // Bu metotun içerisinde 2 adet wait ile ilgili fonksiyon eklendi.
    public void clickFunction(WebElement element){
        waitUntilClickable(element);
        scrollToElement(element);
        element.click();
    }

    // Elementlerin içerisini doldurabilmek için oluşturulan bir metottur.
    // İçerisinde 2 adet wait ile ilgili fonksiyon eklendi.
    public void sendKeysFunction(WebElement element,String text){
        waitUntilVisible(element);
        scrollToElement(element);
        element.clear();
        element.sendKeys(text);
    }

    // Sayfada ilgili elementi görene kadar kaydırma işlemi yapılır.
    public void scrollToElement(WebElement element){
        JavascriptExecutor js  =   (JavascriptExecutor) GeneralWebDriver.getDriver();
        js.executeScript("arguments[0].scrollIntoView()",element);
    }

    // Sayfadaki elementi görene kadar bekletme işlemi yapar.
    public void waitUntilVisible(WebElement element){
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    // Sayfadaki elemente tıklanana kadar bekletme işlemi yapar.
    public void waitUntilClickable(WebElement element){
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    // Aldığımız uyarıları doğrulama işlemi yapar.
    public void verifyContainsTextFunction(WebElement element,String value){
        wait.until(ExpectedConditions.textToBePresentInElement(element,value));
        Assert.assertTrue(element.getText().toLowerCase().contains(value.toLowerCase()),"Aranan text bulunamadı!");
        new Actions(GeneralWebDriver.getDriver()).sendKeys(Keys.ESCAPE).perform(); //açık dialog varsa kapatmak için esc yapıyoruz
    }
    // Aldığımız uyarı hataları ile ilgili işlem yapar.


    public void undefinedContainsTextFunction(WebElement element,String value){
        wait.until(ExpectedConditions.textToBePresentInElement(element,value));
        Assert.assertTrue(element.getText().toLowerCase().contains(value.toLowerCase()));
        new Actions(GeneralWebDriver.getDriver()).sendKeys(Keys.ESCAPE).perform(); //açık dialog varsa kapatmak için esc yapıyoruz
    }

    public void undefinedTablesTextFunction(WebElement element,String value){
        wait.until(ExpectedConditions.textToBePresentInElement(element,value));
        Assert.assertTrue(element.getText().toLowerCase().contains(value.toLowerCase()));
        new Actions(GeneralWebDriver.getDriver()).sendKeys(Keys.ESCAPE).perform(); //açık dialog varsa kapatmak için esc yapıyoruz
    }
}
