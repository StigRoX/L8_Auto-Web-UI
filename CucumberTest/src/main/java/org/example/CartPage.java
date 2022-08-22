package org.example;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;

public class CartPage {
    private SelenideElement firstProduct = $(By.xpath("//table[contains(@class, 'simplecheckout-cart')]/tbody/tr"));

    @Step("локализация продукта в корзине")
    public String getFirstProductName() {
        return firstProduct.find(By.className("name")).getText();
    }
}
