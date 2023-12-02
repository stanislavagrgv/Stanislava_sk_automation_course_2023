package L15;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Homework_15 {
    WebDriver driver;
    WebDriverWait wait;

    @BeforeSuite
    protected final void setUpTestSuite() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeTest
    protected final void setUpMethod() {
        this.driver = new ChromeDriver();
        this.driver.manage().window().maximize();
    }

    @AfterMethod
    protected final void closeTest(){
        if (this.driver != null) {
            this.driver.close();
        }
    }

    @Test
    public void testAddRemoveElements() {

        // Open page "https://the-internet.herokuapp.com/add_remove_elements/"
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");

        // Click on "Add element" button  - add 1st element
        WebElement addElementButton = driver.findElement(By.xpath("//button[@onclick=\"addElement()\"]"));
        addElementButton.click();

        // Check for "Delete" buttons -> expected 1
        WebElement addedElements = driver.findElement(By.id("elements"));
        List<WebElement> elements = addedElements.findElements(By.tagName("button"));
        Assert.assertEquals(elements.size(), 1);

        // Click on "Add element" button - add 2nd element
        //Click on "Add element" button - add 3rd
        addElementButton.click();
        addElementButton.click();

        //Check the number of added elements - expected 3 "Delete" buttons
        WebElement addedNewElements = driver.findElement(By.id("elements"));
        List<WebElement> newElements = addedElements.findElements(By.tagName("button"));
        Assert.assertEquals(newElements.size(), 3);

        //Click on the 2nd "Delete" button
        newElements.get(1).click();

        //Check the number of remained elements - expected 2
        WebElement afterRemovalElements = driver.findElement(By.id("elements"));
        List<WebElement> afterRemovedElements = addedElements.findElements(By.tagName("button"));
        Assert.assertEquals(afterRemovedElements.size(), 2);

    }

//    @Test
//        public void testBasicAuth() {
//            // Open page "https://the-internet.herokuapp.com/basic_auth"
//            driver.get("https://the-internet.herokuapp.com/basic_auth");
//
//            // devTools???
//        }

        @Test
            public void testCheckBoxes() {
            //Open page "https://the-internet.herokuapp.com/checkboxes"
            driver.get("https://the-internet.herokuapp.com/checkboxes");

            // Locate checkbox 2
            WebElement checkBoxesGroup = driver.findElement(By.id("checkboxes"));
            List <WebElement> checkboxes = checkBoxesGroup.findElements(By.tagName("input"));

            //Check if checkbox 2 is selected and if selected unselect
            if (checkboxes.get(1).isSelected()){
                checkboxes.get(1).click();
            }

            //Check if checkbox 2 is now unselected
            Assert.assertFalse(checkboxes.get(1).isSelected());

        }

        @Test
            public void testContextMenu() {

            // Open page "https://the-internet.herokuapp.com/context_menu"
            driver.get("https://the-internet.herokuapp.com/context_menu");

            // Right-click on the box (id="hot-spot")
            WebElement spotToRightClick = driver.findElement(By.id("hot-spot"));
            Actions action = new Actions(driver);
            action.contextClick(spotToRightClick).perform();

            // Check for text on alert window, expected "You selected a context menu"
            Alert alert = driver.switchTo().alert();
            Assert.assertEquals(alert.getText(), "You selected a context menu");

            //Confirm alert window to close
            alert.accept();

        }

        @Test
            public void testDropDown() {

            // Open page "https://the-internet.herokuapp.com/dropdown"
            driver.get("https://the-internet.herokuapp.com/dropdown");

            // Check drop-down selected value
            WebElement dropDown = driver.findElement(By.id("dropdown"));
            //System.out.println(dropDown.getText());

            Select select = new Select(dropDown);
            WebElement selectionOfDropDown = select.getFirstSelectedOption();
            String selectedOptionText = selectionOfDropDown.getText();

            // Dropdown options

            //List <WebElement> dropDownOptions = select.getOptions();

            // If selected value != "Option 2" select "Option 2"
            if (!selectedOptionText.equals("Option 2")){
                select.selectByVisibleText("Option 2");
            } else {
                System.out.println("Option 2 is already selected");
            }
     }

}
