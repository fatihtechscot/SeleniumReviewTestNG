package com.TechProEd.Test;

import com.TechProEd.Utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.swing.*;
import javax.swing.plaf.synth.SynthTextAreaUI;
import java.nio.file.Files;
import java.nio.file.Paths;

public class UploadandDownloadFile extends TestBase {


    @Test
    public void checkfolder(){

        System.getProperty("user.dir");
        System.out.println(System.getProperty("user.dir"));
        System.getProperty("user.home");
        System.out.println(System.getProperty("user.home"));

        boolean exist = Files.exists(Paths.get("C:\\Users\\fth\\IdeaProjects"));
        System.out.println(exist);
        Assert.assertTrue(exist);
    }

    @Test
    public void upLoad(){
        driver.get("https://the-internet.herokuapp.com/upload");
        WebElement upload= driver.findElement(By.id("file-upload"));
       
        upload.sendKeys("C:\\Downloads\\Micro-dialogues illustrés _ TICE et langues.jpg");
        driver.findElement(By.id("file-submit")).click();
    }
    @Test
    public void download() throws InterruptedException {
 //car.jpg
//C:\Downloads
    driver.get("https://the-internet.herokuapp.com/download");
    driver.findElement(By.xpath("(//a)[19]")).click();
    Thread.sleep(3000);
    boolean exist= Files.exists(Paths.get("C:\\Downloads\\car.jpg"));
     Assert.assertTrue(exist);




    }

}
