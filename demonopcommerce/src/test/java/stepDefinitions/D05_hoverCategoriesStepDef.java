package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;
import pages.P03_homePage;

import java.util.concurrent.TimeUnit;

public class D05_hoverCategoriesStepDef {

    P03_homePage homePage = new P03_homePage(Hooks.driver);
    Actions hover = new Actions(Hooks.driver);


    @Given("User navigate to website F05")
    public void userNavigateToHttpsDemoNopcommerceCom() {
        Hooks.driver.navigate().to("https://demo.nopcommerce.com/");
        Hooks.driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
    }

    @When("User hover and select random category")
    public void userHoverAndSelectRandomCategory() {
        hover.moveToElement(homePage.mainMenu()).perform();
        hover.moveToElement(homePage.computersMenu()).perform();
    }

    @When("User click on random sub-category")
    public void userClickOnRandomSubCategory() {
        hover.moveToElement(homePage.softwareMenu());
        hover.click().build().perform();
    }

    @Then("User redirect to sub-category page")
    public void userRedirectToSubCategoryPage() {
        SoftAssert soft = new SoftAssert();
        soft.assertEquals(Hooks.driver.getCurrentUrl(), "https://demo.nopcommerce.com/software");
        soft.assertAll();
    }
}
