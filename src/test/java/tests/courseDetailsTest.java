package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CourseCardPage;
import pages.MarketingCoursesPage;

import java.time.Duration;

public class courseDetailsTest extends BaseTest {
    @Test
    public void testCourseDetails(){
        MarketingCoursesPage marketingCoursesPage = homePage.courseDetails();
        CourseCardPage courseCardPage = marketingCoursesPage.selectCourseCard();
        Assert.assertTrue(courseCardPage.isCourseOverviewDisplayed(),"Course overview is not displayed");
    }
}
