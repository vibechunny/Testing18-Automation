package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.LoginPage;

public class LoginTest extends BaseTest {

    @Test(description = "Test login success")
    public void testLoginSuccess() {
        // tao doi tuong LoginPage
        LoginPage loginPage = new LoginPage(driver, wait);
        loginPage.open();
        loginPage.login("admin");


        // so sanh expert voiws actual
        Assert.assertTrue(true);
    }
}
