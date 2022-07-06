package pages;

import graphql.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage extends BasePage {

    public SignInPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(xpath = "//h1[@class='page-heading']")
    private WebElement mainWindow;

    @FindBy(id = "email_create")
    private WebElement textboxEmailCreate;

    @FindBy(id = "SubmitCreate")
    private WebElement buttonCreateAccount;

    @FindBy(id = "email")
    private WebElement textboxEmail;

    @FindBy(id = "passwd")
    private WebElement textboxPassword;

    @FindBy(id = "SubmitLogin")
    private WebElement buttonSignIn2;

    @FindBy(xpath = "//div//a[@title='Recover your forgotten password']")
    private WebElement linkForgotPassword;
    
}
