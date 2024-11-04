package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signin {


    private WebDriver driver;

    public Signin(WebDriver driver) {
        this.driver = driver;
    }


    public  void enterEmail(String email) {
        driver.findElement(By.id("email")).sendKeys(email);
    }


    public  void enterPassword(String password) {
        driver.findElement(By.id("pass")).sendKeys(password);
    }

    public  void clickSignIn() {
        driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
    }
}
