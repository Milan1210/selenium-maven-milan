package com.lazerycode.selenium.page_objects;

import com.lazerycode.selenium.DriverBase;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class GoogleHomePage {

    String searchInput ="q";
    String googleSearchBtn ="btnK";
    String ImFeeleingLuckBtn ="BtnI";

    protected final RemoteWebDriver driver = DriverBase.getDriver();
    WebDriverWait wait = new WebDriverWait(driver, 20);
    
    public GoogleHomePage() throws Exception {
    }

    public void searchItem(String text){
        driver.findElement(By.name("q")).sendKeys(text);
        wait.until(ExpectedConditions.elementToBeClickable(By.name("btnK")));
        driver.findElement(By.name("btnK")).click();
    }
    

}