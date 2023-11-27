import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import java.time.Duration;

public class TestProfileWIthDataProviders {

    private WebDriver driver;
    WebDriverWait wait;


    public static void main (String[] args) {}

    @BeforeSuite
    protected final void setUpTestSuite() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeTest
    protected final void setUpMethod() {
        this.driver = new ChromeDriver();
        this.driver.manage().window().maximize();
    }

    @BeforeMethod
    protected void loginMethod(){
        String usernameToPass = "stanig1";
        String passwordToPass = "Q12345";

        this.wait = new WebDriverWait(this.driver,Duration.ofSeconds(600));
        this.driver.get("http://training.skillo-bg.com:4300/users/login");
        wait.until(ExpectedConditions.urlToBe("http://training.skillo-bg.com:4300/users/login"));

        WebElement username = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("defaultLoginFormUsername")));
        username.sendKeys(usernameToPass);

        WebElement password = driver.findElement(By.id("defaultLoginFormPassword"));
        password.sendKeys("passwordToPass");

        WebElement signInButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("sign-in-button")));
        signInButton.click();
    }


    @AfterMethod
    protected final void closeTest(){
        if (this.driver != null) {
            this.driver.close();
        }
    }

    @DataProvider(name="profileData")
    public Object [][] profileData() {
        return new Object[][]{
                {"TestUserUserUserUser", "stanig1"}
        };
    }

    @Test
    public void testCreatePrivatePost() {
        // Check if logged in
        wait.until(ExpectedConditions.urlToBe("http://training.skillo-bg.com:4300/posts/all"));

        // Click on "Profile" to open User profile page
        WebElement profileLink = this.wait.until(ExpectedConditions.presenceOfElementLocated(By.id("nav-link-profile")));
        profileLink.click();

        // Check if on Profile page
        wait.until(ExpectedConditions.urlContains("http://training.skillo-bg.com:4300/users/"));

        //Click on New Post
        // Tried to locate the + icon in the User profile but unsuccessfully
        WebElement newPost = driver.findElement(By.id("nav-link-new-post"));
        newPost.click();

        //Check if Create post page is loaded
        wait.until(ExpectedConditions.urlToBe("http://training.skillo-bg.com:4300/posts/create"));

        //Fill in Post form - Upload photo
        WebElement uploadPicture = driver.findElement(By.xpath("//input[@class=\"ng-untouched ng-pristine ng-invalid\"]"));
        uploadPicture.sendKeys("D:\\QA\\QA Automation course Skillo\\Projects\\Stanislava_sk_automation_course_2023\\cardinal-1884283_640.jpg");

        //Fill in Post form - Enter post caption
        WebElement postCaption = driver.findElement(By.name("caption"));
        postCaption.sendKeys("Cardinal post caption");

        //Fill in post form - Check public/private checkbox and click for private if needed
        WebElement accessStatus = driver.findElement(By.xpath("//label[@for=\"customSwitch2\"]"));
        WebElement privateLabel = driver.findElement(By.xpath(
                "//label[contains(@class, \"post-status-label public-status-label\")]"));
        System.out.println(privateLabel.getAttribute("class"));
        if ((privateLabel.getAttribute("class")).equals("post-status-label public-status-label")){
            accessStatus.click();
        }

        //Click "Create post" button
        WebElement createPostButton = driver.findElement(By.id("create-post"));
        createPostButton.click();

        // Check if url changed back to User profile
        wait.until(ExpectedConditions.urlContains("http://training.skillo-bg.com:4300/users/"));

        // Check post in Private filter
        // Could not select the "Private" filter
        // When "Private" filter selected cannot identify the created post
    }

    @Test (dataProvider = "profileData")
    public void testFollowUser(String followedUserName, String myUSer) {
        // Check if Home page is loaded
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        wait.until(ExpectedConditions.urlContains("http://training.skillo-bg.com:4300/posts/"));
        WebElement postsContainer = driver.findElement(By.xpath("//div[@class=\"col-12 offset-md-3 col-md-6 all-users-container\"]"));
        wait.until(ExpectedConditions.visibilityOf(postsContainer));

        // Find user and click on
        WebElement userToFollow = driver.findElement(By.xpath("//a[contains(text(), \"followedUserName\")]"));
        wait.until(ExpectedConditions.visibilityOf(userToFollow));
        userToFollow.click();
        wait.until(ExpectedConditions.urlContains("http://training.skillo-bg.com:4300/users"));

        // Check if followed and follow if not
        WebElement folllowButton = driver.findElement(By.xpath("//button[@class=\"btn btn-primary profile-edit-btn ng-star-inserted\"]"));
        wait.until(ExpectedConditions.visibilityOf(folllowButton));
        if (folllowButton.getText().equals("Unfollow")){
            System.out.println("This user is already followed");
        } else {
            folllowButton.click();

            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

            // Open own User profile
            WebElement profileLink = driver.findElement(By.id("nav-link-profile"));
            profileLink.click();

            //Check if own User profile is loaded
            wait.until(ExpectedConditions.textToBe(By.xpath("//h2[contains(text(), \"myUSer\")]"), "stanig1"));

            // Click on "Following"
            WebElement followingUsersLink = driver.findElement(By.id("following"));
            followingUsersLink.click();

            // Check if followed user is available
            WebElement followedUser = driver.findElement(By.xpath("//a[contains(text(), \"followedUserName\")]"));

        }
    }
}

