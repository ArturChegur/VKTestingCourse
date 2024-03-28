package artur.gabrielian.homework2.Tests;

import artur.gabrielian.homework2.util.SelenideConfig;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public abstract class AbstractTest {

    @BeforeEach
    public final void beforeTest(){
        SelenideConfig.beforeTest();
    }

    @AfterEach
    public final void afterTest() {
        SelenideConfig.afterTest();
    }
}