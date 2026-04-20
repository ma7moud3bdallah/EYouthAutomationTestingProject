package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;
import java.awt.*;

public class BaseTest {
    // Fields
    protected WebDriver driver;
    protected HomePage homePage;

    // Methods
    @BeforeMethod
    public void goHome(){
        driver = new ChromeDriver();
        driver.get("https://eyouthlearning.com/ar");
        homePage = new HomePage(driver);
    }
    @AfterMethod
    public void tearDown(){
//        driver.close();
    }
}
