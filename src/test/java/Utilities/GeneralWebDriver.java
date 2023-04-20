package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GeneralWebDriver {
    private static WebDriver driver;
    public static WebDriver getDriver(){
        // Türkçe rapor oluşturulurken tüm bilgisayarlarda çalışabilmesi için aşağıdaki kodu ekliyoruz
        Locale.setDefault(new Locale("EN"));
        System.setProperty("user.language", "EN");

        // Console'da bulunan Chrome hatalarını gizlemek için
        Logger logger= Logger.getLogger("");
        logger.setLevel(Level.SEVERE);
        System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");

        // Eğer driver yoksa direkt olarak Chrome ile açılıyor
        if (driver==null){
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--remote-allow-origins=*");
            driver  =   new ChromeDriver(options);
        }
        return driver;
    }

    public static void quitDriver(){
        // 4000 milisaniye sonra program kapanmazsa otomatik olarak kapatılır
        try {
            Thread.sleep(5000);
        }
        catch (InterruptedException e){
            throw new RuntimeException(e);
        }
        if (driver!=null){
            driver.quit();
            driver      =   null;
        }
    }
}
