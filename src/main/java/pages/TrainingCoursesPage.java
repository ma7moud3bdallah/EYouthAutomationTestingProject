package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TrainingCoursesPage {
    // Fields
    private WebDriver driver;
    private By courseSubscribeButton = By.xpath("//div[@class='border-light-blue flex h-auto flex-col rounded-2xl border !bg-white p-4 basis-[450px]'][5]/div[2]/button[1]");

    // Constructor
    public TrainingCoursesPage(WebDriver driver){
        this.driver = driver;
    }
    // Methods
    public CartPage subscribeToCourse(){
        driver.findElement(courseSubscribeButton).click();
        return new CartPage(driver);
    }
}
