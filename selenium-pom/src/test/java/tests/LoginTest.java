package tests;

import com.google.gson.Gson;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import page.LoginPage;
import utils.ConfigReader;

import java.io.InputStreamReader;

public class LoginTest extends BaseTest {

    record  LoginData(String username, String password, boolean expectedResult){}
    @DataProvider(name = "LoginData")
    public Object[][] GetLoginData(){
        InputStreamReader reader = new InputStreamReader(
                LoginTest.class.getResourceAsStream("/login-data.json")
        );

        LoginData[] list = new Gson().fromJson(reader, LoginData[].class);
        Object[][] dataLogin = new Object[list.length][1];
        for (int i = 0; i < list.length; i++) {
            dataLogin[i][0] =  list[i];
        }

        return dataLogin;
    }

    @Test(description = "Test login success")
    public void testLoginSuccess() throws InterruptedException {
        // tao doi tuong LoginPage
        LoginPage loginPage = new LoginPage(driver, wait);
        loginPage.open();
        loginPage.login(ConfigReader.get("username"), ConfigReader.get("password"));


        // so sanh expert voiws actual
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("dashboard"));
    }

    @Test(dataProvider = "LoginData")
    public void testLoginData(LoginData data) throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver, wait);
        loginPage.open();
        loginPage.login(data.username(), data.password());

        Thread.sleep(2000);
        Assert.assertEquals(driver.getCurrentUrl().contains("dashboard"), data.expectedResult());
    }
}
