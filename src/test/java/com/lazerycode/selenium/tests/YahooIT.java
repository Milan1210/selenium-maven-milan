package com.lazerycode.selenium.tests;

import com.lazerycode.selenium.DriverBase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.lazerycode.selenium.Utils;

public class YahooIT extends DriverBase {

    private WebDriver driver;

    @Test
    public void yahooSearch() throws Exception {  
        driver = getDriver();     
        driver.get("https://www.yahoo.com");
        WebElement searach = driver.findElement(By.xpath("//input[@id='uh-search-box']"));
        searach.sendKeys("Cheese");
    }

    @Test
    public void yahooMail() throws Exception { 
        driver = getDriver();    
        driver.get("https://mail.yahoo.com");
        Utils.pomoc();
        Thread.sleep(10000);
    }
}