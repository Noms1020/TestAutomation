package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class loginPage {

    WebDriver driver;
    WebDriverWait wait;

    @FindBy(xpath = "//button//span[text()='Login']")
    WebElement loginButton;

    @FindBy(id = "login-email")
    WebElement userNameField;

    @FindBy(id = "login-password")
    WebElement passwordField;

    @FindBy(id = "login-submit")
    WebElement submitButton;

    public loginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void clickloginbutton() {
        wait.until(ExpectedConditions.elementToBeClickable(loginButton));
        loginButton.click();
    }

    public void enterEmail(String email) {
        wait.until(ExpectedConditions.visibilityOf(userNameField));
        userNameField.sendKeys(email);
    }

    public void enterPassword(String password) {
        wait.until(ExpectedConditions.visibilityOf(passwordField));
        passwordField.sendKeys(password);
    }

    public void submit() {
        wait.until(ExpectedConditions.elementToBeClickable(submitButton));
        submitButton.click();
        // Wait for next page unique element
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//p[contains(text(), \"Here's who's working today\")]")));
    }
}