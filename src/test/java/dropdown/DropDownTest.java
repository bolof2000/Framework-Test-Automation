package dropdown;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.DropDownListPage;

import java.util.List;

import static org.testng.Assert.*;

public class DropDownTest extends BaseTests {

    @Test
    public void testSelectOption(){

        DropDownListPage dropDownPage= homePage.clickDropdown();
        dropDownPage.selectFromDropDown("Option 1");
        List<String> selectedOptions = dropDownPage.getSelectedOptions();
        assertEquals(selectedOptions.size(),1,"Incorrect Number of s");

    }


}
