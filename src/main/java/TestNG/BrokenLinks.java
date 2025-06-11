package TestNG;


import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class BrokenLinks {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.jmu.edu/cascade/docs/pages/broken-links.shtml");
        // Get all links
        List<WebElement> links = driver.findElements(By.tagName("a"));
        int brokenLinkCount = 0;
        for (WebElement link : links) {
            String url = link.getAttribute("href");
            if (url == null || url.isEmpty()) {
                System.out.println("Link is empty or null.");
                continue;
            }
            try {
                HttpURLConnection connection = (HttpURLConnection) (new URL(url).openConnection());
                connection.setRequestMethod("HEAD");
                connection.connect();
                int responseCode = connection.getResponseCode();
                if (responseCode >= 400) {
                    System.out.println("❌ Broken Link: " + url + " → HTTP Code: " + responseCode);
                    brokenLinkCount++;
                } else {
                    System.out.println("✅ Valid Link: " + url + " → HTTP Code: " + responseCode);
                }
            } catch (Exception e) {
                System.out.println("❗ Exception for URL: " + url + " → " + e.getMessage());
            }
        }
        System.out.println("🔍 Total Broken Links: " + brokenLinkCount);
        driver.quit();
    }
}


