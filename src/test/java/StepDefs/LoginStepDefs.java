package StepDefs;

import cucumber.api.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LoginStepDefs {

    WebDriver driver ;

    @Given("^Chrome Browser is opened$")
    public void chrome_Browser_is_opened(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ARNABBAN\\IdeaProjects\\OrangeHRM\\src\\chromedriver.exe");
        driver = new ChromeDriver();
        System.out.println("Chrome is opened");
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
    }

    @Given("^User is on Orange HRM Login Page$")
    public void user_is_on_Orange_HRM_Login_Page(){
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        String expectedTitle = "OrangeHRM";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(expectedTitle,actualTitle);
    }

    @When("^<Username> and <Password> is entered$")
    public void username_and_Password_is_entered(){
        /*driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin123");*/
    }

    @Then("^User should be logged into Homepage$")
    public void user_should_be_logged_into_Homepage(){
        driver.quit();
    }

}
