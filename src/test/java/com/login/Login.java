package com.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class Login {
    WebDriver driver;
    @Test
    public void login(){
        driver = new ChromeDriver();
        driver.get("https://koolkanya.com/");
    }

    @AfterClass
    public void quit(){
        driver.close();
    }
}
