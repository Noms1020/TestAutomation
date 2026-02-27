package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class inventoryPage {

    WebDriver driver;
    WebDriverWait wait;


   //Constructor
   public inventoryPage(WebDriver driver) {
       this.driver = driver;
       this.wait=new WebDriverWait(driver, Duration.ofSeconds(15));
       PageFactory.initElements(driver, this);
   }

   @FindBy(xpath = "//*[@id=\"app-root\"]/nav/div[1]/div[2]/div[1]/button/span[2]")
    WebElement LearnButton;

   @FindBy(xpath = "//*[@id=\"app-root\"]/nav/div[1]/div[2]/div[1]/div/button[2]/span[2]")
    WebElement LearnMaterialButton;

   @FindBy(xpath = "//*[@id=\"tab-btn-web\"]/span[2]")
    WebElement AdvanceAutomationButton;


   public void clickLearnButton(){
       wait.until(ExpectedConditions.elementToBeClickable(LearnButton)).click();

   }

   public void clickLearnMaterial(){
       wait.until(ExpectedConditions.elementToBeClickable(LearnMaterialButton)).click();
   }

   public  void clickAdvanceAutomationButton(){
       wait.until(ExpectedConditions.elementToBeClickable(AdvanceAutomationButton)).click();
   }
}
