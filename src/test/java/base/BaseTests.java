package base;
import pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTests {


    private WebDriver driver;
    protected HomePage homePage;

    @BeforeClass
    public void setUp(){

        System.setProperty("webdriver.chrome.driver","resources/chromedriver/");
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().window().maximize();
        homePage = new HomePage(driver);
    }

    @AfterClass
    public void tearDown(){

        driver.quit();
    }
}
