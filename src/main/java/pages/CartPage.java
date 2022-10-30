package pages;

import base.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class CartPage extends PageBase {

    By elementInCart = By.xpath("(//span[@class='a-truncate-cut'])[5]");
    public CartPage(WebDriver driver) {
        super(driver);
    }

    public boolean checkElementInCart() {
        return elementISDisplayed(elementInCart);
    }

    public String getTextofCartElement(){

     String cartText=   driver.findElement(elementInCart).getText();
     return cartText;
    }

}
