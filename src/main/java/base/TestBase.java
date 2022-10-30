package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;

public  class TestBase {
    public static WebDriver driver;
   // @BeforeTest
    public void before_scenario(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.navigate().to("https://www.amazon.com/");
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("resolution", "1024x768");
    }
}
