package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.CourseCardPage;
import pages.CourseDetailsPage;

public class courseDetailsTest extends BaseTest {
    @Test
    public void testCourseDetails(){
        CourseDetailsPage courseDetailsPage = homePage.courseDetails();
        CourseCardPage courseCardPage = courseDetailsPage.selectCourseCard();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(courseCardPage.isCourseOverviewDisplayed(),"Course overview is not displayed");
        softAssert.assertTrue(courseCardPage.isCourseImageDisplayed(),"Course Image is not displayed");
        softAssert.assertTrue(courseCardPage.isCourseTitleDisplayed(),"Course Title is not displayed");
        softAssert.assertTrue(courseCardPage.isInstructorNameDisplayed(),"Instructor Name is not displayed");
        softAssert.assertTrue(courseCardPage.isSubscribeButtonDisplayed(),"Subscribe Button is not displayed");
        softAssert.assertAll();
    }
}
