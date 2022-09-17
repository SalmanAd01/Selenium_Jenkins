package com.example;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
public class TestHelloWorld {
    @Test
    public void testHelloWorld() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\salman\\Downloads\\chromedriver_win32 (5)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.javatpoint.com");
        driver.manage().window().maximize();

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("scrollBy(0, 5000)");
        driver.findElement(By.id("gsc-i-id1")).sendKeys("core java");
        driver.findElement(By.className("gsc-search-button")).click();
    }
}
