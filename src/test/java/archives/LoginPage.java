package archives;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    LoginPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
    @FindBy(id = "txtUsername")
    WebElement txtUsername;


    @FindBy(id = "txtPassword")
    WebElement  txtPassword;

    @FindBy(id="btnLogin")
    WebElement btnLogin;

    public void loginSuccess(WebDriver driver)
    {
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/index.php/admin/viewSystemUsers?userId=\n");

        txtUsername.sendKeys("archives.Admin");
        txtPassword.sendKeys("admin123");
        btnLogin.click();
       }

//    public void loginFailure(WebDriver driver)
//    {
//        driver.navigate().to("https://opensource-demo.orangehrmlive.com/index.php/admin/viewSystemUsers?userId=\n");
//
//        txtUsername.sendKeys("archives.Admin");
//        txtPassword.sendKeys("admin123");
//        btnLogin.click();
//        }
}
