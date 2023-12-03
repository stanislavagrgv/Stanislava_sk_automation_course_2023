package L16;

import L16_Pages.NewPostPage;
import org.testng.annotations.*;
import L16_Pages.HomePage;
import L16_Pages.LoginPage;

public class ProfileTests extends TestBase {

    @DataProvider(name="postData")
    public Object [][] postData() {
        return new Object[][]{
                {"stanig1", "Q12345", "D:\\QA\\QA Automation course Skillo\\Projects\\Stanislava_sk_automation_course_2023\\cardinal-1884283_640.jpg", "My new post"},
        };
    }
//    @DataProvider(name="profileData")
//    public Object [][] profileData() {
//        return new Object[][]{
//                {"stanig1", "Q12345","TestUserUserUserUser", "stanig1"}
//        };
//    }

    @Test(dataProvider = "postData")
    public void testToCreatePrivatePost(String loginUsername, String loginPassword, String picturefullPath, String postCaption) {

    LoginPage loginPage = new LoginPage(super.getDriver());
    loginPage.navigateTo();
    loginPage.isUrlLoaded();

    loginPage.fillInUsername(loginUsername);
    loginPage.fillInPassword(loginPassword);
    loginPage.clickSignInButton();

    HomePage homePage = new HomePage(super.getDriver());
    // homePage.isHomePageUrlLoaded();
    homePage.clickOnProfileLink();

    NewPostPage newPost = new NewPostPage(super.getDriver());
    newPost.clickNewPostLink();
    newPost.isUrlLoaded();

    newPost.uploadPicture(picturefullPath);
    newPost.fillInCaption(postCaption);
    newPost.selectPrivatePost();
    newPost.selectPrivatePost();
    newPost.clickCreatePostButton();

    }

}