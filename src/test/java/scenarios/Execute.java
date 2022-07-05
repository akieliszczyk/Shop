package scenarios;

import config.BaseTest;
import org.apache.commons.lang3.builder.ToStringExclude;

import org.junit.Test;
import pages.HomePage;

public class Execute extends BaseTest {

    HomePage homePage;

    @Test
    public void ExecuteTest() {
        homePage = new HomePage(driver);
        homePage.isOpened()
                .findingElements();

    }
}
