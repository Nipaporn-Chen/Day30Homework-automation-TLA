package tests;

import base.BaseTest;
import dataProvider.DataProviders2;
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
}
