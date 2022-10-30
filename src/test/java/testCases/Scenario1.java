package testCases;

import base.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.ElementDetails;
import pages.HomePage;
import pages.SearchResultPage;

public class Scenario1 extends TestBase {
    TestBase testBase;
    HomePage homePage;
    SearchResultPage searchResultPage;
    ElementDetails elementDetails;
    CartPage cartPage;
    @BeforeMethod
    public void beforeMethod(){
        testBase = new TestBase();
        testBase.before_scenario();
        homePage=new HomePage(driver);
        searchResultPage = new SearchResultPage(driver);
        elementDetails = new ElementDetails(driver);
        cartPage = new CartPage(driver);
    }
    @Test

    public void AddItemToCart() {

      homePage.searchForElement("CAR ACCESSORIES");
      searchResultPage.chooseFirstElement();
      String text= elementDetails.getTextElemet();
      elementDetails.clickAddToCartBottom();
      elementDetails.clickGoToCartBottom();
      System.out.println(text);
        System.out.println(cartPage.getTextofCartElement());
      Assert.assertTrue(text.contains(cartPage.getTextofCartElement()));
    }

}
