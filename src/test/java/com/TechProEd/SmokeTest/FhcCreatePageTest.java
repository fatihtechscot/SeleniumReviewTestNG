package com.TechProEd.SmokeTest;

import com.TechProEd.Pages.FhcCreatPage;
import com.TechProEd.Utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

public class FhcCreatePageTest extends TestBase {
//git init
//git add README.md
//git commit -m "first commit"
//git branch -M main
//git remote add origin https://github.com/fatihtechscot/SeleniumReviewTestNG.git
//git push -u origin main

    @BeforeTest

    public void createPageTest0(){

        driver.get("https://fhctrip-qa.com/HotelAdmin/Create");
        driver.findElement(By.id("UserName")).
                sendKeys("manager2");
        driver.findElement(By.xpath("//*[@type='password']")).
                sendKeys("Man1ager2!"+ Keys.ENTER);

    }

    @Test

    public void test(){


        FhcCreatPage createTest= new FhcCreatPage(driver);
        createTest.AddressBox.sendKeys("Glasgow");
        createTest.codeBox.sendKeys("g53");
        createTest.nameBox.sendKeys("fth");
        createTest.phoneBox.sendKeys("073");
        createTest.email.sendKeys("fkoc@gmail");

        Select slct =new Select(createTest.select);
        slct.selectByIndex(2);
        List<WebElement>  nmes =  slct.getOptions();
        for(WebElement w:nmes){
            System.out.println(w.getText());


        }
        createTest.save.click();
        WebDriverWait wait =new WebDriverWait(driver,60);
        WebElement message = wait.
                until(ExpectedConditions.
                        visibilityOfElementLocated(By.className("bootbox-body")));

        Assert.assertTrue(message.isDisplayed());
        System.out.println(message.getText());


    }






}
