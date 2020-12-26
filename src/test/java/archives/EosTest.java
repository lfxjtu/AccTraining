package archives;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import pageObjects.*;

import java.util.Random;

public class EosTest {

@Test
    public void createPartyAndValidate() throws InterruptedException
    {
        //create instance of webdriver
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        //login to EOS e20 and handle windows that open
        driver.navigate().to("https://testau:testau1@eos-e20.ds.acc.co.nz/acc/");
        driver.getWindowHandles().forEach(varHandle -> driver.switchTo().window(varHandle).manage().window().setSize(new Dimension(1920, 1080)));

        //click on partySearch
        DashBoardPage dash=new DashBoardPage(driver);
        dash.linkSearchParties.click();

       AddParty addparty =new AddParty(driver);
       //addparty.btnperson.click();--gives error
        addparty.txtfirstname.sendKeys(randomString(8));
        addparty.txtlastname.sendKeys(randomString(8));
        addparty.btnsearch.click();
        //wait(3000);
        addparty.btnadd.click();

        AddPerson addper = new AddPerson(driver);
        addper.txtfirstname1.sendKeys("EosTestFirstName");
        addper.txtlastname1.sendKeys("EosTestLastName");
        //converting webelements into select
        Select gender = new Select(addper.txtgender);
        gender.selectByValue("2");

        addper.txtdob.sendKeys("03/09/2020");
        //addper.txtaddress.sendKeys("ACC, Shamrock House, Wellington, NZ");

       AddAddress addaddress =new AddAddress(driver);
        addaddress.btnaddress.click();
        addaddress.btnok.click();
        addaddress.txttypeadd.sendKeys("1 Alyssum Road, Mount Wellington, Auckland 1062 ");
        addaddress.clkadd.click();
        addaddress.btnverify.click();
        addaddress.btnoksave.click();

        Select ethinicity =new Select(addper.ddleth);
        ethinicity.selectByValue("2");

        PartySearch partysearch=new PartySearch(driver);
        partysearch.txtfirstname.sendKeys("eosTestFirstName");
        partysearch.txtfirstname.sendKeys("eosTestLastName");
        partysearch.btnsearch.click();

    }

    public String randomString(int length)
    {
        Random rand=new Random();

        char[] ch =new char[length];

        for (int i =0; i< length; i++)
        {
            ch [i]=(char)(97+rand.nextInt(26));
        }
        //65-A 90-Z; 97-a 122-z ascii characters
        //System.out.println(ch);--prints random string of 6 letters

        return String.valueOf(ch);
       }

}
