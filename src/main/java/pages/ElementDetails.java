package pages;

import base.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementDetails extends PageBase {
    By AddToCartBottom = By.id("add-to-cart-button");
    By TextofElement= By.id("title");
    By GoToCartBottom = By.xpath("//*[@id=\"sw-gtc\"]/span");

    public ElementDetails(WebDriver driver){super(driver);}

    public void clickAddToCartBottom(){ click(AddToCartBottom);}
    public void clickGoToCartBottom(){ click(GoToCartBottom);}

    public String getTextElemet(){
        String text= driver.findElement(TextofElement).getText();
        return text;
    }

}
