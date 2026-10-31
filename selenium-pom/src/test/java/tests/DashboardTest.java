package tests;

import org.testng.annotations.BeforeTest;

public class DashboardTest extends BaseTest {
    @BeforeTest
    public void preCondition() throws InterruptedException {
        LoginAsAdmin();
    }
}
