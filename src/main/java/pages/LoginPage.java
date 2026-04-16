package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {
    // Fields
    private WebDriver driver;
    private By emailField = By.id("email");
    private By passwordField = By.id("password");
    private By submitButton = By.xpath("//button[@type='submit']");
    private By errorMessage = By.xpath("//button[@type='submit']/following-sibling::p");

    // Constructor
    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    // Methods
    public void setEmail(String email){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(emailField));
        driver.findElement(emailField).sendKeys(email);
    }
    public void setPassword(String password){
        driver.findElement(passwordField).sendKeys(password);
    }
    public void login(){
        driver.findElement(submitButton).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(errorMessage));
    }
    public String getErrorMessage(){
        return driver.findElement(errorMessage).getText();
    }
}
