package Tests;
import Base.baseTest;
import jdk.jfr.Description;
import org.testng.annotations.Test;

public class loginTest extends baseTest{

    @Test
 //   @Description("Login to Ndosi Website with valid credentials")
    public void loginWithValidCredentialss()throws InterruptedException{

        loginpage.clickloginbutton();
        Thread.sleep(2000);
        loginpage.enterEmail("noms@gmail.com");
        Thread.sleep(2000);
        loginpage.enterPassword("Password@2");
        Thread.sleep(2000);
        loginpage.submit();
        //driver.quit();
    }


}


