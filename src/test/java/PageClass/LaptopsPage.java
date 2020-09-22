package PageClass;

import Base.TestBase;
import Utilities.SeleniumUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LaptopsPage extends TestBase {

    public static WebDriver driver;
    SeleniumUtils seleniumUtils;

    @FindBy(xpath = "//div/h4/a[@class=\"hrefch\" and text()=\"Sony vaio i5\"]")
    private WebElement laptopSonyVaioi5;

    @FindBy(xpath = "//div/h4/a[@class=\"hrefch\" and text()=\"Dell i7 8gb\"]")
    private WebElement laptopDelli78gb;

    public LaptopsPage(WebDriver driver) {
        this.driver = driver;
        seleniumUtils = new SeleniumUtils(driver);
        PageFactory.initElements(driver, this);
    }

    public void clickLaptopSonyVaioI5(){
        seleniumUtils.click(laptopSonyVaioi5);
    }

    public void clickLaptopDelli78gb(){
        seleniumUtils.click(laptopDelli78gb);
    }

}
