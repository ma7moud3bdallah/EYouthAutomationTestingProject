package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CourseCardPage;
import pages.CourseDetailsPage;

public class courseDetailsTest extends BaseTest {
    @Test
    public void testCourseDetails(){
        CourseDetailsPage courseDetailsPage = homePage.courseDetails();
        CourseCardPage courseCardPage = courseDetailsPage.selectCourseCard();
        Assert.assertTrue(courseCardPage.isCourseOverviewDisplayed(),"Course overview is not displayed");
    }
}
