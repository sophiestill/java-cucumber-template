package org.testcraft.stepDefs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testcraft.Pages.HomePage;
import org.testcraft.Pages.TimetablePage;

public class Exercise1 {

    public WebDriver driver;
    public static HomePage homePage;
    public static TimetablePage timetablePage;
    public Exercise1() {
        driver = Hooks.driver;

        homePage = new HomePage(driver);
        timetablePage = new TimetablePage(driver);
    }

    @Given("^I am on \"([^\"]*)\"$")
    public void i_am_on(String arg1) throws Throwable {
        driver.get(arg1);
        homePage.assertTitle(); //added for exercise 2

    }

    @When("^I enter journey details from \"([^\"]*)\" to \"([^\"]*)\"$")
    public void i_enter_journey_details_from_to(String arg1, String arg2) throws Throwable {
        homePage.findOriginStation().sendKeys(arg1);
        homePage.findDestinationStation().sendKeys(arg2);

    }

    @When("^click \"([^\"]*)\"$")
    public void click(String arg1) throws Throwable {
        homePage.removeCookiesGlyphicon().click();
        homePage.findSubmitButton().click();

    }

    @Then("^I am given the times and prices of tickets$")
    public void i_am_given_the_times_and_prices_of_tickets() throws Throwable {
        timetablePage.findTimePriceMatrix().isDisplayed(); //added for exercise 2
    }
//exercise 3
    @When("^select the return radio element$")
    public void select_the_return_radio_element() throws Throwable {
        homePage.setReturn().click();//added for exercise 3
    }
    @When("^click the tomorrow button$")
    public void click_the_tomorrow_button() throws Throwable {
        homePage.setOutTomorrow().click();//added for exercise 3
    }
    @When("^click the next day button$")
    public void click_the_next_day_button() throws Throwable {
        homePage.setReturnNextDay().click();//added for exercise 3
    }
    //exercise 5
    @When("^I select an outdate \"([^\"]*)\" days in the future$")
    public void i_select_an_outdate_days_in_the_future(int arg1) throws Throwable {
    homePage.selectCalendarOutDate(arg1);
    }

}

