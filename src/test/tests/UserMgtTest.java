package tests;

import base.BaseTest;
import dataProvider.DataProviders10;
import dataProvider.DataProviders2;
import dataProvider.DataProviders8;
import dataProvider.DataProviders9;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.UserMgtPage;
import utils.SeleniumUtils;

public class UserMgtTest extends BaseTest {
    UserMgtPage userMgtPage;
    HomePage homePage;

    @BeforeMethod
    public void localSetUp(){

        userMgtPage = new UserMgtPage(getDriver());
        homePage = new HomePage(getDriver());
    }

    @Test(testName = "Test07-User DB")
    public void userDBTitle() {
    homePage.click(homePage.UserMgtBtn);
    userMgtPage.click(userMgtPage.AccessDBBtn);
        String actualTitle = SeleniumUtils.switchToWindowAndVerifyTitle(getDriver(), extentManager);
        Assert.assertEquals(actualTitle, "User DB");
    }

    @Test(dataProvider = "userInfo1", dataProviderClass = DataProviders8.class)
    public void testUserRole01(String firstName, String lastName, String phoneNumber, String email, String role){
    homePage.click(homePage.UserMgtBtn);
    userMgtPage.sendKeys(userMgtPage.firstName, firstName);
    userMgtPage.sendKeys(userMgtPage.lastName, lastName);
    userMgtPage.sendKeys(userMgtPage.phoneNumber, phoneNumber);
    userMgtPage.sendKeys(userMgtPage.email, email);
    userMgtPage.sendKeys(userMgtPage.role, role);
    userMgtPage.click(userMgtPage.submitBtn);
    String actualRole = userMgtPage.getText(userMgtPage.verRole);
    Assert.assertEquals(role, actualRole);

    }

    @Test(dataProvider = "userInfo2", dataProviderClass = DataProviders9.class)
    public void testUserRole02(String firstName, String lastName, String phoneNumber, String email, String role){
        homePage.click(homePage.UserMgtBtn);
        userMgtPage.sendKeys(userMgtPage.firstName, firstName);
        userMgtPage.sendKeys(userMgtPage.lastName, lastName);
        userMgtPage.sendKeys(userMgtPage.phoneNumber, phoneNumber);
        userMgtPage.sendKeys(userMgtPage.email, email);
        userMgtPage.sendKeys(userMgtPage.role, role);
        userMgtPage.click(userMgtPage.submitBtn);
        String actualRole = userMgtPage.getText(userMgtPage.verRole);
        Assert.assertEquals(role, actualRole);

    }

    @Test(dataProvider = "userInfo3", dataProviderClass = DataProviders10.class)
    public void testUserRole03(String firstName, String lastName, String phoneNumber, String email, String role){
        homePage.click(homePage.UserMgtBtn);
        userMgtPage.sendKeys(userMgtPage.firstName, firstName);
        userMgtPage.sendKeys(userMgtPage.lastName, lastName);
        userMgtPage.sendKeys(userMgtPage.phoneNumber, phoneNumber);
        userMgtPage.sendKeys(userMgtPage.email, email);
        userMgtPage.sendKeys(userMgtPage.role, role);
        userMgtPage.click(userMgtPage.submitBtn);
        String actualRole = userMgtPage.getText(userMgtPage.verRole);
        Assert.assertEquals(role, actualRole);

    }

}
