package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.testng.asserts.SoftAssert;
import pages.P02_login;

import java.util.concurrent.TimeUnit;

public class D02_loginStepDef {

    P02_login login = new P02_login(Hooks.driver);

    @Given("User navigate to website F02")
    public void userNavigateToHttpsDemoNopcommerceCom() {
        Hooks.driver.navigate().to("https://demo.nopcommerce.com/");
        Hooks.driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
    }

    @And("User click on Login tab")
    public void userClickOnLoginTab() {
        login.login().click();
    }

    @When("^User enter (.*) and (.*) and hit enter$")
    public void userEnterEmailAndPasswordAndHitEnter(String email, String password) {
        login.login(email,password);
        login.password().sendKeys(Keys.ENTER);
        Hooks.driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
    }

    @Then("User login and my account tab is displayed")
    public void userLoginAndMyAccountTabIsDisplayed() {
        SoftAssert soft = new SoftAssert();
        soft.assertEquals(Hooks.driver.getCurrentUrl(),"https://demo.nopcommerce.com/");
        soft.assertTrue(login.myAccount().isDisplayed());
        soft.assertAll();

    }
}
