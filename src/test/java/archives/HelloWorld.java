package archives;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HelloWorld {
    @Test
    public void test()
    {
        System.out.println("Hello world");
    }
    @Test
    public void test2()
    {
        WebDriverManager.chromedriver().setup();
        //setup browser

        WebDriver driver=new ChromeDriver();
        //open a browser

        driver.navigate().to("https://www.acc.co.nz");
        //navigate to acc.co.nz

        driver.manage().window().fullscreen();
        //fullscreen

        WebElement onlinebtn= driver.findElement(By.xpath("//a[@class='c-global-header__tablet-aux-menu-link'][contains(.,'Online services')]"));
                onlinebtn.click();
        //click in the online btn and will move to next page

                WebElement txt =driver.findElement(By.xpath("//h1[contains(.,'Our online services')]"));
        // take value of txt in the variable txt

        Assert.assertEquals(txt.getText(), "Our online services");
        // compare the next page txt with the "Our online services"

        driver.close();
        //close the driver

        System.out.println();
    }
}
