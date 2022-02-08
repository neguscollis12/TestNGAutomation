package com.automation.tests.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class DriverUtils {
   static WebDriver driver;
    public static void createDriver(){
        //Setting path to chromedriver
        System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chromedriver");
        // Open the browser
        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        // 1. To open url in browser
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();

    }

    public static WebDriver getDriver(){
        return driver;


    }


}
