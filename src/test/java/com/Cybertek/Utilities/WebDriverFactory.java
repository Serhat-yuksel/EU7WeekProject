package com.Cybertek.Utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.opera.OperaDriver;

public class WebDriverFactory {


    /*Task:
    write a static method that takes a string parameter name: browserType
    based on the value of parameter
    it will setup the browser and
    the method will return chromedriver or operadriver object.
    name of the method: getDriver
     */

    public static WebDriver getDriver(String browserType){

        WebDriver driver = null;

        switch (browserType.toLowerCase()){
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
            case "opera":
                WebDriverManager.operadriver().setup();
                driver = new OperaDriver();
                break;

        }
        return driver;
    }

}
