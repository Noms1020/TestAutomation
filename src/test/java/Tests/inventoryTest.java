package Tests;


import Base.baseTest;
import org.testng.annotations.Test;

public class inventoryTest extends baseTest {
    @Test(priority = 0)
    public void callLogin() throws InterruptedException {

        loginpage.clickloginbutton();

        loginpage.enterEmail("noms@gmail.com");
        loginpage.enterPassword("Password@2");
        loginpage.submit();
    }

    @Test(priority = 1)
    public void accessLearningMaterials() throws InterruptedException {

        inventorypage.clickLearnButton();

        inventorypage.clickLearnMaterial();

        inventorypage.clickAdvanceAutomationButton();
    }


}
