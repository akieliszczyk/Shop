package pages;

import graphql.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "slider_row")
    private WebElement mainWindow;

    @FindBy(xpath = "//a[@class='login']")
    private WebElement buttonSignIn;

    @FindBy(id = "contact-link")
    private WebElement buttonContact;

    @FindBy(id = "block_top_menu")
    private WebElement barCategories;



    public HomePage isOpened() {
        Assert.assertTrue(mainWindow.isDisplayed());
        return this;
    }

    public SignInPage openSignInPage() {
        buttonSignIn.click();
        return new SignInPage(driver);
    }

}
