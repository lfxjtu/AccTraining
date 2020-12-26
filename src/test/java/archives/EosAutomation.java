package archives;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import org.openqa.selenium.By;

public class EosAutomation {
        @Test
        public void test() throws InterruptedException {

            WebDriverManager.chromedriver().setup();
            WebDriver driver= new ChromeDriver();
            driver.manage().window().fullscreen();



            // navigate to EOS
            driver.navigate().to("https://testau:testau1@kdclea5150.ds.acc.co.nz:8443/acc/index.jsp");
            //driver.getWindowHandles().forEach(handle -> driver.switchTo().window(handle).manage().window().setSize(new Dimension(1920,1080)));


            // Click on claims search
            driver.findElement(By.cssSelector("div[id$='sidebar'] ul")).click();


            //create an instance of login page
            LoginPage login =new LoginPage(driver);
            login.loginSuccess(driver);

//         driver.navigate().to("https://opensource-demo.orangehrmlive.com/index.php/admin/viewSystemUsers?userId=\n");
//         driver.findElement(By.id("txtUsername")).sendKeys("archives.Admin");
//         driver.findElement(By.id("txtPassword")).sendKeys("admin123");
//         driver.findElement(By.id("btnLogin")).click();
            //Login

            DashboardPage dash= new DashboardPage(driver);
            dash.clickAdmin(driver);

            Admin admin=new Admin(driver);
            admin.clickAddBtn(driver);

            Buzz buz =new Buzz(driver);
            buz.clickBuzBtn(driver);



//         driver.findElement(By.id("btnAdd")).click();
//
//         driver.findElement(By.id("systemUser_employeeName_empName")).sendKeys("Anna Hamilton");
//
//         driver.findElement(By.id("systemUser_userName")).sendKeys("Kitkat8");
//
//         Thread.sleep(2000);
//         driver.findElement(By.id("btnSave")).click();

            // driver.findElement(By.id("btnSave")).click();

            //  driver.findElement(By.xpath("//input[contains(@id,'ohrmList_chkSelectRecord_19')]")).click();

            //driver.findElement(By.id("btnDelete")).click();

            //driver.findElement(By.id("dialogDeleteBtn")).click();

            // wait(2000);

            //WebElement loginbtn= driver.findElement(By.id("txtUsername"));
            //loginbtn.click();

        }

    }


