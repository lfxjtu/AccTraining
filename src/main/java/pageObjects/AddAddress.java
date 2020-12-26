package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddAddress {

    @FindBy(xpath = "//input[@id='AddressesForPartyWidget_un13_NewButton']")
    public WebElement btnaddress;

    @FindBy(xpath = "//input[@id='AddressesForPartyWidget_un13_AddUsageDropDown_yes']")
    public  WebElement btnok;

    @FindBy(xpath = "//input[@id='EditAddressWidget_un12_fullAddress']")
    public WebElement txttypeadd;

    //1 Alyssum Road, Mount Wellington, Auckland 1062
    @FindBy(xpath = "//strong[@class='tt-highlight'][contains(.,'1 Alyssum Road, Mount Wellington, Auckland 1062')]")
    public WebElement clkadd;


    @FindBy(xpath = "//input[contains(@id,'NZEditCountryFormatAddressWidget_un13_Verified_GROUP')]")
    public WebElement btnverify;

    @FindBy(xpath = "//input[@id='p12_un6_editPageSave']")
    public WebElement btnoksave;

    public AddAddress(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }

}
