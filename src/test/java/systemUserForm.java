import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Random;
import java.util.function.Function;

public class systemUserForm {
    WebDriver driver;

    public systemUserForm(WebDriver webdriver) {
        driver = webdriver;
        PageFactory.initElements(webdriver,this);
    }
    @FindBy(id = "frmSystemUser")
    WebElement frmSystemUser;
    @FindBy(id = "systemUser_userType")
    WebElement systemUser_userType;
    @FindBy(id = "systemUser_employeeName_empName")
    WebElement empName;
    @FindBy(id = "systemUser_userName")
    WebElement userName;

    @FindBy(id="systemUser_status")
    WebElement status;
    @FindBy(id="systemUser_password")
    WebElement systemUser_password;
    @FindBy(id="systemUser_confirmPassword")
    WebElement systemUser_confirmPassword;
    @FindBy(xpath="//*[@id=\"btnSave\"]")
    WebElement btnSave;
    public void addNew() throws InterruptedException {
//        WebElement userForm = driver.findElement(By.xpath("//*[@id=\"frmSystemUser\"]"));
//        while (frmSystemUser.isDisplayed()) {
            Select userType = new Select(systemUser_userType);
//        Select userRoleSelect = new Select(userForm.findElement(By.xpath("//select[@id='systemUser_userType']")));
            userType.selectByValue("1");
            empName.sendKeys("Anthony Nolan");
//            frmSystemUser.findElement(By.id("systemUser_employeeName_empName")).sendKeys("Anthony Nolan");
            int rand = new Random().nextInt(10000);
            String newUserName = "FangTest" + rand;
            userName.sendKeys(newUserName);
            Select newStatus = new Select(status);
            newStatus.selectByVisibleText("Disabled");
            systemUser_password.sendKeys(newUserName);
            systemUser_confirmPassword.sendKeys(newUserName);
            WebDriverWait wait = new WebDriverWait(driver,10);
//            wait.until(ExpectedConditions.elementSelectionStateToBe(btnSave, btnSave.isEnabled()));
            Thread.sleep(2000);
            btnSave.click();
        }

}
