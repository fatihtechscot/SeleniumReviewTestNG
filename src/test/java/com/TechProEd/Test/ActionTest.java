package com.TechProEd.Test;

import com.TechProEd.Utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class ActionTest extends TestBase {

    @Test
    public void rightClick() {

        driver.get("https://www.nba.com/games");

        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.xpath("(//*[@data-content='Players'])[1]"))).
                moveToElement(driver.findElement(By.xpath("(//a[@*='Home'])[1]"))).
                click().build().perform();

        actions.sendKeys(Keys.END);
    }
    @Test
            public void sendKeys(){

      driver.get("https://www.google.com/");
      Actions  act= new Actions(driver);
        WebElement wbment=driver.findElement(By.name("q"));
        act.moveToElement(wbment).click().
                sendKeys("silent").
                click().
                perform();
        System.out.println("see"+wbment.getText());







    }


}
