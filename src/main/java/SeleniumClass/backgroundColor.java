package SeleniumClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.chrome.ChromeDriver;


import java.time.Duration;

public class backgroundColor {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        String HomeB = driver.findElement(By.xpath("//button[@class=\"btn btn-primary\" and text() = \"Home\"]")).getCssValue("background-color");

        Color cl = Color.fromString(HomeB);
        String hex = cl.asHex();

        System.out.println(hex);

        driver.quit();


    }
}
