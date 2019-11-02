package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DropDownListPage {
    private WebDriver driver;
    private By dropdown = By.id("dropdown");

    public DropDownListPage(WebDriver driver){
        this.driver = driver;
    }

    public void selectFromDropDown(String option){


    }


}
