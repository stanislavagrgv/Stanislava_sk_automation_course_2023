package L14;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestProfileInMain {
    WebDriver driver;

    public static void main (String[] args) {

    }

        protected final void setUpTestSuite() {
            WebDriverManager.chromedriver().setup();
        }

        //@BeforeTest
        protected final void setUpMethod() {
            this.driver = new ChromeDriver();
            this.driver.manage().window().maximize();

        }

        @Test
        public void testCreatePost() {

        }
    }
