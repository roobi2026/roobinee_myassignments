package org.testleaf.Facebooktrial;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebookusingxpath {
    public static void main(String[] args) throws InterruptedException {
        String expectedTitleOfPage = "Facebook";
        ChromeDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com/");

        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("testleaf.2023@gmail.com");
        driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("Tuna@321");
        driver.findElement(By.xpath("//div[@role='button']/div")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[text()='Find your account and log in.']")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("(//a[@role='link'])[3]")).click();
    }
}
