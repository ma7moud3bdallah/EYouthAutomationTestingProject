package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class RegistrationPage {
    // Fields
    private WebDriver driver;
    private By nameField = By.id("name");
    private By emailField = By.id("email");
    private By countryMenu = By.xpath("//div[@class='grid grid-cols-2 gap-4']/div[1]/button/following-sibling::select");
    private By governmentMenu = By.xpath("//div[@class='grid grid-cols-2 gap-4']/div[2]/button/following-sibling::select");
    private By genderMenu = By.xpath("//form/div[4]//select");
    private By phoneField = By.id("phone");
    private By passwordField1 = By.id("password");
    private By passwordField2 = By.id("confirm_password");
    private By acceptTerms = By.id("terms");
    private By createAccountButton = By.xpath("//button[@type='submit']");
    private By nameErrorMessage = By.xpath("//p[@class='ms-1 mt-1.5 w-full text-sm text-[red]']");

    // Constructor
    public RegistrationPage(WebDriver driver){
        this.driver = driver;
    }

    //Methods
    public void setUsername(String username){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(nameField));
        driver.findElement(nameField).sendKeys(username);
    }
    public void setEmail(String email){
        driver.findElement(emailField).sendKeys(email);
    }
    public void selectCountry(String option1){
        Select select = new Select(driver.findElement(countryMenu));
        select.selectByVisibleText(option1);
    }
    public List<String> getSelectedCountry(){
        Select select = new Select(driver.findElement(countryMenu));
        List<WebElement> selectedElements = select.getAllSelectedOptions();
        List<String> selectedOptions = new ArrayList<>();
        for(WebElement element:selectedElements){
            selectedOptions.add(element.getText());
        }
        return selectedOptions;
    }
    public void selectGovernment(String option2){
        Select select = new Select(driver.findElement(governmentMenu));
        select.selectByVisibleText(option2);
    }
    public List<String> getSelectedGovernment(){
        Select select = new Select(driver.findElement(governmentMenu));
        List<WebElement> selectedElements = select.getAllSelectedOptions();
        List<String> selectedOptions = new ArrayList<>();
        for(WebElement element:selectedElements){
            selectedOptions.add(element.getText());
        }
        return selectedOptions;
    }
    public void selectGender(String option3){
        Select select = new Select(driver.findElement(genderMenu));
        select.selectByVisibleText(option3);
    }
    public List<String> getSelectedGender(){
        Select select = new Select(driver.findElement(genderMenu));
        List<WebElement> selectedElements = select.getAllSelectedOptions();
        List<String> selectedOptions = new ArrayList<>();
        for(WebElement element:selectedElements){
            selectedOptions.add(element.getText());
        }
        return selectedOptions;
    }
    public void setPhoneNumber(String phoneNumber){
        driver.findElement(phoneField).sendKeys(phoneNumber);
    }
    public void setPassword(String password){
        driver.findElement(passwordField1).sendKeys(password);
    }
    public void setPasswordConfirm(String passwordConfirm){
        driver.findElement(passwordField2).sendKeys(passwordConfirm);
    }
    public void selectTerms(){
        driver.findElement(acceptTerms).click();
    }
    public void createAccount(){
        driver.findElement(createAccountButton).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(nameErrorMessage));
    }
    public String errorMessage(){
        return driver.findElement(nameErrorMessage).getText();
    }
}
