//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Sample for automation test");

        LoginPage loginPage = new LoginPage();
        loginPage.login("admin", "admin@123");
    }
}