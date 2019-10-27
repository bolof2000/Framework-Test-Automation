package login;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SecureAreaPage;
import static org.testng.Assert.*;

public class LoginTests extends BaseTests {

    @Test
    public void testSucessfulLogin(){
     
        LoginPage loginpage = homePage.clickFormAuthentication();
        loginpage.enterUsername("tomsmith");
        loginpage.enterPassword("SuperSecretPassword!");
        SecureAreaPage secureAreaPage = loginpage.clickLoginLink();
        secureAreaPage.getAlertText();
        assertTrue(secureAreaPage.getAlertText().contains("You logged into a secure area!"),"Alert text is incorrect");

    }


}
