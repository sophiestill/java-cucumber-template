package org.testcraft.Pages;

import jdk.nashorn.internal.ir.ReturnNode;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TimetablePage extends BasePage{

    public TimetablePage(WebDriver driver) {
        super(driver);
    }

    public WebElement findTimePriceMatrix(){
        WebElement result = driver.findElement(By.cssSelector(".matrix-table.matrix-out"));
        return result;
    }
}
