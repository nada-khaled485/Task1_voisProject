package testCases;

import base.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.ElementDetails;
import pages.HomePage;
import pages.SearchResultPage;
import pages.TodaysOffers;

public class Scenario2 extends TestBase{
    TestBase testBase;
    HomePage homePage1;
    TodaysOffers todaysOffers;
    ElementDetails elementDetails;


    @BeforeMethod
    public void beforeMethod(){
testBase = new TestBase();
        testBase.before_scenario();
        homePage1 = new HomePage(driver);
        todaysOffers = new TodaysOffers(driver);
        elementDetails = new ElementDetails(driver);

    }
    @Test
    public void scenario2() throws InterruptedException {

       homePage1.setCancel();
       homePage1.todaysDeals();
       todaysOffers.choose_headphones();
       todaysOffers.choose_grosery();
       todaysOffers.choose_dis10();
       todaysOffers.clickPage3();
        todaysOffers.clickPage4();
        Thread.sleep(10000);
        todaysOffers.clickFirstElement();

        elementDetails.clickAddToCartBottom();

    }
}
