package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P02_login {
    WebDriver driver = null;

    public P02_login(WebDriver driver){
        this.driver = driver;
    }

    public WebElement login(){
        return driver.findElement(By.className("ico-login"));
    }

    public WebElement email(){
        return driver.findElement(By.id("Email"));
    }

    public WebElement password(){
        return driver.findElement(By.id("Password"));
    }

    public WebElement myAccount(){
        return driver.findElement(By.className("ico-account"));
    }

    public void login(String email, String password){
        email().sendKeys(email);
        password().sendKeys(password);
    }

}
