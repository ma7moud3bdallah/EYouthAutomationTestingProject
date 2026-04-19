package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

public class EndToEndTest extends BaseTest {
    @Test
    public void testScenario(){
        LoginPage loginPage = homePage.loginPage();
        loginPage.setEmail("Mahmoud-Abdallah@shakeregypt.com");
        loginPage.setPassword("mahmoud123@SCG");
        LoggedInHomePage loggedInHomePage = loginPage.successfulLogin();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        DataScienceCoursesPage dataScienceCoursesPage = loggedInHomePage.clickSubscribeNow();
        CartPage cartPage = dataScienceCoursesPage.clickSubscribeButton();
        Assert.assertEquals(cartPage.getCartItems().size(),1,"Course was not added to the cart correctly");
    }
}
