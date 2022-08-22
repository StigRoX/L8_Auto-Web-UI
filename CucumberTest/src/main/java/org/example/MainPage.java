package org.example;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class MainPage {
    private SelenideElement auth_menu = $(By.xpath("//*[contains(text(), 'Личный')]"));
    private SelenideElement login_button = $(By.xpath("//*[contains(text(), 'Авторизация')]"));
    private SelenideElement search_box = $(By.id("search_box"));
    private SelenideElement search_button = $(By.xpath("//button[@type='submit']"));
    private SelenideElement product = $(By.className("product-thumb"));


    @Step("кликаем Личный кабинет")
    public MainPage showAuth() {
        auth_menu.click();
        return page(MainPage.class);
    }

    @Step("кликаем Авторизация")
    public MainPage clickLogin() {
        this.login_button.click();
        return page(MainPage.class);
    }

    @Step("вводим поисковой запрос")
    public MainPage inputSearchQuery(String query) {
        search_box.sendKeys(query);
        return page(MainPage.class);
    }

    @Step("кликаем кнопку поиска")
    public MainPage search() {
        this.search_button.click();
        return page(MainPage.class);
    }

    public SelenideElement getFirstProduct() {
        return page(MainPage.class).product;
    }

    @Step("локализация продукта на главной странице")
    public String getProductName(SelenideElement product) {
        return product.find(By.className("caption")).findElement(By.className("name")).getText();
    }

    @Step("добавляем в корзину")
    public MainPage addToCart(SelenideElement product) {
        product.find(By.xpath("//button[contains(text(), 'В корзину')]")).click();
        return this;
    }


}
