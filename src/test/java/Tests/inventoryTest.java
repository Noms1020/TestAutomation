package Tests;



import org.testng.annotations.Test;

public class inventoryTest extends baseTest{
    @Test
    public void callLogin(){
        loginPage.clickloginbutton();
        loginPage.enterEmail("noms@gmail.com");
        loginPage.enterPassword("Password@2");
        loginPage.submit();
    }

    @Test(priority = 1)
    public void accessLearningMaterials(){

        inventoryPage.clickLearnButton();
        inventoryPage.clickLearnMaterial();
        inventoryPage.clickAdvanceAutomationButton();
    }


}
