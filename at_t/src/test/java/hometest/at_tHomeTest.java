package hometest;

import org.testng.annotations.Test;

public class at_tHomeTest {





    @Test(priority = 3)
    public void testscroll() throws InterruptedException {
        driver.manage().window().maximize();
        getInitElements();
        mainhomepage.scrolldownwebpage();
        Thread.sleep(5000);
    }
    @Test (priority = 4)
    public void testscrolltoend() throws InterruptedException {
        driver.get("https://www.at_t.com/");
        driver.manage().window().maximize();
        getInitElements();
        mainhomepage.scrolltoend();
    }

    @Test(priority = 5)
        public void testclickaccountlogin(){
        driver.manage().window().maximize();
        getInitElements();
        mainhomepage.clickaccountlogin();
    }

    @Test(priority = 6)
        public void testiphoneimage()throws InterruptedException {


        driver.manage().window().maximize();
        mainhomepage.clickoniphoneimage();
        Thread.sleep(3000);


    }







}
