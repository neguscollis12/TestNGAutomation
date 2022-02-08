package com.automation.tests.tests;

import org.testng.annotations.Test;


public class LoginTest extends BaseTest{


    @Test
    public void verifyUserCanLogin(){

        logingPage.doLogin();
        homePage.verifyHomePage();
    }

}
