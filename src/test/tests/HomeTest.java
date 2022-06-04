package tests;

import base.BaseTest;
import dataProvider.*;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import utils.SeleniumUtils;

public class HomeTest extends BaseTest {
    HomePage homePage;

    @BeforeMethod
    public void localSetUp(){

        homePage = new HomePage(getDriver());
    }
    @Test(dataProvider = "expectedTitle1", dataProviderClass = DataProviders1.class)
    public void testAllLinks01(String expectedTitle){
        homePage.click(homePage.phpTravelLink);
        String actualTitle = SeleniumUtils.switchToWindowAndVerifyTitle(getDriver(), extentManager);
        Assert.assertEquals(actualTitle, expectedTitle);
    }

    @Test(dataProvider = "expectedTitle2", dataProviderClass = DataProviders2.class)
    public void testAllLinks02(String expectedTitle){
        homePage.click(homePage.mercurylLink);
        String actualTitle = SeleniumUtils.switchToWindowAndVerifyTitle(getDriver(), extentManager);
        Assert.assertEquals(actualTitle, expectedTitle);
    }

    @Test(dataProvider = "expectedTitle3", dataProviderClass = DataProviders3.class)
    public void testAllLinks03(String expectedTitle){
        homePage.click(homePage.internetLink);
        String actualTitle = SeleniumUtils.switchToWindowAndVerifyTitle(getDriver(), extentManager);
        Assert.assertEquals(actualTitle, expectedTitle);
    }

    @Test(dataProvider = "expectedTitle4", dataProviderClass = DataProviders4.class)
    public void testAllLinks04(String expectedTitle){
        homePage.click(homePage.ecommerceLink);
        String actualTitle = SeleniumUtils.switchToWindowAndVerifyTitle(getDriver(), extentManager);
        Assert.assertEquals(actualTitle, expectedTitle);
    }

    @Test(dataProvider = "expectedTitle5", dataProviderClass = DataProviders5.class)
    public void testAllLinks05(String expectedTitle){
        homePage.click(homePage.teaLink);
        String actualTitle = SeleniumUtils.switchToWindowAndVerifyTitle(getDriver(), extentManager);
        Assert.assertEquals(actualTitle, expectedTitle);
    }



}
