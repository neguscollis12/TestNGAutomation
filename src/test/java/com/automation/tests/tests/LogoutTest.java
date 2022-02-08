package com.automation.tests.tests;

import org.testng.annotations.Test;

public class LogoutTest  extends BaseTest{



    @Test
    public void userCanLogoutFromApp(){


        logingPage.doLogin();

        homePage.verifyHomePage();

        homePage.clickOnBurgerMenu();

        homePage.clickOnLogoutLink();

        logingPage.verifyLoginPage();





    }





}
