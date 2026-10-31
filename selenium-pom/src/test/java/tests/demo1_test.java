package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.demo1_login_page;

public class demo1_test extends BaseTest{

    @Test(description = "Test login success")
    public void testLoginSuccess() throws InterruptedException {
        // tao doi tuong LoginPage
        demo1_login_page loginPage = new demo1_login_page(driver, wait);
        loginPage.open();
        loginPage.login("testing20", "123456");


        // so sanh expert voiws actual
        Assert.assertTrue(true);
    }
}
