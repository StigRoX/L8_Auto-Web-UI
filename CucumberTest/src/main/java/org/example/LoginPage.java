package org.example;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class LoginPage {
    private SelenideElement email_field = $(By.name("email"));
    private SelenideElement password_field = $(By.name("password"));
    private SelenideElement login_button = $(By.xpath("//a[contains(text(), 'Войти')]"));

    @Step("вводим имейл")
    public LoginPage inputEmail(String email) {
        email_field.sendKeys(email);
        return page(LoginPage.class);
    }
    @Step("вводим пароль")
    public LoginPage inputPassword(String password) {
        password_field.sendKeys(password);
        return page(LoginPage.class);
    }
    @Step("кликаем Войти")
    public LoginPage clickLogin() {
        login_button.click();
        return page(LoginPage.class);
    }

}
