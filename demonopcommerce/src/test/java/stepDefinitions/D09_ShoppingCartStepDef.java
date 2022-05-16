package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.asserts.SoftAssert;
import pages.P03_homePage;

import java.util.concurrent.TimeUnit;

public class D09_ShoppingCartStepDef {

    P03_homePage homePage = new P03_homePage(Hooks.driver);


    @Given("User navigate to website F09")
    public void userNavigateToHttpsDemoNopcommerceCom() {
        Hooks.driver.navigate().to("https://demo.nopcommerce.com/");
        Hooks.driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
    }

    @When("User choose a random product and click on add to shopping cart button")
    public void userChooseARandomProductAndClickOnAddToShoppingCartButton() throws InterruptedException {
        homePage.MC().click();
        homePage.cart().click();
        Hooks.driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
        Thread.sleep(1000);


    }

    @Then("message appears says The product has been added to your shopping cart")
    public void messageAppearsSaysTheProductHasBeenAddedToYourShoppingCart() {
        SoftAssert soft = new SoftAssert();
        soft.assertEquals(homePage.notificationP().getText(),"The product has been added to your shopping cart");
        soft.assertEquals(homePage.notification().getCssValue("background-color"), "rgba(75, 176, 122, 1)");
        soft.assertAll();
    }
}
