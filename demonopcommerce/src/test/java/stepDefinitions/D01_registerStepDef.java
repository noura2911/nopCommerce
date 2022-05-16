package stepDefinitions;

import org.openqa.selenium.Keys;
import org.testng.asserts.SoftAssert;
import pages.P01_register;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.concurrent.TimeUnit;


public class D01_registerStepDef {

    P01_register register = new P01_register(Hooks.driver);
    String password;

    @Given("User navigate to website F01")
    public void userNavigateToHttpsDemoNopcommerceCom() {
            Hooks.driver.navigate().to("https://demo.nopcommerce.com/");
            Hooks.driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
    }

    @When("Click on register tab")
    public void clickOnRegisterTab() {
        register.register().click();
    }

    @And("User choose gender")
    public void userChooseGender() {
        register.gender().click();
    }

    @And("^User enter first name (.*) and last name (.*)$")
    public void userEnterFirstNameAndLastName(String first, String last) {
        register.firstname().sendKeys(first);
        register.lastname().sendKeys(last);

    }

    @And("User select day and month and year")
    public void userSelectDayAndMonthAndYear() {
        register.day().click();
        register.month().click();
        register.year().click();
    }

    @And("^User enter email (.*)$")
    public void userEnterEmail(String email) {
        register.email().sendKeys(email);
    }

    @And("^User enter company name (.*)$")
    public void userEnterCompanyName(String company) {
        register.company().sendKeys(company);
    }

    @And("^User enter password (.*)$")
    public void userEnterPassword(String password) {
        register.password().sendKeys(password);
        this.password = password;
    }

    @And("User enter the same password in confirm password field and hit enter")
    public void userEnterTheSamePasswordInConfirmPasswordFieldAndHitEnter() {
        register.password2().sendKeys(password);
        register.password2().sendKeys(Keys.ENTER);
        Hooks.driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
    }

    @Then("User registered and success message is displayed")
    public void userRegisteredAndSuccessMessageIsDisplayed() {
        SoftAssert soft = new SoftAssert();
        soft.assertTrue(register.result().getText().contains("Your registration completed"));
        soft.assertEquals(register.result().getCssValue("color"), "rgba(76, 177, 124, 1)");
        soft.assertAll();

    }
}
