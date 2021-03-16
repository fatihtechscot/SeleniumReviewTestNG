package com.TechProEd.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FhcCreatPage {
        WebDriver driver;
    public FhcCreatPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


     @FindBy ( id = "Code")
    public WebElement codeBox;
    @FindBy ( id ="Name")
    public WebElement nameBox;
    @FindBy (id ="Address")
    public WebElement AddressBox;
    @FindBy (id = "Phone")
    public WebElement phoneBox;
    @FindBy (id = "IDGroup")
    public WebElement select;
    @FindBy (id="Email")
    public WebElement email;
    @FindBy (id ="btnSubmit")
    public WebElement save;



}
