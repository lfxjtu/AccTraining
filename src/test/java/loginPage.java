import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {
    WebDriver driver;
    loginPage(WebDriver webdriver){
        driver = webdriver;
        PageFactory.initElements(webdriver, this);
    }
    @FindBy(id="txtUsername")
    WebElement txtUsername;

    @FindBy(id="txtPassword")
    WebElement txtPassword;

    @FindBy(id="btnLogin")
    WebElement btnLogin;

    public void loginSuccess(){
//        PageFactory.initElements(driver, this);

        driver.navigate().to("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
        txtUsername.sendKeys("Admin");
        txtPassword.sendKeys("admin123");
        btnLogin.click();
    }

    public void loginFailure(){
        driver.findElement(By.id("txtUsername")).sendKeys("admin");
        driver.findElement(By.id("txtPassword")).sendKeys("admin123");

    }


}
