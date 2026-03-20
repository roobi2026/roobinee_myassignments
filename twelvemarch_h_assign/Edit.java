package org.testleaf.twelvemarch_h_assign;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Edit {
    public static void main(String[] args) throws InterruptedException {
        String expectedTitleOfPage = "LeafTap";
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://leaftaps.com/opentaps/control/main");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.findElement(By.xpath("//input[@name='USERNAME']")).sendKeys("demosalesmanager");
        driver.findElement(By.xpath("//input[@name='PASSWORD']")).sendKeys("crmsfa");
        driver.findElement(By.xpath("//input[@value='Login']")).click();
        // Thread.sleep(3000);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.findElement(By.partialLinkText("CRM/SFA")).click();
        // Thread.sleep(2000);

        driver.findElement(By.xpath("//a[text()='Leads']")).click();

        driver.findElement(By.xpath("//a[text()='Create Lead']")).click();

        driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("TestLeaf");

        driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys(("Roobinee"));

        driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys(("M J"));

        driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("Roo");

        driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Information Technology");

        driver.findElement(By.name("description"))
                .sendKeys("A web page contains various fields, dropdowns, and buttons, and the objective is to\r\n" + //
                        "automate interactions with these elements to edit and update data using Selenium\r\n" + //
                        "WebDriver.");

        driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("hbdhsbhdbhnd@gmail.com");

        WebElement dropdoWebElement = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
        Select select = new Select(dropdoWebElement);
        select.selectByVisibleText("New York");

        driver.findElement(By.xpath("//input[@name='submitButton']")).click();
        // Thread.sleep(2000);

        driver.findElement(By.xpath("//a[text()='Edit']")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.findElement(By.xpath("//textarea[@name='description']")).clear();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.findElement(By.xpath("//textarea[@name='importantNote']"))
                .sendKeys("Fill the Important Note Field with Any text.");

        driver.findElement(By.xpath("//input[@value='Update']")).click();

        System.out.println(driver.getTitle());

        driver.close();

    }
}
