package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyInfoPage extends BasePage {
    public MyInfoPage(WebDriver driver, WebDriverWait wait) { super(driver, wait); }
        private static final By AVATAR_IMAGE = By.xpath("//image[@class='employee-image']");
        private static final By UPLOAD_BTN = By.xpath("//button[contains(@class, 'employee-image-action']");
        private static final By FILE_INPUT = By.xpath("//input[@type='file']");
        private static final By SAVE_BTN = By.xpath("//button[@type='submit']");
        private static final By SUCCESS_TOAST = By.id("oxd-toaster_1");









}
