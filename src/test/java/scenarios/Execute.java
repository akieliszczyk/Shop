package scenarios;

import config.BaseTest;
import org.apache.commons.lang3.builder.ToStringExclude;


import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.HomePage;

public class Execute extends BaseTest {

    HomePage homePage;


    @Tag("Smoke")
    @Test
    public void ExecuteTest() {
        homePage = new HomePage(driver);
        homePage.isOpened()
                .openSignInPage();

    }
}
