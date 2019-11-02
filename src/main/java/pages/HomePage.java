package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;
    }
    public void clickLinks(String link){
        driver.findElement(By.linkText(link)).click();
    }
    public LoginPage clickFormAuthentication(){
        clickLinks("Form Authentication");
        return new LoginPage(driver);
    }

    public DropDownListPage clickDropdown(){
        clickLinks("Dropdown");
        return new DropDownListPage(driver);
    }
    public ForgotPasswordPage clickForgotPassword(){

        clickLinks("Forgot Password");
        return new ForgotPasswordPage(driver);
    }

}
