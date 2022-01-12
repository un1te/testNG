package all;

import com.BaseTest;
import com.codeborne.selenide.Selenide;
import com.pages.Login;
import io.qameta.allure.Description;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
    Login loginPage = new Login();

    @Test
    @Description("Login with credentials")
    public void logIn() {
        openUrl("");
        loginPage.loginWithCredentials("unite699@gmail.com", "pass123");
        loginPage.checkUserLoggedIn();

    }

    @Test
    @Description("Logout")
    public void logOut() {
        loginPage.logout();
    }

}
