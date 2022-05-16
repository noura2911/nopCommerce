package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.asserts.SoftAssert;
import pages.P03_homePage;
import java.util.concurrent.TimeUnit;

public class D06_homeSlidersStepDef {

    P03_homePage homePage = new P03_homePage(Hooks.driver);


    @Given("User navigate to website F06")
    public void userNavigateToHttpsDemoNopcommerceCom() {
        Hooks.driver.navigate().to("https://demo.nopcommerce.com/");
        Hooks.driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
    }

    @When("User click on iphone banner small box and click on iphone6 banner")
    public void userClickOnIphoneBannerSmallBoxAndClickOnIphoneBanner() throws InterruptedException {
        homePage.iphoneBox().click();
        homePage.iphoneBanner().click();

    }

    @Then("User could click on the banner and redirected to the iphone6 page")
    public void userCouldClickOnTheBannerAndRedirectedToTheIphonePage() {
        SoftAssert soft = new SoftAssert();
        soft.assertEquals(homePage.iphoneBanner().getAttribute("href"), "http://demo.nopcommerce.com/");
        soft.assertAll();

    }


}
