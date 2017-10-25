package org.testcraft.Pages;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

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

    public WebElement removeGlyphicon(){
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

}

