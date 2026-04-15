package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class JoinUsTest extends BaseTest {
    @Test
    public void testJoinUs(){
        homePage.joinUs();
        Assert.assertTrue(driver.getCurrentUrl().contains("/signup"),"Registration process is incorrect");
    }
}
