package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PageBase {
    public static WebDriver driver;
    private WebDriverWait wait;
public PageBase(WebDriver driver){ this.driver=driver;}

    public void click(By element){
waitElementToBeVisible(element);
driver.findElement(element).click();

    }

    public void clickOnceAvailable(By element){

WebElement   Webelement=wait.until(ExpectedConditions.elementToBeClickable(element));
        Webelement.click();
    }
    public void waitElementToBeVisible(By element){
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(element));


    }
    public void typeText(By Element, String text ) {
        waitElementToBeVisible(Element);
        WebElement element = driver.findElement(Element);
        element.clear();
        element.sendKeys(text);


    }
    public boolean elementISDisplayed(By byElement ) {
        waitElementToBeVisible(byElement);
        boolean displayed = driver.findElement(byElement).isDisplayed();

        return displayed;
    }
}
