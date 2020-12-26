package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddPerson {

    @FindBy(xpath = "//input[@id='ACCPersonalDetailsWidget_un11_firstNameTextBox']")
    public WebElement txtfirstname1;

    @FindBy(xpath = "//input[@id='ACCPersonalDetailsWidget_un11_surnameTextBox']")
    public WebElement txtlastname1;

    //@FindBy(xpath = "//select[@id='ACCPersonalDetailsWidget_un11_genderEnum']")--male, same as female
    @FindBy(xpath = "//select[contains(@id,'ACCPersonalDetailsWidget_un11_genderEnum')]")
    public WebElement txtgender;

    @FindBy(xpath = "//input[@id='ACCPersonalDetailsWidget_un11_Date_of_Birth']")
    public WebElement txtdob;

    @FindBy(xpath = "//div[@class='NoScrollPane_address'][contains(.,'-')]")
    public WebElement txtaddress;

    @FindBy(xpath = "//select[@id='ACCEditEthnicityDetailsWidget_un19_Ethnicity1']")
    public WebElement ddleth;

    public AddPerson(WebDriver driver) {
    PageFactory.initElements(driver, this);
    }
}
