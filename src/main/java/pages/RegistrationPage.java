package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class RegistrationPage {
    // Fields
    private WebDriver driver;
    private By nameField = By.id("name");
    private By emailField = By.id("email");
    private By countryMenu = By.xpath("//div[@class='grid grid-cols-2 gap-4']//button[@aria-controls='radix-_r_4qf_']");
    private By governmentMenu = By.xpath("//div[@class='grid grid-cols-2 gap-4']//button[@aria-controls='radix-_r_4qg_']");
    private By genderMenu = By.xpath("//button[@aria-controls='radix-_r_4qh_']");
    private By phoneField = By.id("phone");
    private By passwordField1 = By.id("password");
    private By passwordField2 = By.id("confirm_password");
    private By acceptTerms = By.id("terms");
    private By createAccountButton = By.xpath("//button[@type='submit']");


    // Constructor
    public RegistrationPage(WebDriver driver){
        this.driver = driver;
    }

    //Methods
    public void setUsername(String username){
        driver.findElement(nameField).sendKeys(username);
    }
    public void setEmail(String email){
        driver.findElement(nameField).sendKeys(email);
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
        Select select = new Select(driver.findElement(governmentMenu));
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
    }
}
