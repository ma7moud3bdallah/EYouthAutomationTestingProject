package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoggedInHomePage {
    // Fields
    private WebDriver driver;
    private By subscribeNowButton = By.xpath("//a[text()='اشترك الآن']");

    // Constructor
    public LoggedInHomePage(WebDriver driver){
        this.driver = driver;
    }

    // Methods
    public DataScienceCoursesPage clickSubscribeNow(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(subscribeNowButton));
        driver.findElement(subscribeNowButton).click();
        return new DataScienceCoursesPage(driver);
    }
}
