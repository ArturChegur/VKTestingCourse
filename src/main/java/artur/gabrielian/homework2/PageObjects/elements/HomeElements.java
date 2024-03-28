package artur.gabrielian.homework2.PageObjects.elements;

public enum HomeElements implements Elements {
    PARAMS_WILL_BE_ADDED_SOON("");

    private final String path;

    HomeElements(String path) {
        this.path = path;
    }

    @Override
    public String getElementPath() {
        return path;
    }
}