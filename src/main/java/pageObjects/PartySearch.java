package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PartySearch {
    @FindBy(xpath = "//input[@id='ACCPersonSearchCriteriaWidget_un15_firstnames']")
    public WebElement txtfirstname;

    @FindBy(xpath = "//input[@id='ACCPersonSearchCriteriaWidget_un15_lastName']")
    public WebElement txtlastname;

    @FindBy(xpath = "//input[@id='ACCPersonSearch_un12_searchButton']")
    public WebElement btnsearch;

    public PartySearch(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
