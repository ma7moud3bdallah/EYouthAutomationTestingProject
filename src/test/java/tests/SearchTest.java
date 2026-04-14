package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;


public class SearchTest extends BaseTest {
    @Test
    public void testSearch(){
        homePage.search();
        Assert.assertTrue(driver.getTitle().contains("البنك"),"Search is not correct");
    }
}
