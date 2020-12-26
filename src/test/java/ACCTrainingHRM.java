import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class ACCTrainingHRM {
    @Test
    public void UserManagement() throws InterruptedException {
        String url = "https://opensource-demo.orangehrmlive.com";

        //Create an instance of webdriver
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //Login
        driver.navigate().to(url);
        driver.findElement(By.id("txtUsername")).sendKeys("admin");
        driver.findElement(By.id("txtPassword")).sendKeys("admin123");
        driver.findElement(By.id("btnLogin")).click();

        //Click admin -> add user
        driver.findElement(By.id("menu_admin_viewAdminModule")).click();
        driver.findElement(By.xpath("//input[@id='btnAdd']")).click();

        //Add user
        WebElement userForm = driver.findElement(By.xpath("//*[@id=\"frmSystemUser\"]"));

        Select userRoleSelect = new Select(userForm.findElement(By.xpath("//select[@id='systemUser_userType']")));
        userRoleSelect.selectByValue("1");

        userForm.findElement(By.id("systemUser_employeeName_empName")).sendKeys("Anthony Nolan");
        int rand = new Random().nextInt(10000);
        String newUserName = "FangTest" + rand;
        userForm.findElement(By.id("systemUser_userName")).sendKeys(newUserName);
        Select status = new Select(userForm.findElement(By.id("systemUser_status")));
        status.selectByVisibleText("Disabled");
        userForm.findElement(By.id("systemUser_password")).sendKeys(newUserName + newUserName);
        userForm.findElement(By.id("systemUser_confirmPassword")).sendKeys(newUserName + newUserName);
        Thread.sleep(2000);
        userForm.findElement(By.id("btnSave")).click();

//      assert if new user is created
        driver.findElement(By.id("searchSystemUser_userName")).sendKeys(newUserName);
        driver.findElement(By.id("searchBtn")).click();


        WebElement resultTable = driver.findElement(By.id("resultTable"));
        Assert.assertTrue(resultTable.getText().contains(newUserName));

        //Delete the created user
        WebElement selectNewUser = resultTable.findElement(By.tagName("input"));
        while (!selectNewUser.isSelected())
            selectNewUser.click();

        driver.findElement(By.id("btnDelete")).click();

        driver.findElement(By.id("deleteConfModal")).findElement(By.id("dialogDeleteBtn")).click();

        //Assert if deletion is successful

        Assert.assertTrue(driver.findElement(By.id("content")).getText().contains("Successfully Deleted"));

        Thread.sleep(10000);
        driver.quit();
    }

//    @Test
//    public void ACCTest(){
//        //setup browser
//        WebDriverManager.chromedriver().setup();
//
//        //create an instance of browser nad max the window
//
//        WebDriver driver = new ChromeDriver();
//
//        driver.manage().window().maximize();
//        //navigate to acc.co.nz
//        driver.navigate().to("https://acc.co.nz");
//
//        //click on online serivce
//
//        WebElement btnOnlineService = driver.findElement(By.xpath("(//img[@class='icon-padlock'])[1]"));
//        btnOnlineService.click();
//
//        //verify online service text is displayed
//
//        String ourOnlineServices = driver.findElement(By.xpath("//h1[contains(.,'Our online services')]")).getText();
//        Assert.assertEquals(ourOnlineServices, "Our online services");
//        driver.close();

//    }
}
