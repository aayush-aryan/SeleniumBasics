package org.bridgelabz.screenshots;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.awt.*;

public class LocatorsDemo1 {
    public static void main(String[] args) throws InterruptedException, AWTException {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://accounts.google.com/signin/v2/identifier?flowName=GlifWebSignIn&flowEntry=ServiceLogin");
       // WebElement username = driver.findElement(By.id("identifierId"));
        //username.sendKeys("log2aayusharyan@gmail.com");
        driver.findElement(By.id("identifierId")).sendKeys("log2aayusharyan@gmail.com");
        Thread.sleep(2000);

       driver.navigate().to("https://www.google.com/");
        driver.findElement(By.name("q")).sendKeys("selenium");
        Thread.sleep(2000);
        driver.findElement(By.name("btnK")).click();
        Thread.sleep(2000);
        driver.navigate().to("https://login.yahoo.com/?.src=&.intl=us&.lang=en-US&.do");
        Thread.sleep(2000);
        driver.findElement(By.linkText("Forgot username?")).click();



    }
}
