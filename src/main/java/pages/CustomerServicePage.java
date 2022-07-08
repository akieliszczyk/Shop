package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CustomerServicePage extends BasePage {

    public CustomerServicePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "center_column")
    private WebElement mainwindow;


}
