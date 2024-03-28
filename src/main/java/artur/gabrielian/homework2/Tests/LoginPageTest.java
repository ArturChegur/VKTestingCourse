package artur.gabrielian.homework2.Tests;

import artur.gabrielian.homework2.PageObjects.pages.LoginPage;
import artur.gabrielian.homework2.PageObjects.elements.LoginElements;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LoginPageTest extends AbstractTest {
    private LoginPage loginPage;

    @BeforeEach
    public void init() {
        loginPage = new LoginPage();
    }

    @Test
    public void testPage() {
        loginPage.checkPage();
    }

    @Test
    public void testLoginFill() {
        loginPage.fillField(LoginElements.LOGIN_FIELD, "login");
    }

    @Test
    public void testPasswordFill() {
        loginPage.fillField(LoginElements.PASSWORD_FIELD, "password");
    }

    @Test
    public void testLoginError() {
        loginPage.fillField(LoginElements.LOGIN_FIELD, "login");
        loginPage.pressButton(LoginElements.LOGIN_BUTTON);
        loginPage.isElementExists(LoginElements.LOGIN_ERROR_MESSAGE);
    }
}