package com.testTickets.app;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by muhammad.qureshi on 15/04/2014.
 */
public class HomePage {
    private WebDriver driver;

    public HomePage()
    {
        driver = new FirefoxDriver();
        driver.get("http://www.google.co.uk");
    }

    public void SearchFor(String searchKeyword)
    {
        driver.findElement(By.id("gs_taif0")).sendKeys(searchKeyword);
    }
}
