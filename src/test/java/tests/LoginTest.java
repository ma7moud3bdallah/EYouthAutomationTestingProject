package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTest extends BaseTest {
    @Test
    public void testInvalidLogin(){
        LoginPage loginPage = homePage.loginPage();
        loginPage.setEmail("mahmoud@gmail.com");
        loginPage.setPassword("mahmoud123");
        loginPage.login();
        Assert.assertEquals(loginPage.getErrorMessage(),"لم يتم العثور على حساب نشط للبيانات المقدمة","User can login with invalid credentials");
    }
}
