package artur.gabrielian.homework2.PageObjects.pages;

import artur.gabrielian.homework2.PageObjects.elements.Elements;

public interface Page {
    void checkPage();

    void fillField(Elements elements, String data);

    void pressButton(Elements elements);
}
