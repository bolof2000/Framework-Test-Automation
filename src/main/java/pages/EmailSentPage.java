package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EmailSentPage {
    private WebDriver driver;

    public EmailSentPage(WebDriver driver){
        this.driver = driver;
    }

    private By emailSentConfirm = By.id("content");

    public String getTextMessageOnPage(){

        return driver.findElement(emailSentConfirm).getText();
    }
}
