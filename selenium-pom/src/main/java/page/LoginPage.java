package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage{

    //input[@name='username']
    private static final By INPUT_USERNAME = By.xpath("//input[@name='username']");
    private static final By INPUT_PASSWORD = By.xpath("//input[@name='password']");
    private static final By LOGIN_BTN = By.xpath("//button[@type='submit']");
    public LoginPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    // step 1: truy cap web
    public void open() {
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        // fix loi web load cham
        wait.until(ExpectedConditions.visibilityOfElementLocated(INPUT_USERNAME));
    }

    // step 2: login
//    enterUsername, enterPassword, clickLoginBtn
//    2 cach viet
//    cach 1: tach tung step thanh tung function
//    UU DIEM: de dang them log kiem tra, de sua
//    c2: gom cac step vo chung 1 function

    public void login(String username, String password) throws InterruptedException {
        WebElement usernameInput = driver.findElement(INPUT_USERNAME);
        WebElement passwordInput = driver.findElement(INPUT_PASSWORD);
        WebElement loginBtn = driver.findElement(LOGIN_BTN);
        usernameInput.sendKeys(username);
        Thread.sleep(2000);
        passwordInput.sendKeys(password);
        Thread.sleep(2000);
        loginBtn.click();
        Thread.sleep(5000);
    }
}
