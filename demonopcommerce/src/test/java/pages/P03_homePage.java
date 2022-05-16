package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class P03_homePage {

    WebDriver driver;

    public P03_homePage(WebDriver driver){
        this.driver = driver;
    }

    public WebElement currency(){
        return driver.findElement(By.xpath("//select[@id=\"customerCurrency\"]//option[@value][2]"));
    }

    public WebElement search(){
        return driver.findElement(By.id("small-searchterms"));
    }

    public WebElement searchKey(){
        return driver.findElement(By.id("q"));
    }

    public WebElement mainMenu(){
        return driver.findElement(By.xpath("//div [@class=\"header-menu\"]  //ul[@class]"));
    }

    public WebElement computersMenu(){
        return driver.findElement(By.xpath("//a[@href=\"/computers\"]"));
    }

    public WebElement softwareMenu(){
        return driver.findElement(By.xpath("//a[@href=\"/software\"]"));
    }

    public WebElement iphoneBanner(){
        return driver.findElement(By.xpath("//*[@id=\"nivo-slider\"]/a[2]"));
    }

    public WebElement iphoneBox(){
        return driver.findElement(By.xpath("//a[@rel=\"1\"]"));
    }

    public WebElement facebook(){
        return driver.findElement(By.linkText("Facebook"));
    }

    public WebElement twitter(){
        return driver.findElement(By.linkText("Twitter"));
    }

    public WebElement youtube(){
        return driver.findElement(By.linkText("YouTube"));
    }

    public WebElement rss(){
        return driver.findElement(By.linkText("RSS"));
    }

    public WebElement notification(){
        return driver.findElement(By.xpath("//div[@id=\"bar-notification\"]//div"));
    }

    public WebElement notificationP(){
        return driver.findElement(By.xpath("//div[@id=\"bar-notification\"]//p"));
    }

    public WebElement wishlist(){
        return driver.findElement(By.id("add-to-wishlist-button-4"));
    }

    public WebElement cart(){
        return driver.findElement(By.id("add-to-cart-button-4"));
    }

    public WebElement MC(){
        return driver.findElement(By.xpath("//div[@class=\"item-box\"][2]//div[@class=\"product-item\"]//div[@class=\"picture\"]"));
    }

}