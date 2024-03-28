package artur.gabrielian.homework2.PageObjects.pages;

import artur.gabrielian.homework2.PageObjects.elements.Elements;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class HomePage implements Page {

    @Override
    public void checkPage() {
        //later
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