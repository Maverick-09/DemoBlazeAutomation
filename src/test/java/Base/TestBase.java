package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

public class TestBase {

    protected WebDriver driver;
    public Logger logger = Logger.getLogger("OnlineShopping");

    @BeforeTest
    public void LaunchBrowser() {
        try {
            System.setProperty("webdriver.chrome.driver", "C:\\More\\DemoOnlineShop\\Drivers\\chromedriver.exe");
            driver = new ChromeDriver();
            logger.info("Drivers Initialised");

            driver.get("https://www.demoblaze.com/index.html");
            logger.info("Browser Opened");
            driver.manage().window().maximize();
            logger.info("Window Maximized");
        }catch (Exception e){
            e.printStackTrace();
        }

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @AfterTest
    public void CloseBrowser() {

        driver.quit();
        logger.info("Execution Completed");

    }

}
