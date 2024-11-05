package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signin {


    public WebDriver driver;

    public Signin(WebDriver driver) {
        this.driver = driver;
    }


    public void enterEmail(String email) {
        // Create a JavaScript executor instance
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        // Scroll to the email input field
        jsExecutor.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.id("email")));
        // Enter the email in the input field
        driver.findElement(By.id("email")).sendKeys(email);


        }
    public  void enterPassword(String password) {
        driver.findElement(By.id("pass")).sendKeys(password);
    }

    public  void clickSignIn() {
        driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
    }
}
