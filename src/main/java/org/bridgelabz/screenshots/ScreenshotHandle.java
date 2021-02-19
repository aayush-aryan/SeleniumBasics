package org.bridgelabz.screenshots;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.File;
import java.io.IOException;

public class ScreenshotHandle {
    static WebDriver driver;
    public static void main(String[] args) throws IOException {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        takeScreenshots("google_Home_page");

    }

    public static void takeScreenshots(String fileName) throws IOException {
        //1. take screenShots and store it as file format;

        File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        //2.Copy the screeenShots to desired location using copyfile() method.
        FileUtils.copyFile(file,new File("C:\\Users\\ankit\\Desktop\\fileScreenShots\\" +
                "src\\main\\java\\org\\bridgelabz\\screenshots" + fileName + ".jpg"));
    }

}