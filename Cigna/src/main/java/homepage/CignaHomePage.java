
package homepage;

import common.WebAPI;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import static homepage.WebElementsForCigna.*;

public class CignaHomePage extends WebAPI {

    @FindBy(how=How.CSS,using=searchBoxElement)
    public WebElement searchBox;

    @FindBy(how=How.CSS,using=clickButtonelement)
    public WebElement clickButton;


    @FindBy(how=How.XPATH,using = logInButton)
    public WebElement mouseHoveringForCustomerlogIn;

    @FindBy(how= How.CSS,using=userNameTab)

    public WebElement Username;

    @FindBy(how=How.XPATH,using = PasswordElement)
    public WebElement EnterKeyWordForPassword;

    @FindBy(how=How.CSS,using= getTitleElement)
    public WebElement getTilte;

    @FindBy(how=How.CSS,using = contactonasTab)
    public WebElement hoveringOnContactanosTab;

    @FindBy(how=How.CSS,using = MedicareTab)
    public WebElement medicare;


    @FindBy(how=How.XPATH,using = clickOnButton)
    public WebElement clickOnOption1;
    ;



    // Helper Method


//     Input Box

    public void enterKeyword()
    {
        searchBox.sendKeys("health insurance");
    }


// Input Box

    public void clickonButton()
    {
        clickButton.click();
    }


// Scroll Down

    public void scrollDownTheWebPage(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");

    }

    // Scroll Down Till End

    public void scrollDownTillEnd() throws InterruptedException {

        //This will scroll the web page till end.
        JavascriptExecutor js1 = (JavascriptExecutor) driver;
        js1.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        Thread.sleep(2000);

    }

// Mouse Hovering

    public void goToCustomerLogInByMouseHovering(){

        Actions actions =new Actions(driver);
        actions.moveToElement(driver.findElement(By.xpath(logInButton))).perform();
        String expected="Ingresar:Empleador/agente";
        Assert.assertEquals("Ingresar:Empleador/agente","Ingresar:Empleador/agente","error");
    }

// Input Box

    public void enterKeyWordForLogIn(){
        Username.sendKeys("mohana@gmail.com");
    }

//   Input Box

    public void setEnterKeyWordForPassword(){
        EnterKeyWordForPassword.sendKeys("12345" );
    }


//Get the title of cignaInternationalTab


    public String getTilteOfcignaInternationalTab(){
        return    getTilte.getText();
    }

    // Mouse Hovering

    public void mouseHoverOnAquienesServimos(){
        Actions hovering=new Actions(driver) ;
        hovering.moveToElement(hoveringOnContactanosTab).perform();


    }

    // Mouse Hovering

    public void hoverOnMedicare(){
        Actions hover=new Actions(driver) ;
        hover.moveToElement(medicare).perform();

    }

//    Click Action

    public void userClickOnOprion1(){
        Actions hover1=new Actions(driver) ;
        hover1.moveToElement(medicare).perform();
        hover1.moveToElement( clickOnOption1).perform();

    }









}























}
