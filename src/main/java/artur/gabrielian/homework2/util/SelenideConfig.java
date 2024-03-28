package artur.gabrielian.homework2.util;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;

import static com.codeborne.selenide.Selenide.closeWebDriver;

public final class SelenideConfig {
    public static void beforeTest() {
        Configuration.browser = "chrome";
        Configuration.baseUrl = "https://ok.ru/";
        Configuration.headless = true;
        Selenide.open("/");
    }

    public static void afterTest() {
        closeWebDriver();
    }
}