package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashBoardPage {

    @FindBy(xpath = "//a[contains(@id,'MENUITEM.SearchPartieslink')]")
    public WebElement linkSearchParties;

    public DashBoardPage(WebDriver driver) {
        PageFactory.initElements( driver, this );
    }
}
