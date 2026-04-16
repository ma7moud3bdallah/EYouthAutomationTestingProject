package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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
    private By joinUsButton = By.xpath("//a[contains(text(),'أنضم')]");
    private By registerButton = By.xpath("//a[@class='relative ms-0']/following-sibling::a[2]");
    private By loginButton = By.xpath("//a[@class='relative ms-0']/following-sibling::a[1]");
    private By trainingCourses = By.xpath("//a[text()='الدورات التدريبية']");

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
    public RegistrationPage joinUs(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(joinUsButton));
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView({block:'center'});",driver.findElement(joinUsButton));
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(joinUsButton).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='text-secondary']/following-sibling::a")));
        return new RegistrationPage(driver);
    }
    public RegistrationPage registerPage(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(registerButton));
        driver.findElement(registerButton).click();
        return new RegistrationPage(driver);
    }
    public LoginPage loginPage(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(loginButton));
        driver.findElement(loginButton).click();
        return new LoginPage(driver);
    }
    public TrainingCoursesPage trainingCourses(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(trainingCourses));
        driver.findElement(trainingCourses).click();
        return new TrainingCoursesPage(driver);
    }
}
