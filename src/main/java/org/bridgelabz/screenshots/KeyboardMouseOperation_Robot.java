package org.bridgelabz.screenshots;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.awt.event.KeyEvent;

public class KeyboardMouseOperation_Robot {
    public static void main(String[] args) throws InterruptedException, AWTException {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.navigate().to("https://www.bridgelabz.com/");

        Thread.sleep(5000);
        Robot robot = new Robot();
        robot.mouseMove(300,500);
        robot.keyPress(KeyEvent.VK_ALT);

        robot.keyRelease(KeyEvent.VK_ALT);
    }
}
