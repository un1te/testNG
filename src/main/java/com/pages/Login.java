package com.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class Login {
        private final SelenideElement loginIcon = $(By.xpath("//ul[contains(@class,'navbar-right')]//li/a[@href='/client/user/signin']")),
        emailField = $(By.id("login-form-login")),
        passField = $(By.id("login-form-password")),
        submitButton = $(By.xpath("//button[@type='submit']")),
        logoutIcon = $(By.xpath("//ul[contains(@class,'navbar-right')]//li/a[@href='/client/user/logout']"));


    public void loginWithCredentials(String email, String pass) {
        loginIcon.click();
        emailField.sendKeys(email);
        passField.sendKeys(pass);
        submitButton.click();
    }

    public void checkUserLoggedIn() {
        logoutIcon.shouldBe(visible);
        loginIcon.shouldNotBe(visible);
    }

    public void logout() {
        logoutIcon.click();
        logoutIcon.shouldNotBe(visible);
    }
}
