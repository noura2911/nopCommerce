package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.testng.asserts.SoftAssert;
import pages.P03_homePage;

import java.util.concurrent.TimeUnit;

public class D04_searchStepDef {

    P03_homePage homePage = new P03_homePage(Hooks.driver);
    String searchProduct;


    @Given("User navigate to website F04")
    public void userNavigateToHttpsDemoNopcommerceCom() {
        Hooks.driver.navigate().to("https://demo.nopcommerce.com/");
        Hooks.driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
    }

    @When("User enter nokia in search box and hit enter")
    public void userEnterNokiaInSearchBoxAndHitEnter() {
        String product = "nokia";
        homePage.search().sendKeys(product);
        homePage.search().sendKeys(Keys.ENTER);
        searchProduct = product;
    }

    @When("User enter N_1020_LU in search box and hit enter")
    public void userEnterN_1020_LUInSearchBoxAndHitEnter() {
        String product = "N_1020_LU";
        homePage.search().sendKeys(product);
        homePage.search().sendKeys(Keys.ENTER);
        searchProduct = product;
    }

    @Then("User found nokia product")
    public void userFoundNokiaProduct() {
        SoftAssert soft = new SoftAssert();
        soft.assertEquals(homePage.searchKey().getAttribute("value"),searchProduct);
        soft.assertAll();
    }


}
