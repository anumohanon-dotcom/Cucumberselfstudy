package com.example.cucumber.hooks;



import com.example.cucumber.utils.DriverFactory;
import io.cucumber.java.Before;
import io.cucumber.java.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks {

    public static WebDriver driver;

    @Before
     public void initBrowser()
    {
        DriverFactory.initWebdr();
    }



    public void smoke()
    {
        System.out.println("only f0r smoke");
    }

    @After
    public void quitBrowser()
    {
       DriverFactory.quitBrowser();
    }
}
