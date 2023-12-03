package L16_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ProfilePage {

    public static final String LOGIN_URL_PART = "http://training.skillo-bg.com:4300/users/";
    private final WebDriver driver;

    @FindBy (id="nav-link-new-post")
    WebElement newPostLink;

    public ProfilePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public boolean isUrlLoaded() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        return wait.until(ExpectedConditions.urlContains(ProfilePage.LOGIN_URL_PART));
    }

        //WebElement newPost = driver.findElement(By.id("nav-link-new-post"));
        //newPost.click();

}