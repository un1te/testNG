package all;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class Test3  {

        @Test
        public void test3() {
            System.out.println("Fail");
            Assert.assertEquals("one", "two");

        }

    @Test (groups = {"smoke"})
    public void googleSearch2() {
        open("http://google.com");
        $(By.name("q")).setValue("johny");
        $(By.name("q")).pressEnter();
        $(By.xpath("//h2[@data-attrid=\"title\"]//span")).shouldHave(text("johny"));
        closeWebDriver();
    }
    }

