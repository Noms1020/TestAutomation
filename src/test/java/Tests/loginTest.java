package Tests;
import Base.baseTest;
import jdk.jfr.Description;
import org.testng.annotations.Test;

public class loginTest extends baseTest{

    @Test
 //   @Description("Login to Ndosi Website with valid credentials")
    public void loginWithValidCredentialss()throws InterruptedException{

        loginPage.clickloginbutton();
        Thread.sleep(2000);
        loginPage.enterEmail("noms@gmail.com");
        Thread.sleep(2000);
        loginPage.enterPassword("Password@2");
        Thread.sleep(2000);
        loginPage.submit();
        //driver.quit();
    }


}


