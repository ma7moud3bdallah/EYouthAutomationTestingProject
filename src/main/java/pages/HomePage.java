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
}
s
