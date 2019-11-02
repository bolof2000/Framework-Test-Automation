package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class DropDownListPage {
    private WebDriver driver;
    private By dropdown = By.id("dropdown");

    public DropDownListPage(WebDriver driver){
        this.driver = driver;
    }

    public void selectFromDropDown(String option){

        findDropDownElement().selectByVisibleText(option);

    }

    private Select findDropDownElement(){
        return new Select(driver.findElement(dropdown));
    }

    public List<String> getSelectedOptions(){

        List<String> webElement = new ArrayList<String>();

        List<WebElement> selectedElements = findDropDownElement().getAllSelectedOptions();
        for(int i=0;i<selectedElements.size();i++){

            //webElement.add(selectedElements.get(i));

        }

        return webElement;

    }



}
