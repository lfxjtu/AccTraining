package archives;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {

         DashboardPage(WebDriver driver)
        {
            PageFactory.initElements(driver, this);
        }

        @FindBy (xpath = "//b[contains(.,'archives.Admin')]")
    WebElement addBtn;
        public void clickAdmin(WebDriver driver)
        {
        addBtn.click();
        }


}
