package com.example.cucumber.utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class DriverFactory {
   public static WebDriver driver;

    public static void initWebdr()
    {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();

    }

    public static WebDriver getDriver() {
        return driver;
    }

    public static void quitBrowser()
    {
        driver.quit();
    }
}
