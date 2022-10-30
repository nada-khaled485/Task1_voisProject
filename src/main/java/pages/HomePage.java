package pages;

import base.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//(//input[@type='submit'])[2]
public class HomePage extends PageBase {
    By search = By.id("twotabsearchtextbox");
    By search_bottom = By.id("nav-search-submit-button");
    By todaysDeals = By.xpath("//a[@href='/gp/goldbox?ref_=nav_cs_gb']");
    By cancel = By.xpath("(//input[@type='submit'])[2]");
    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void searchForElement(String searchInput) {
        typeText(search, searchInput);
        click(search_bottom);
    }
    public void setCancel() {
        click(cancel);
    }

    public void todaysDeals() {
        click(todaysDeals);
    }
}
