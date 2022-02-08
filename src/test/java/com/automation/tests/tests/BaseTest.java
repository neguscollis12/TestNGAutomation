package com.automation.tests.tests;

import com.automation.tests.utils.DriverUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import com.automation.tests.pages.HomePage;
import com.automation.tests.pages.LogingPage;
import java.util.concurrent.TimeUnit;

public abstract class BaseTest {


    HomePage homePage;
    LogingPage logingPage;


    @BeforeMethod
    public  void setUp(){
        DriverUtils.createDriver();
         logingPage = new LogingPage();
         homePage = new HomePage();
    }


    @AfterMethod
    public void cleanUp(){
        DriverUtils.getDriver().quit();
    }

}
