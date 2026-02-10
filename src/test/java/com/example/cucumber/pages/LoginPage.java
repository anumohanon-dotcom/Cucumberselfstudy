package com.example.cucumber.pages;

import com.example.cucumber.utils.ConfigReader;
import com.example.cucumber.utils.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    static WebDriver driver= DriverFactory.getDriver();

    public static void open(String url)
    {
        System.out.println("URL received ---> [" + url + "]");
        driver.get(url);
    }


    static By searchid=By.cssSelector("input[id='twotabsearchtextbox']");


    public static void Search(String query)
    {
        driver.findElement(searchid).click();
        driver.findElement(searchid).sendKeys(query);

    }


}
