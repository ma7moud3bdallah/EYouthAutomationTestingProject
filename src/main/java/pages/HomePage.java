package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {
    // Fields
    private WebDriver driver;
    private By searchField = By.xpath("//div[@class='relative max-w-[510px] grow']//input");
    private By searchAction = By.xpath("//span[contains(.,'How to Join a Bank? / كيف تنضم إلى البنك؟')]");
    private By sideMenu = By.cssSelector("div[class='flex items-center gap-1 md:gap-4'] > button > svg");
    private By coursesButton = By.cssSelector("div[class='relative'] > button");
    private By marketingCourses = By.xpath("//div[@class='mt-2 ml-9 space-y-2']/a [1]");
    private By courseCard = By.xpath("//section [1] / div [1]");

    // Constructor
    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    // Methods
    public void search(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(searchField));
        driver.findElement(searchField).click();
        driver.findElement(searchField).sendKeys("كيف تنضم إلي البنك");
        wait.until(ExpectedConditions.elementToBeClickable(searchAction));
        driver.findElement(searchAction).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(.,'Mohamed El Asal')]")));
    }
    public MarketingCoursesPage courseDetails(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(sideMenu));
        driver.findElement(sideMenu).click();
        wait.until(ExpectedConditions.elementToBeClickable(coursesButton));
        driver.findElement(coursesButton).click();
        wait.until(ExpectedConditions.elementToBeClickable(marketingCourses));
        driver.findElement(marketingCourses).click();
        return new MarketingCoursesPage(driver);
    }
}
