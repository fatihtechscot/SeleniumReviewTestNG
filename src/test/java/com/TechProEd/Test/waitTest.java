package com.TechProEd.Test;

import com.TechProEd.Utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class waitTest extends TestBase {


    @Test
    public void explicitlyWait(){
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");
        driver.findElement(By.xpath("(//*[@type='button'])[1]")).click();
        WebDriverWait webDriverWait = new WebDriverWait(driver,30);
        Boolean message = webDriverWait.
        until(ExpectedConditions.invisibilityOfElementLocated(By.id("message")));
        System.out.println(message);


    }


}
