package org.testcraft.stepDefs;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testcraft.Pages.HomePage;
import org.testcraft.Pages.TimetablePage;

import java.io.File;

import static com.sun.jmx.snmp.ThreadContext.contains;

public class Exercise1 {

    public WebDriver driver;
    public static HomePage homepage;
    public static TimetablePage timetablepage;
    public Exercise1() {
        driver = Hooks.driver;
        homepage = new HomePage(driver);
        timetablepage = new TimetablePage(driver);
    }

    @Given("^I am on \"([^\"]*)\"$")
    public void i_am_on(String arg1) throws Throwable {
        driver.get(arg1);
        homepage.assertTitle(); //added for exercise 2

    }

    @When("^I enter journey details from \"([^\"]*)\" to \"([^\"]*)\"$")
    public void i_enter_journey_details_from_to(String arg1, String arg2) throws Throwable {
        homepage.findOriginStation().sendKeys(arg1);
        homepage.findDestinationStation().sendKeys(arg2);
        homepage.setReturn().click();//added for exercise 3
        homepage.setOutTomorrow().click();//added for exercise 3
        homepage.setReturnNextDay().click();//added for exercise 3
    }

    @When("^click \"([^\"]*)\"$")
    public void click(String arg1) throws Throwable {
        homepage.removeGlyphicon().click();
        homepage.findSubmitButton().click();

    }

    @Then("^I am given the times and prices of tickets$")
    public void i_am_given_the_times_and_prices_of_tickets() throws Throwable {
        timetablepage.findTimePriceMatrix().isDisplayed(); //added for exercise 2
    }
}
