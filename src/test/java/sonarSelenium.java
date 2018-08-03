import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;

public class sonarSelenium {
    private WebDriver driver;
    @BeforeClass
    public static void setupClass() {
        WebDriverManager.chromedriver().setup();
        //WebDriverManager.firefoxdriver().setup();
        //WebDriverManager.phantomjs().setup();
    }

    @Before
    public void setUp() {
        driver = new ChromeDriver();
        //driver = new FirefoxDriver();
        //driver = new PhantomJSDriver();
    }


    @After
    public void tearDown() {
        if (null != driver) {
            driver.quit();
        }
    }

    @Test
    public void sonarSmoke(){
        driver.get("www.google.com");
        String title = driver.getTitle();
        assertEquals("Google", title);
    }
}
