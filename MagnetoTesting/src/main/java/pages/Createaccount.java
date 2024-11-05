package pages;

import org.openqa.selenium.*;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Createaccount {

        public WebDriver driver;

        public Createaccount(WebDriver driver) {
          driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
          this.driver = driver;
        }

    public void enterFirstName(String firstName) {
       WebElement firstname = driver.findElement(By.id("firstname"));
       firstname.sendKeys(firstName);
    }

    public void enterLastName(String lastName) {
        WebElement lastname = driver.findElement(By.id("lastname"));
        lastname.sendKeys(lastName);
    }

    public void enterEmail(String email) {
        WebElement Email = driver.findElement(By.id("email_address"));
        Email.sendKeys(email);
    }

    public void enterPassword(String password) {
        WebElement pass = driver.findElement(By.id("password"));
        pass.sendKeys(password);
    }

    public void confirmPassword(String confirmpassword) {
        WebElement confirmpass = driver.findElement(By.id("password-confirmation"));
        confirmpass.sendKeys(confirmpassword);
    }



//    public void clickCreateAccount() {
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
//        WebElement createAccountButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit' and @class='action submit primary']")));
//        createAccountButton.click();
//
//    }
    public void clickCreateAccount() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        // Locate the "Create Account" button
        WebElement createAccountButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit' and @class='action submit primary']")));
        // Scroll to the "Create Account" button using JavaScript
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", createAccountButton);

        // Wait briefly to ensure scroll has completed, then click the button
        createAccountButton.click();
    }


    public void clickondropdown() throws InterruptedException {
        WebElement dropdown = driver.findElement(By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[2]/span/button"));
        Thread.sleep(5000);
        dropdown.click();
    }

    public void clicksignout(){
        WebElement signout =driver.findElement(By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[2]/div/ul/li[3]/a"));
            signout.click();
    }

}


