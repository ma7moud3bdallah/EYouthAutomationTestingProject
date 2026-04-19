package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class CourseCardPage {
    // Fields
    private WebDriver driver;
    private By courseOverview = By.cssSelector("section[id='overview']");

    // Constructor
    public CourseCardPage(WebDriver driver){
        this.driver = driver;
    }

    // Methods
    public boolean isCourseOverviewDisplayed(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='flex gap-2']/button[1]")));
        return driver.findElement(courseOverview).isDisplayed();
    }
}
