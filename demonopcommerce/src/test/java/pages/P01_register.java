package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class P01_register {
    WebDriver driver = null;

    public P01_register(WebDriver driver){
        this.driver = driver;
    }

    public WebElement register(){
        return driver.findElement(By.className("ico-register"));
    }

    public WebElement gender(){
        return driver.findElement(By.id("gender-female"));
    }

    public WebElement firstname(){
        return driver.findElement(By.id("FirstName"));

    }

    public WebElement lastname(){
        return driver.findElement(By.id("LastName"));
    }

    public WebElement day(){
        return driver.findElement(By.xpath("//select[@name=\"DateOfBirthDay\"]  //option [@value=\"10\"]"));
    }
    public WebElement month(){
        return driver.findElement(By.xpath("//select[@name=\"DateOfBirthMonth\"]  //option [@value=\"10\"]"));
    }
    public WebElement year(){
        return driver.findElement(By.xpath("//select[@name=\"DateOfBirthYear\"]  //option [@value=\"1990\"]"));
    }

    public WebElement email(){
        return driver.findElement(By.id("Email"));
    }

    public WebElement company(){
        return driver.findElement(By.id("Company"));
    }

    public WebElement password(){
        return driver.findElement(By.id("Password"));
    }

    public WebElement password2(){
        return driver.findElement(By.id("ConfirmPassword"));
    }

    public WebElement result(){
        return driver.findElement(By.className("result"));
    }

}
