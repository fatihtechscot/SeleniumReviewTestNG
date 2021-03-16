package com.TechProEd.Test;

import com.TechProEd.Utilities.TestBase;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.util.Set;

public class WindowHandles extends TestBase {
     @Test

    public void windowHandle() throws InterruptedException {

         driver.get("https://dictionary.cambridge.org/");
         System.out.println(driver.getWindowHandle());
         driver.findElement(By.xpath("(//a[@class='ha'])[1]")).click();
         Thread.sleep(3000);

         driver.switchTo().window(driver.getWindowHandle());
        // driver.switchTo().alert().accept();
     }
         @Test
    public void windowHandle01() throws InterruptedException {

         String handle="";
         driver.get("https://the-internet.herokuapp.com/windows");
         System.out.println(driver.getWindowHandle());

         driver.findElement(By.partialLinkText("Click Here")).click();
             Set<String>  allwindowhandles =driver.getWindowHandles();
             for(String w: allwindowhandles){
                 if(w!=driver.getWindowHandle()){
                 handle=driver.getWindowHandle();
                 System.out.println(handle);}
             }
             Thread.sleep(3000);
             System.out.println(allwindowhandles);
         driver.switchTo().window(driver.getWindowHandle());
         Thread.sleep(3000);













     }





}
