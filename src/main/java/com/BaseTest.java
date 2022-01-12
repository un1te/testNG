package com;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import static com.codeborne.selenide.Selenide.open;

public class BaseTest {

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

    @AfterTest
    public void close() {
        Selenide.closeWebDriver();
    }

    public static void openUrl(String url) {
        open(Config.BASE_URL + url);


    }

}
