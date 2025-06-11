package SeleniumClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class TabSwitchExample {
    public static void main(String[] args) throws InterruptedException {
        // Set path to chromedriver
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        WebDriver driver = new ChromeDriver();

        // Implicit wait and maximize
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        // Open main tab (Tab 1)
        driver.get("https://example.com");  // Replace with real site
        String tab1 = driver.getWindowHandle();

        // Open 3 more tabs using JavaScript
        for (int i = 0; i < 3; i++) {
            ((org.openqa.selenium.JavascriptExecutor) driver)
                    .executeScript("window.open('https://example.com','_blank');");
        }

        // Wait for tabs to load
        Thread.sleep(2000);

        // Get all window handles and convert to list
        Set<String> windowHandles = driver.getWindowHandles();
        ArrayList<String> tabs = new ArrayList<>(windowHandles);

        // Switch to 4th tab (index 3) and perform action
        driver.switchTo().window(tabs.get(3));
        driver.get("https://google.com");  // Replace with desired action
        System.out.println("Title on 4th tab: " + driver.getTitle());

        Thread.sleep(2000); // Just for demo

        // Switch back to 1st tab (index 0)
        driver.switchTo().window(tabs.get(0));
        System.out.println("Back to 1st tab: " + driver.getTitle());

        // Cleanup
        driver.quit();
    }
}
