package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddParty {

    @FindBy(xpath = "(//div[contains(.,'3Person')])[7]")
    public WebElement btnperson;

    @FindBy(xpath = "//input[contains(@id,'firstnames')]")
   public WebElement txtfirstname;

    @FindBy(xpath = "//input[contains(@id,'ACCPersonSearchCriteriaWidget_un15_lastName')]")
    public WebElement txtlastname;

    @FindBy(xpath = "//input[@id='ACCPersonSearch_un12_searchButton']")
    public WebElement btnsearch;

    @FindBy(xpath = "//input[@id='ACCPersonSearch_un12_addButton']")
    public WebElement btnadd;



    public AddParty (WebDriver driver)
    {
        PageFactory.initElements(driver, this );
    }
}
