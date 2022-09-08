package com.qa.opencart.factory;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.imageio.stream.ImageInputStream;

public class DriverFactory {
    WebDriver driver;
    public void inti_driver(String browserName)
    {
        System.out.println("browser is " + browserName);


    if( browserName.equalsIgnoreCase("chrome"))
    {
      WebDriverManager.chromedriver().setup();
        driver =new ChromeDriver();
    }
    else if ( browserName.equalsIgnoreCase("firefox"))
        {
            WebDriverManager.firefoxdriver().setup();
            driver =new ChromeDriver();
        }
    else {
        System.out.println("Browser not supporting");
    }

        driver.manage().window().maximize();
    driver.manage().deleteAllCookies();
    driver.get("");
}}
