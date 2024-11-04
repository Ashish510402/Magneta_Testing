package Feature;

import java.time.Duration;

import io.cucumber.java.en.And;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Signin;
import pages.Createaccount;
import pages.chromeopen;


public class Stepdefinitions {


    WebDriver driver;
    Createaccount createaccount;
    Signin signin;

    @Given("launch the Browser")
    public void launch_the_browser() {
        driver = chromeopen.getChromeDriver();
        driver.get("https://magento.softwaretestingboard.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }

    @When("Click on create an Account button")
    public void click_on_createanaccount_button() {
        driver.findElement(By.linkText("Create an Account")).click();
        createaccount = new Createaccount(driver);
    }


    @When("Enter first name {string}, last name {string}, email {string}, password {string}, confirmpassword = {string}")
    public void enter_account_detail(String firstName, String lastName, String email, String password, String confirmpassword) throws InterruptedException {
        createaccount.enterFirstName(firstName);
        createaccount.enterLastName(lastName);
        createaccount.enterEmail(email);
        createaccount.enterPassword(password);
        createaccount.confirmPassword(confirmpassword);

        createaccount.clickCreateAccount();
        Thread.sleep(3000);
}

    @Then ("Click on the logout")
    public void click_on_dropdown() throws InterruptedException {
        createaccount.clickondropdown();
   }

    @And("Click on the Sign out")
    public void click_sign_out() throws InterruptedException {
        Thread.sleep(3000);
        createaccount.clicksignout();
        Thread.sleep(3000);
    }

    @When("Click on Sign In button")
    public void click_on_sign_in_button() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[2]/a")).click();
        Thread.sleep(3000);
        signin = new Signin(driver);
    }

    @When("Enter email {string} , password {string}")
    public void enter_login_details(String Email, String Password) throws InterruptedException {
        signin.enterEmail(Email);
        Thread.sleep(3000);
        signin.enterPassword(Password);
        Thread.sleep(3000);
        signin.clickSignIn();
    }

}
