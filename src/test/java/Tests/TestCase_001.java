package Tests;

import Base.TestBase;
import PageClass.*;
import Utilities.SeleniumUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase_001 extends TestBase {

    @Test
    public void placeOrder() throws InterruptedException {

        SeleniumUtils seleniumUtils = new SeleniumUtils(driver);
        HomePage hPage = new HomePage(driver);
        LaptopsPage lPage = new LaptopsPage(driver);
        ProductPage pPage = new ProductPage(driver);
        CartPage cPage = new CartPage(driver);
        CustomerDetailsPage cdPage = new CustomerDetailsPage(driver);
        OrderConfirmationPage ocPage = new OrderConfirmationPage(driver);

        //Step 1: Traverse through all the categories
        hPage.clickCategoriesPhone();
        hPage.clickCategoriesLaptop();
        hPage.clickCategoriesMonitors();

        //Step 2: Click on Laptops in categories and add Sony Laptop in Cart
        hPage.clickCategoriesLaptop();
        lPage.clickLaptopSonyVaioI5();
        pPage.clickAddToCartButton();
        seleniumUtils.acceptAlert();

        //Step 3: Click on Laptops in categories and add Sony Laptop in Cart
        hPage.clickHomeNavigation();
        hPage.clickCategoriesLaptop();
        lPage.clickLaptopDelli78gb();
        pPage.clickAddToCartButton();
        seleniumUtils.acceptAlert();

        //Step 4: Navigate to cart and delete Dell i7 8gb
        hPage.clickCartNavigation();
        cPage.deleteDelli78gb();
        Thread.sleep(3000);

        //Step 5: Place the order
        String totalPrice = cPage.gettotalAmount();
        cPage.clickPlaceOrderButton();

        //Step 6: Fill all customer details
        cdPage.enterName("Parag");
        cdPage.enterCountry("India");
        cdPage.enterCity("Gurgaon");
        cdPage.enterCreditCard("123456780909");
        cdPage.enterYear("2025");
        cdPage.enterMonth("09");

        //Step 7: Click Purchase
        cdPage.clickPurchaseButton();

        //Step 8: Capture and log purchase ID and Amount
        String lines[] = ocPage.getPurchaseID().split("\\r?\\n");
        logger.info("Purchase ID: "+lines[0]);
        logger.info("Purchase Amount: "+lines[1]);

        //Step 9: Asset purchase amount and click OK
        Assert.assertEquals(lines[1],"Amount: "+totalPrice+" USD","Purchase Amount not equal");
        ocPage.clickOkButton();

    }

}