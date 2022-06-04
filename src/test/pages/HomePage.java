package pages;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {
    protected WebDriver driver;

    public HomePage(WebDriver driver){
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "php-travels")
    public WebElement phpTravelLink;

    @FindBy(id = "mercury-tours")
    public WebElement mercurylLink;

    @FindBy(id = "internet")
    public WebElement internetLink;

    @FindBy(id = "e-commerce")
    public WebElement ecommerceLink;

    @FindBy(id = "passion-tea-company")
    public WebElement teaLink;

    @FindBy(id = "sauce-demo")
    public WebElement saucedemoLink;

    @FindBy(id = "shopping-cart")
    public WebElement shoppingLink;

}
