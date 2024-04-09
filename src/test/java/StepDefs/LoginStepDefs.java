package StepDefs;

import cucumber.api.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginStepDefs {

    WebDriver driver ;

    @Given("^Chrome Browser is opened$")
    public void chrome_Browser_is_opened(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ARNABBAN\\IdeaProjects\\OrangeHRM\\src\\chromedriver.exe");
        driver = new ChromeDriver();
        System.out.println("Chrome is opened");
        driver.manage().window().maximize();
    }

    @Given("^User is on Orange HRM Login Page$")
    public void user_is_on_Orange_HRM_Login_Page(){
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        System.out.println(driver.getPageSource());
        String expectedTitle = "OrangeHRM";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(expectedTitle,actualTitle);
        driver.close();
    }

    @When("^<Username> and <Password> is entered$")
    public void username_and_Password_is_entered(){
        System.out.println("Test");
    }

    @Then("^User should be logged into Homepage$")
    public void user_should_be_logged_into_Homepage(){
        System.out.println("Test");
    }

}
