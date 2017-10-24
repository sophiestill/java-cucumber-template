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

import java.io.File;

import static com.sun.jmx.snmp.ThreadContext.contains;

public class Exercise1 {
    public WebDriver driver;

    public Exercise1() {
        driver = Hooks.driver;
    }

    @Given("^I am on \"([^\"]*)\"$")
    public void i_am_on(String arg1) throws Throwable {
        driver.get(arg1);
        String title = driver.getTitle();//added for exercise 2
        Assert.assertTrue("'Trainline' must be in the title", title.contains("Trainline")); //added for exercise 2

    }

    @When("^I enter journey details from \"([^\"]*)\" to \"([^\"]*)\"$")
    public void i_enter_journey_details_from_to(String arg1, String arg2) throws Throwable {
        driver.findElement(By.id("originStation")).sendKeys(arg1, Keys.TAB);
        driver.findElement(By.id("destinationStation")).sendKeys(arg2, Keys.TAB);
    }

    @When("^click \"([^\"]*)\"$")
    public void click(String arg1) throws Throwable {
        driver.findElement(By.cssSelector(".glyphicon-remove.is-alone")).click();
        driver.findElement(By.id("submitButton")).click();

    }

    @Then("^I am given the times and prices of tickets$")
    public void i_am_given_the_times_and_prices_of_tickets() throws Throwable {
        driver.findElement(By.cssSelector(".matrix-table.matrix-out")).isDisplayed(); //added for exercise 2
        //if Assert.fail("this fail");
    }
}
