package pages;

import base.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchResultPage extends PageBase {

    By firstElement = By.xpath("(//div[@class='a-section a-spacing-base'])[1]");

    public SearchResultPage(WebDriver driver){super(driver);

    }
    public void chooseFirstElement(){
        click(firstElement);
    }


}
