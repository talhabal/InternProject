package Runners.StepDefinitions;

import Utilities.GeneralWebDriver;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {
    @After
    public void after(){
        System.out.println("Senaryo bitti!");
        GeneralWebDriver.quitDriver();
    }
}
