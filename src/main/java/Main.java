import com.codeborne.selenide.Configuration;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;

public class Main {

    @BeforeTest
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
//        ChromeOptions options = new ChromeOptions();
//        options.setPageLoadStrategy(PageLoadStrategy.NONE);
        System.setProperty("selenide.browser", "Chrome");
        Configuration.timeout = 6000;
        Configuration.holdBrowserOpen = false;
        Configuration.browser = "chrome";
        Configuration.browserSize = "1900x1000";
        Configuration.savePageSource = false;
//        Configuration.screenshots = true;
    }
}
