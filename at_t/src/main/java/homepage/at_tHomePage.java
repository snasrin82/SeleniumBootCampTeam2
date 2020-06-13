package homepage;

import common.WebAPI;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.concurrent.TimeUnit;

public class at_tHomePage {

      import static
    //first extend the WebApI
     public class at_Homepage extends WebAPI{

     //using findbyannotation which is under selenium
     //must import Webelements

     @FindBy(how = How.CSS,using= searchbox)
       WebElement usersearchbox;
     @FindBy(how = How.CSS,using=clicksearchbutton)
       WebElement clickonsearchbutton;
     @FindBy(how= How.CSS,using=accountlogin)
     WebElement useraccountlogin;
     @FindBy(how = How.CSS,using=clickimageiphone)
        WebElement webElementiphoneimage;


     //Initialize and import webelementds

        //created a method for searchbox

        public  void usersearchbox(){
            driver.get(url);
            usersearchbox.sendKeys(AT&T deals);
        }





      //Scrolldownwebpage

            public void scrooldownpage() throws InterruptedException {
            JavascriptExecutor acrollend=(JavascriptExecutor)driver;
            sacrollend.executeScript("window.scrollTo(10,document.body.scrollHeight");
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            Thread.sleep(2000);

        }

       //ScrolltoEnd

       public void scrollend()



    }








}
