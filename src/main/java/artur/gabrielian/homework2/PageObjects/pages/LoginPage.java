package artur.gabrielian.homework2.PageObjects.pages;

import artur.gabrielian.homework2.PageObjects.elements.Elements;
import artur.gabrielian.homework2.PageObjects.elements.LoginElements;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage implements Page {
    @Override
    public void checkPage() {
        $(By.xpath(LoginElements.LOG_IN_SECTION.getElementPath())).shouldBe();
        $(By.xpath(LoginElements.LOGIN_FIELD.getElementPath())).shouldBe();
        $(By.xpath(LoginElements.PASSWORD_FIELD.getElementPath())).shouldBe();
        $(By.xpath(LoginElements.LOGIN_BUTTON.getElementPath())).shouldBe();
    }

    @Override
    public void fillField(Elements field, String data) {
        $(By.xpath(field.getElementPath())).setValue(data);
    }

    @Override
    public void pressButton(Elements button) {
        $(By.xpath(button.getElementPath())).click();
    }

    public void isElementExists(Elements element) {
        $(By.xpath(element.getElementPath())).shouldBe();
    }
}