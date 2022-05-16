package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.asserts.SoftAssert;
import pages.P03_homePage;

import java.util.concurrent.TimeUnit;

public class D08_WishlistStepDef {

    P03_homePage homePage = new P03_homePage(Hooks.driver);

    @Given("User navigate to website F08")
    public void userNavigateToHttpsDemoNopcommerceCom() {
        Hooks.driver.navigate().to("https://demo.nopcommerce.com/");
        Hooks.driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
    }

    @When("User choose a random product and click on add to wishlist icon")
    public void userChooseARandomProductAndClickOnAddToWishlistIcon() throws InterruptedException {
        homePage.MC().click();
        homePage.wishlist().click();
        Hooks.driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
        Thread.sleep(1000);



    }

    @Then("message appears says The product has been added to your wishlist")
    public void messageAppearsSaysTheProductHasBeenAddedToYourWishlist() {
        SoftAssert soft = new SoftAssert();
        soft.assertEquals(homePage.notificationP().getText(),"The product has been added to your wishlist");
        soft.assertEquals(homePage.notification().getCssValue("background-color"), "rgba(75, 176, 122, 1)");
        soft.assertAll();
    }
}
