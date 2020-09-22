package PageClass;

import Base.TestBase;
import Utilities.SeleniumUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CartPage extends TestBase {

    public static WebDriver driver;
    SeleniumUtils seleniumUtils;

    @FindBy(xpath = "//tr[td[text()=\"Dell i7 8gb\"]]/td/a[text()=\"Delete\"]")
    private WebElement deleteLink;

    @FindBy(xpath = "//tr[td[text()=\"Dell i7 8gb\"]]/td/a[text()=\"Delete\"]")
    private WebElement deleteSonyLink;

    @FindBy(xpath = "//div/button[@class=\"btn btn-success\" and text()=\"Place Order\"]")
    private WebElement placeOrderButton;

    @FindBy(xpath = "//div/h3[@id=\"totalp\"]")
    private WebElement totalAmount;



    public CartPage(WebDriver driver) {
        this.driver = driver;
        seleniumUtils = new SeleniumUtils(driver);
        PageFactory.initElements(driver, this);
    }

    public void deleteDelli78gb(){
        seleniumUtils.click(deleteLink);
    }

    public void clickPlaceOrderButton(){
        seleniumUtils.click(placeOrderButton);
    }

    public String gettotalAmount(){
        String amount = seleniumUtils.getData(totalAmount);
        return amount;
    }

}
