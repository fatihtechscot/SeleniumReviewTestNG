package com.TechProEd.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class IframeTest {

    static WebDriver driver;

    @BeforeTest
    public static void iframeTest() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void iframeTest1() {
        driver.get("https://the-internet.herokuapp.com/iframe");
        driver.switchTo().frame(0);
        WebElement written = driver.findElement(By.xpath("//p"));
        written.sendKeys("hi, it s me.");
        driver.switchTo().defaultContent();
        WebElement written1= driver.findElement(By.linkText("Elemental Selenium"));
        System.out.println("where is the string see: "+ written1.getText());



    }
















    }








