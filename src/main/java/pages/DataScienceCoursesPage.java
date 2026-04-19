package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DataScienceCoursesPage {
    // Fields
    private WebDriver driver;
    private By subscribeButton = By.xpath("//div[@class='border-light-blue flex h-auto flex-col rounded-2xl border !bg-white p-4 basis-[450px]'][1]/div[2]/button[1]");

    // Constructor
    public DataScienceCoursesPage(WebDriver driver){
        this.driver = driver;
    }

    // Methods
    public CartPage clickSubscribeButton(){
        driver.findElement(subscribeButton).click();
        return new CartPage(driver);
    }
}
