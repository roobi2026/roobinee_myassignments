package org.testleaf.Leaftaps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class insta {
    public static void main(String[] args) {

        ChromeDriver driver = new ChromeDriver();
        String expectedTitleOfPage = "Instagram";
        driver.get("https://www.instagram.com/");

        driver.findElement(By.name("email")).sendKeys("testleaf.2023@gmail.com");
        driver.findElement(By.name("pass")).sendKeys("Tuna@321");
        driver.findElement(By.xpath("//div[@role='button']/div")).click();
        WebDriverWait waitWebDriver = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement dynamicLink = waitWebDriver.until(
                ExpectedConditions.elementToBeClickable(By.linkText("Find your account and log in.")));

        dynamicLink.click();

    }
}
