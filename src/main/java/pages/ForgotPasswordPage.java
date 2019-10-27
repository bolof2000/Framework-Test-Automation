package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPasswordPage {
    private WebDriver driver;

    public ForgotPasswordPage(WebDriver driver){
        this.driver = driver;
    }

    private By emailField = By.id("email");
    private By retrievePasswordLink = By.linkText("Retrieve password");

    public void enterEmailAddress(String email){

        driver.findElement(emailField).sendKeys(email);
    }

    public EmailSentPage clickRetrievePassword(){

        driver.findElement(retrievePasswordLink).click();
        return new EmailSentPage(driver);
    }
}
