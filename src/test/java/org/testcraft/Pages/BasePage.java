package org.testcraft.Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testcraft.stepDefs.Hooks;

import static org.testcraft.stepDefs.Hooks.driver;

public class BasePage {
    WebDriver driver;
    BasePage (WebDriver driver) {this.driver= Hooks.driver;}


    public void findElemementByXpath (String xpath) {driver.findElement(By.xpath(xpath));}
}

