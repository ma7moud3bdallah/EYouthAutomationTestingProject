package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

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
        driver.findElement(subscribeNowButton).click();
        return new DataScienceCoursesPage(driver);
    }
}
