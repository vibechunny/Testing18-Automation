package page;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
//    giup tuong tac tren website nhu truy cap page, fill value
    protected WebDriver driver;
//    giup tim kiem locator de dang hon, tranh FLAKY TEST
    protected WebDriverWait wait;
//    thuoc tinh de chen code javascript giup tuong tac tren website
    protected JavascriptExecutor js;

    public BasePage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
        js = (JavascriptExecutor) driver;
    }

}
