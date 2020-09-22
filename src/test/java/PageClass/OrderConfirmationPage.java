package PageClass;

import Base.TestBase;
import Utilities.SeleniumUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderConfirmationPage extends TestBase {

    public static WebDriver driver;
    SeleniumUtils seleniumUtils;

    @FindBy(xpath = "//p[@class=\"lead text-muted \" and contains(text(),\"Id\")]")
    private WebElement purchaseID;

    @FindBy(xpath = "//div/button[@class=\"confirm btn btn-lg btn-primary\"and text()=\"OK\"]")
    private WebElement okButton;

    public OrderConfirmationPage(WebDriver driver) {
        this.driver = driver;
        seleniumUtils = new SeleniumUtils(driver);
        PageFactory.initElements(driver, this);
    }

    public String getPurchaseID(){
        String id = seleniumUtils.getData(purchaseID);
        return id;
    }

    public void clickOkButton(){
        seleniumUtils.click(okButton);
    }

}
