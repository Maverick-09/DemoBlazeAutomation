package PageClass;

import Base.TestBase;
import Utilities.SeleniumUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends TestBase {

    public static WebDriver driver;
    SeleniumUtils seleniumUtils;

    @FindBy(xpath = "//div/a[@class=\"list-group-item\" and text()=\"Phones\"]")
    private WebElement categoriesPhone;

    @FindBy(xpath = "//div/a[@class=\"list-group-item\" and text()=\"Laptops\"]")
    private WebElement categoriesLaptops;

    @FindBy(xpath = "//div/a[@class=\"list-group-item\" and text()=\"Monitors\"]")
    private WebElement categoriesMonitors;

    @FindBy(xpath = "//ul/li/a[@class=\"nav-link\" and text()=\"Home \"]")
    private WebElement navigationHome;

    @FindBy(xpath = "//ul/li/a[@id=\"cartur\" and text()=\"Cart\"]")
    private WebElement navigationCart;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        seleniumUtils = new SeleniumUtils(driver);
        PageFactory.initElements(driver, this);
    }

    public void clickCategoriesPhone(){
        seleniumUtils.click(categoriesPhone);
    }

    public void clickCategoriesLaptop(){
        seleniumUtils.click(categoriesLaptops);
    }

    public void clickCategoriesMonitors(){
        seleniumUtils.click(categoriesMonitors);
    }

    public void clickHomeNavigation(){
        seleniumUtils.click(navigationHome);
    }

    public void clickCartNavigation(){
        seleniumUtils.click(navigationCart);
    }
}
