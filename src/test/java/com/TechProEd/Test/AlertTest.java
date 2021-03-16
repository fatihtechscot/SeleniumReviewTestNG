package com.TechProEd.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class AlertTest {
    static WebDriver driver;
    @BeforeTest
    public static void test01() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }
        @Test
        public void alertTest() {

            driver.get("https://the-internet.herokuapp.com/javascript_alerts");
            WebElement alertButton = driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
            alertButton.click();
        }
        @Test
        public void alertPrompt() {

            driver.get("https://the-internet.herokuapp.com/javascript_alerts");
            WebElement promptButton = driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));
            promptButton.click();

            driver.switchTo().alert().sendKeys("it s me");
            driver.switchTo().alert().accept();
        }
        @Test
    public void alertConfirm(){
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        WebElement alertConfirm=driver.findElement(By.cssSelector("button[onclick='jsConfirm()']"));
        alertConfirm.click();
        String confirmText=driver.switchTo().alert().getText();
        driver.switchTo().alert().accept();

        Assert.assertEquals("I am a JS Confirm",confirmText);







    }


}
