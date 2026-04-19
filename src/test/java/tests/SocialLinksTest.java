package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SocialLinksTest extends BaseTest {
    @Test
    public void testFacebookIcon(){
        homePage.clickFacebookIcon();
        Assert.assertTrue(driver.getCurrentUrl().contains("facebook.com"),"Facebook link is incorrect");
    }
    @Test
    public void testLinkedinIcon(){
        homePage.clickLinkedinIcon();
        Assert.assertTrue(driver.getCurrentUrl().contains("linkedin.com"),"LinkedIn link is incorrect");
    }
    @Test
    public void testTwitterIcon(){
        homePage.clickTwitterIcon();
        Assert.assertTrue(driver.getCurrentUrl().contains("x.com"),"Twitter link is incorrect");
    }
}
