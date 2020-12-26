package archives;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Admin {
    Admin(WebDriver driver)
    {
        PageFactory.initElements(driver, this );
    }

    @FindBy (id = "btnAdd")
    WebElement btnAdd;


    public void clickAddBtn(WebDriver driver)
    {
        btnAdd.click();
    }

}
