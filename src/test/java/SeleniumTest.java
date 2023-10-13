import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SeleniumTest {

    WebDriver webDriver = null;

    @Test
    void setUp(){

        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.get("https://www.ebay.com/");
    }

//    public void searchMobilePhones(){
//        webDriver.findElement(By.xpath("//input[@id="gh-ac"]")).sendKeys("Mobile Phones");
//        Select select = new Select
//    }


}
