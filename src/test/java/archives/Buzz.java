package archives;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Buzz {

    Buzz(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }
    @FindBy (xpath = "//b[contains(.,'archives.Buzz')]")
    WebElement buzbtn;

    @FindBy(id="status-tab-label")
    WebElement updStatusBtn;

    //@FindBy(id=)


    public void clickBuzBtn(WebDriver driver)
    {
        buzbtn.click();
    }

    public void clickUpdateStatus()
    {
        updStatusBtn.click();
    }
}
