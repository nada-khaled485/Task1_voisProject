package pages;

import base.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TodaysOffers extends PageBase {
    By headphones = By.xpath("(//input[@class='CheckboxFilter-module__gridFilterCheckbox_9gZBKxneWNZMc30ac9ue7 Checkbox-module__checkBoxOutline_281PiTekJcpF_Pm5QDexLv'])[23]");
    By grosery = By.xpath("(//input[@class='CheckboxFilter-module__gridFilterCheckbox_9gZBKxneWNZMc30ac9ue7 Checkbox-module__checkBoxOutline_281PiTekJcpF_Pm5QDexLv'])[21]");
    By dis10 = By.xpath("(//a[@class='LinkFilterOption-module__linkFilterOption_k3Xp4bgxEaBmcgTA0UAxc'])[17]");
    By page3 = By.xpath("(//li[@class='a-normal'])[2]");
    By page4 = By.xpath("(//li[@class='a-normal'])[3]");
    By firstDisElement = By.xpath("(//a[@class='a-link-normal DealLink-module__dealLink_3v4tPYOP4qJj9bdiy0xAT a-color-base a-text-normal'])[1]");
    public TodaysOffers(WebDriver driver){super(driver);}
public void choose_headphones(){click(headphones);}

    public void choose_grosery(){click(grosery);}
    public void choose_dis10(){click(dis10);}
    public void clickPage3(){click(page3);}
    public void clickPage4(){click(page4);}
    public void clickFirstElement(){click(firstDisElement);}
}
