package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class CartPage {
    // Fields
    private WebDriver driver;
    private By cartItems = By.cssSelector("ul[class='mt-4 space-y-3']");

    // Constructor
    public CartPage(WebDriver driver){
        this.driver = driver;
    }

    // Methods
    public List<WebElement> getCartItems(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(cartItems));
        return driver.findElements(cartItems);
    }
}
