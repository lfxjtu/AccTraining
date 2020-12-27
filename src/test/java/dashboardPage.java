import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class dashboardPage {
    WebDriver driver;
    dashboardPage(WebDriver webdriver){
        driver = webdriver;
        PageFactory.initElements(webdriver,this);
    }
    @FindBy(id="menu_admin_viewAdminModule")
    WebElement menu_admin_viewAdminModule;
    @FindBy(xpath="//input[@id='btnAdd']")
    WebElement clickAdd;

    public void clickAdmin() {
        menu_admin_viewAdminModule.click();

    }
    public void clickAdd() {
        clickAdd.click();

    }


}
