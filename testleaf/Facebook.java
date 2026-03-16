import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
    public static void main(String[] args) {

        String expectedTitleOfPage = "Facebook";
        ChromeDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");

        driver.findElement(By.id("email")).sendKeys("testleaf.2023@gmail.com");
        driver.findElement(By.name("pass")).sendKeys("Tuna@321");
       
    }
}

