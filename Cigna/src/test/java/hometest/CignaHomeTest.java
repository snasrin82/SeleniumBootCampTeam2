package hometest;

public class CignaHomeTest {
    import common.WebAPI;
import homepage.CignaHomePage;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

    public class CignaHomeTest extends WebAPI {

        static CignaHomePage cignaHomePage;// Reference variable/object of CignaHomePage

        public static void getInitElements(){
            cignaHomePage= PageFactory.initElements(driver,CignaHomePage.class);
        }

        @Test
        public void testSearchBox(){
            getInitElements();
            cignaHomePage.enterKeyword();

        }

        @Test
        public void testClickButton(){
            getInitElements();
            cignaHomePage.enterKeyword();
            cignaHomePage.clickonButton();

        }

        @Test
        public void  testScrollDownTheWebPage(){
            getInitElements();
            cignaHomePage.scrollDownTheWebPage();
        }
        //
//
        @Test
        public void testScrollDownTillEnd() throws InterruptedException {
            getInitElements();
            cignaHomePage.scrollDownTillEnd();
        }

        @Test
        public void testgoToCustomerLogInByMouseHovering(){
            getInitElements();
            cignaHomePage.goToCustomerLogInByMouseHovering();

        }

        @Test
        public void testenterKeyWordForLogIn(){
            getInitElements();
            cignaHomePage.enterKeyWordForLogIn();

        }


        @Test
        public void testsetEnterKeyWordForPassword(){
            getInitElements();
            cignaHomePage.goToCustomerLogInByMouseHovering();
            cignaHomePage.enterKeyWordForLogIn();
        }

        @Test
        public void testGetTilteOfcignaInternationalTab(){

            getInitElements();
            cignaHomePage.getTilteOfcignaInternationalTab();

        }


        @Test
        public void testmouseHoverOnContactanosTab(){
            getInitElements();
            cignaHomePage.mouseHoverOnAquienesServimos();
        }


        @Test
        public void testuserhoverOnMedicare(){
            getInitElements();
            cignaHomePage.hoverOnMedicare();

        }

        @Test
        public void testuserClickOnOprion1(){
            getInitElements();
            cignaHomePage.userClickOnOprion1();
        }

    }




















}
