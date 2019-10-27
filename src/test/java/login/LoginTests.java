package login;

import base.BaseTests;
import org.testng.annotations.Test;

public class LoginTests extends BaseTests {

    @Test
    public void testSucessfulLogin(){

        homePage.clickFormAuthentication();

    }


}
