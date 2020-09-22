package PageClass;

import Base.TestBase;
import Utilities.SeleniumUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomerDetailsPage extends TestBase {

    public static WebDriver driver;
    SeleniumUtils seleniumUtils;

    @FindBy(xpath = "//div/input[@id=\"name\"]")
    private WebElement inputName;

    @FindBy(xpath = "//div/input[@id=\"country\"]")
    private WebElement inputCountry;

    @FindBy(xpath = "//div/input[@id=\"city\"]")
    private WebElement inputCity;

    @FindBy(xpath = "//div/input[@id=\"card\"]")
    private WebElement inputCreditCard;

    @FindBy(xpath = "//div/input[@id=\"month\"]")
    private WebElement inputMonth;

    @FindBy(xpath = "//div/input[@id=\"year\"]")
    private WebElement inputYear;

    @FindBy(xpath = "//div/button[@class=\"btn btn-primary\" and text()=\"Purchase\"]")
    private WebElement purchaseButton;


    public CustomerDetailsPage(WebDriver driver) {
        this.driver = driver;
        seleniumUtils = new SeleniumUtils(driver);
        PageFactory.initElements(driver, this);
    }

    public void enterName(String name){
        seleniumUtils.sendkeys(inputName, name);
    }

    public void enterCountry(String country){
        seleniumUtils.sendkeys(inputCountry, country);
    }

    public void enterCity(String city){
        seleniumUtils.sendkeys(inputCity, city);
    }

    public void enterCreditCard(String cardNumber){
        seleniumUtils.sendkeys(inputCreditCard, cardNumber);
    }

    public void enterMonth(String month){
        seleniumUtils.sendkeys(inputMonth, month);
    }

    public void enterYear(String year){
        seleniumUtils.sendkeys(inputName, year);
    }

    public void clickPurchaseButton(){
        seleniumUtils.click(purchaseButton);
    }

}
