package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class MarketingCoursesPage {
    // Fields
    private WebDriver driver;
    private By courseCard = By.xpath("//section [1] / div [1]");

    // Constructor
    public MarketingCoursesPage(WebDriver driver){
        this.driver = driver;
    }

    // Methods
    public CourseCardPage selectCourseCard(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='flex grow items-stretch gap-6']/button")));
        driver.findElement(courseCard).click();
        return new CourseCardPage(driver);
    }
}
