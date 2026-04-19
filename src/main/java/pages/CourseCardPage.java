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
    private By courseImage = By.xpath("//p[@class='text-primary-mainBlue ms-3 text-xl font-semibold']/preceding-sibling::div/div/img");
    private By courseTitle= By.xpath("//div[@class='max-w-xl xl:max-w-3xl']/h1");
    private By instructorName= By.xpath("//h4[@class='mt-7 text-sm font-light text-white']/a");
    private By subscribeButton = By.xpath("//div[@class='flex gap-2']/button[1]");

    // Constructor
    public CourseCardPage(WebDriver driver){
        this.driver = driver;
    }

    // Methods
    public boolean isCourseOverviewDisplayed(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(subscribeButton));
        return driver.findElement(courseOverview).isDisplayed();
    }
    public boolean isCourseImageDisplayed(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(subscribeButton));
        return driver.findElement(courseImage).isDisplayed();
    }
    public boolean isCourseTitleDisplayed(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(subscribeButton));
        return driver.findElement(courseTitle).isDisplayed();
    }
    public boolean isInstructorNameDisplayed(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(subscribeButton));
        return driver.findElement(instructorName).isDisplayed();
    }
    public boolean isSubscribeButtonDisplayed(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(subscribeButton));
        return driver.findElement(subscribeButton).isDisplayed();
    }
}
