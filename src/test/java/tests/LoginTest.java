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
    @Test
    public void testEmptyFieldsLogin(){
        LoginPage loginPage = homePage.loginPage();
        loginPage.setEmail("");
        loginPage.setPassword("");
        loginPage.login();
        Assert.assertEquals(loginPage.getEmailErrorMessage(),"البريد الإلكتروني مطلوب","User can login without username");
        Assert.assertEquals(loginPage.getPasswordErrorMessage(),"كلمة المرور مطلوبة","User can login without password");
    }
}
