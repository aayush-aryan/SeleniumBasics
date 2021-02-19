package org.bridgelabz.screenshots;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;

public class LocatorsXpath {
    public static void main(String[] args) throws InterruptedException, AWTException {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://login.yahoo.com/?.intl=ca");
        driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys("log2aayush");
        Thread.sleep(3000);
        driver.findElement(By.id("login-signin")).click();
        Thread.sleep(2000);
        driver.findElement(By.linkText("Forgot username?")).click();
        driver.findElement(By.partialLinkText("")).click();


    }
}