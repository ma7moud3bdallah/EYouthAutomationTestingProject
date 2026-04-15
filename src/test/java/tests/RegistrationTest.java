package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.RegistrationPage;

public class RegistrationTest extends BaseTest {
    @Test
    public void testRegisterPage() {
        RegistrationPage registrationPage = homePage.registerPage();
        registrationPage.setUsername("");
        registrationPage.setEmail("mahmoooud117@gmail.com");
        registrationPage.selectCountry("مصر");
        registrationPage.getSelectedCountry();
        registrationPage.selectGovernment("القاهرة");
        registrationPage.getSelectedGovernment();
        registrationPage.selectGender("ذكر");
        registrationPage.getSelectedGender();
        registrationPage.setPhoneNumber("01558361457");
        registrationPage.setPassword("mahmoud123");
        registrationPage.setPasswordConfirm("mahmoud123");
        registrationPage.selectTerms();
        registrationPage.createAccount();
        Assert.assertEquals(registrationPage.errorMessage(), "الاسم مطلوب", "Incorrect username error message");
    }
}
