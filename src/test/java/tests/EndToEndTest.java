package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.TrainingCoursesPage;

public class EndToEndTest extends BaseTest {
    @Test
    public void testScenario(){

        TrainingCoursesPage trainingCoursesPage = homePage.trainingCourses();
        CartPage cartPage = trainingCoursesPage.subscribeToCourse();
        Assert.assertEquals(cartPage.getCartItems().size(),1,"Course was not added to the cart correctly");
    }
}
