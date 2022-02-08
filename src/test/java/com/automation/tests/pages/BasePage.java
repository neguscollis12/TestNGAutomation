package com.automation.tests.pages;

import com.automation.tests.utils.DriverUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    WebDriver driver;


    public BasePage(){
        this.driver = DriverUtils.getDriver();
        PageFactory.initElements(driver, this);
    }



}
