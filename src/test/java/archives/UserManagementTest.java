package archives;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class UserManagementTest {
    @Test
    public void test() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().fullscreen();



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
