package stream18_Owner.landing_page_test;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;

public class PageObjects {
    private final SelenideElement objectTextLending = $x("//h1[@class='block-header__headline']" +
            "//span[@class='block-header__headline-text']");

    @Step("Открытие странице")
    public PageObjects openPage() {
        open("https://www.1-ofd.ru/");
        return this;
    }

    @Step("Текст на основной странице")
    public PageObjects textLending(String value, String value2) {
        objectTextLending.shouldHave(text(value), text(value2));
        return this;
    }

}

