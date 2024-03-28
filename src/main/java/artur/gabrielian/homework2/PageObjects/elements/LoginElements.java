package artur.gabrielian.homework2.PageObjects.elements;

public enum LoginElements implements Elements {
    LOG_IN_SECTION("//input[@data-l='t,login_tab']"),
    LOGIN_FIELD("//input[@name='st.email']"),
    PASSWORD_FIELD("//input[@name='st.password']"),
    LOGIN_BUTTON("//input[@data-l='t,sign_in']"),
    LOGIN_ERROR_MESSAGE("//div[@class='input-e login_error']");

    private final String path;

    LoginElements(String path) {
        this.path = path;
    }

    @Override
    public String getElementPath() {
        return path;
    }
}