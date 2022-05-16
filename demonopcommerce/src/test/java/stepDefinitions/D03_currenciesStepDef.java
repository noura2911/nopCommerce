package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.asserts.SoftAssert;
import pages.P03_homePage;

import java.util.concurrent.TimeUnit;

public class D03_currenciesStepDef {

    P03_homePage homePage = new P03_homePage(Hooks.driver);
    String pounds;

    @Given("User navigate to website F03")
    public void userNavigateToHttpsDemoNopcommerceCom() {
        Hooks.driver.navigate().to("https://demo.nopcommerce.com/");
        Hooks.driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
    }

    @When("User Select “Euro” from currency dropdown list")
    public void userSelectEuroFromCurrencyDropdownList() {
        homePage.currency().click();
        pounds = "Euro";
    }

    @Then("Currency has been changed from US to Euro")
    public void currencyHasBeenChangedFromUSToEuro() {
        SoftAssert soft = new SoftAssert();
        soft.assertTrue(homePage.currency().getText().contains(pounds));
        soft.assertAll();
    }
}
