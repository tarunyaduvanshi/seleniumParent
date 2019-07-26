package com.gyansetu.selenium.demo;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo {

    @Test
    public void testTitle(){
        System.setProperty("webdriver.gecko.driver", "/Users/tarun/cxo/geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.google.co.in/");
        driver.manage().window().maximize();
        String appTitle = driver.getTitle();
        String expTitle = "Google1";
        Assert.assertEquals(appTitle,expTitle);
        driver.close();


    }


}
