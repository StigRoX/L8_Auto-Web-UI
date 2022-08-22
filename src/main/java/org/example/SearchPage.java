package org.example;


import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Selenide.$;

public class SearchPage {

    @Step("локализация продукта по тегу")
    public String getFirstProductName() {
        SelenideElement element = $(By.className("product-thumb")).find(By.className("caption")).find(By.className("name"));
        return element.getText();
    }
}
