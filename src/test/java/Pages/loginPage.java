package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class loginPage {



    @FindBy(xpath = "//div[@id='app-root']/nav/div/div[3]/button/span[2]")
    WebElement loginButton;

    @FindBy(xpath = "//*[@id=\"login-email\"]") WebElement userNameField;

    @FindBy(xpath = "//*[@id=\"login-password\"]") WebElement passwordField;

    @FindBy(id = "login-submit") WebElement submitButton;

    public void clickloginbutton(){
        loginButton.click();
    }

    public void enterEmail(String email){
        userNameField.sendKeys(email);
    }

    public void enterPassword(String password){
        passwordField.sendKeys(password);
    }
    public void submit(){
        submitButton.click();
    }


}
