package com.Pages;

import com.BaseTest;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.closeWebDriver;

public class Google extends BaseTest {
    private SelenideElement searchResult = $(By.xpath("//h3"));

    public void searchInGoogle(String text) {
        openUrl("");
        $(By.name("q")).setValue(text);
        $(By.name("q")).pressEnter();
        searchResult.shouldHave(text(text));

    }

    public void verifySearchResults(String text) {
        searchResult.shouldHave(text(text));

    }

}
