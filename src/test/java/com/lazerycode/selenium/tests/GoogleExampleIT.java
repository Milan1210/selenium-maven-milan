package com.lazerycode.selenium.tests;

import com.lazerycode.selenium.DriverBase;
import com.lazerycode.selenium.page_objects.GoogleHomePage;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class GoogleExampleIT extends DriverBase {


    @Test
    public void googleCheeseExample() throws Exception {
        WebDriver driver = getDriver();
        driver.get("http://www.google.com");
        
        GoogleHomePage googleHomePage = new GoogleHomePage();
        googleHomePage.searchItem("Cheese");

    }

    // @Test
    public void googleMilkExample() throws Exception {
        WebDriver driver = getDriver();
        driver.get("http://www.google.com");
        // Alternatively the same thing can be done like this
        // driver.navigate().to("http://www.google.com");

        GoogleHomePage googleHomePage = new GoogleHomePage();
        // Check the title of the page
        System.out.println("Page title is: " + driver.getTitle());

        googleHomePage.searchItem("Milk");
        // Should see: "cheese! - Google Search"
        System.out.println("Page title is: " + driver.getTitle());
    }
}