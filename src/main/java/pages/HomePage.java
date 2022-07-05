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

    WebElement buttonSignIn = driver.findElement(By.xpath("//div/a[@class='login']"));

    @FindBy(id = "contact-link")
    private WebElement buttonContact;

    @FindBy(id = "block_top_menu")
    private WebElement barCategories;



    public HomePage isOpened() {
        Assert.assertTrue(mainWindow.isDisplayed());
        return this;
    }

    public HomePage findingElements() {
        Assert.assertTrue(mainWindow.isDisplayed());
        System.out.println("Main window is displayed");
        Assert.assertTrue(buttonSignIn.isDisplayed());
        System.out.println("Button Sing in is displayed");
        Assert.assertTrue(buttonContact.isDisplayed());
        System.out.println("Button contact is displayed");
        Assert.assertTrue(barCategories.isDisplayed());
        System.out.println("Button categories is displayed");
        return this;
    }
}
