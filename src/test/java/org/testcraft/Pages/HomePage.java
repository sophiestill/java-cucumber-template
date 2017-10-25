package org.testcraft.Pages;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.LocalDate;
import java.util.Calendar;

public class HomePage extends BasePage {


    public HomePage(WebDriver driver) {
        super(driver);
    }

    public WebElement findOriginStation() {
        WebElement result = driver.findElement(By.id("originStation"));
        return result;
    }

    public WebElement findDestinationStation() {
        WebElement result = driver.findElement(By.id("destinationStation"));
        return result;
    }

    public WebElement setReturn() {
        WebElement result = driver.findElement(By.id("journey-type-return"));
        return result;
    }

    public WebElement setOutTomorrow() {
        WebElement result = driver.findElement(By.xpath("//*[@id=\"extendedSearchForm\"]/div[3]/div[1]/div/div[1]/button[2]"));
        return result;
    }

    public WebElement setReturnNextDay(){
        WebElement result = driver.findElement(By.xpath("//*[@id=\"extendedSearchForm\"]/div[3]/div[2]/div/div[1]/button[2]"));
        return result;
    }

    public WebElement removeCookiesGlyphicon(){
        WebElement result = driver.findElement(By.cssSelector(".glyphicon-remove.is-alone"));
        return result;
    }
    public WebElement findSubmitButton(){
        WebElement result = driver.findElement(By.id("submitButton"));
        return result;
    }
    public void assertTitle(){
        String title = driver.getTitle();
        Assert.assertTrue("'Trainline' must be in the title", title.contains("Trainline"));
    }

    public void selectCalendarOutDate(int daysAhead){
        driver.findElement(By.id("outDate")).click();
        Calendar cal = Calendar.getInstance();
        LocalDate today = LocalDate.now();
        LocalDate futuredate = today.plusDays(daysAhead); //now have date to look for in calendar
        //while futuredate

        //while the month is not on the screen, click next
    }


}

