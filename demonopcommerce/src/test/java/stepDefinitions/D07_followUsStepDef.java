package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.asserts.SoftAssert;
import pages.P03_homePage;

import java.util.concurrent.TimeUnit;


public class D07_followUsStepDef {

    P03_homePage homePage = new P03_homePage(Hooks.driver);

    @Given("User navigate to website F07")
    public void userNavigateToHttpsDemoNopcommerceCom() {
        Hooks.driver.navigate().to("https://demo.nopcommerce.com/");
        Hooks.driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
    }

    @When("User click on Facebook link and Twitter link and Youtube link and RSS link")
    public void userClickOnFacebookLinkAndTwitterLinkAndYoutubeLinkAndRSSLink() throws InterruptedException {
        homePage.facebook().click();
        Thread.sleep(2000);
        homePage.twitter().click();
        Thread.sleep(2000);
        homePage.youtube().click();
        Thread.sleep(2000);
        homePage.youtube().click();
        Hooks.driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);


    }

    @Then("Facebook page opens and Twitter page opens and Youtube page opens and RSS page opens")
    public void facebookPageOpensAndTwitterPageOpensAndYoutubePageOpensAndRSSPageOpens() {
        SoftAssert soft = new SoftAssert();
        soft.assertEquals(homePage.facebook().getAttribute("href"),"http://www.facebook.com/nopCommerce");
        soft.assertEquals(homePage.twitter().getAttribute("href"),"https://twitter.com/nopCommerce");
        soft.assertEquals(homePage.youtube().getAttribute("href"),"http://www.youtube.com/user/nopCommerce");
        soft.assertEquals(homePage.rss().getAttribute("href"),"https://demo.nopcommerce.com/news/rss/1");
        soft.assertAll();
    }
}
