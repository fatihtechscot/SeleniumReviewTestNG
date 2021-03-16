package com.TechProEd.Test;

import com.TechProEd.Utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class webtable extends TestBase {

        @Test
    public void webTable(){
        driver.get("https://www.nba.com/players");
            List<WebElement> webElement0= driver.findElements(By.xpath("//table//th"));
            List<WebElement> webElement1= driver.findElements(By.xpath("//tbody//tr"));
            WebElement webElement2=driver.findElement(By.xpath("//tbody//tr[5]/td[6]"));
            System.out.println(webElement2.getText());
            for(WebElement w: webElement0) {

            System.out.println(w.getText() +" " + webElement0.get(1).getText()
                        + " " + webElement0.size());


            }

            for(WebElement k:webElement1){
            System.out.println(k.getText());
     }

    }

}
