package L16_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class NewPostPage {

    public static final String NEW_POST_URL = "http://training.skillo-bg.com:4300/posts/create";
    private final WebDriver driver;

    @FindBy(id = "nav-link-new-post")
    WebElement newPostLink;

    @FindBy(xpath = "//input[@class=\"ng-untouched ng-pristine ng-invalid\"]")
    WebElement uploadPicture;

    @FindBy(name = "caption")
    WebElement postCaptionInput;

    @FindBy (xpath = "//label[@for=\"customSwitch2\"]")
    WebElement accessStatus;

    @FindBy (className= "public-status-label")
    WebElement privateLabel;

    @FindBy (id="create-post")
    WebElement createPostButton;


    public NewPostPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public boolean isUrlLoaded() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        return wait.until(ExpectedConditions.urlToBe(NewPostPage.NEW_POST_URL));
    }

    public void clickNewPostLink (){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        wait.until(ExpectedConditions.visibilityOf(newPostLink));
        newPostLink.click();
    }

    public void uploadPicture(String pictureFullPath){
        uploadPicture.sendKeys(pictureFullPath);
    }

    public void fillInCaption(String postCaption) {
        postCaptionInput.sendKeys(postCaption);
    }

    public void selectPrivatePost(){
        if ((privateLabel.getAttribute("class")).equals("post-status-label public-status-label")) {
            accessStatus.click();
        }
    }

    public void clickCreatePostButton(){
        createPostButton.click();
    }

    //WebElement accessStatus = driver.findElement(By.xpath("//label[@for=\"customSwitch2\"]"));

    //WebElement privateLabel = driver.findElement(By.xpath(
    //        "//label[contains(@class, \"post-status-label public-status-label\")]"));

    //WebElement createPostButton = driver.findElement(By.id("create-post"));
    //createPostButton.click();

}
