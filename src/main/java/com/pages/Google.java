package com.pages;

import com.BaseTest;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;


public class Google extends BaseTest {
    private SelenideElement searchResult = $(By.xpath("//h3")),
                            getSearchResult = $(By.xpath(""));

    @Step ("Search in google")
    public void searchInGoogle(String text) {
        openUrl("");
        $(By.name("q")).setValue(text);
        $(By.name("q")).pressEnter();
        searchResult.shouldHave(text(text));

    }
    @Step ("Validate search results")
    public void verifySearchResults(String text) {
        searchResult.shouldHave(text(text));

    }

}
