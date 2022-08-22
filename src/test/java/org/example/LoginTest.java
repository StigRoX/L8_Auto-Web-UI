package org.example;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverConditions.url;

public class LoginTest {
    @Given("открываем главную страницу сайта")
    public void открываемГлавнуюСтраницуСайта() {
        Configuration.timeout = 6000;
        open("https://www.cifrus.ru/basket.php");
    }

    @When("кликаем Личный кабинет")
    public void кликаемЛичныйКабинет() {
        new MainPage().showAuth();
    }

    @Then("кликаем Авторизация")
    public void кликаемАвторизация() {
        new MainPage().clickLogin();
    }

    @And("вводим имейл")
    public void вводимИмейл() {
        new LoginPage().inputEmail("vexeae@mailto.plus");
    }

    @And("вводим пароль")
    public void вводимПароль() {
        new LoginPage().inputPassword("8520go");
    }

    @And("кликаем Войти")
    public void кликаемВойти() {
        new LoginPage().clickLogin();
    }

    @Then("сверяем адрес личного кабинета")
    public void сверяемАдресЛичногоКабинета() {
        webdriver().shouldHave(url("https://www.cifrus.ru/account/profile"));
    }
//
//    @After(value = "close")
//    public void closeBrowser() {
//        Selenide.closeWebDriver();
//    }

}
