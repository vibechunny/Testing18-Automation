package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class demo1_login_page extends BasePage {
    private static final By LOGIN_HREF = By.xpath("//a[@href='/sign-in']");
    private static final By INPUT_USERNAME = By.xpath("//input[@id='taiKhoan']");
    private static final By INPUT_PASSWORD = By.xpath("//input[@id='matKhau']");
    private static final By LOGIN_BTN = By.xpath("//button[@type='submit']");

    public demo1_login_page(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public void open() throws InterruptedException {
        driver.get("https://demo1.cybersoft.edu.vn/");
        wait.until(ExpectedConditions.visibilityOfElementLocated(LOGIN_HREF));
        WebElement href = driver.findElement(LOGIN_HREF);
        href.click();
        Thread.sleep(2000);

    }

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
