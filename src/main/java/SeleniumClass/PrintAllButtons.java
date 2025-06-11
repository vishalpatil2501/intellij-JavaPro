package SeleniumClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class PrintAllButtons {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        try {
            driver.get("https://rahulshettyacademy.com/AutomationPractice/"); // 🔁 Replace with your target URL
            driver.manage().window().maximize();

            System.out.println("===== <button> Tags =====");
            List<WebElement> buttons = driver.findElements(By.tagName("button"));
            for (WebElement btn : buttons) {
                String text = btn.getText().trim();
                if (!text.isEmpty()) {
                    System.out.println(text);
                }
            }

            System.out.println("===== <input type='button' or 'submit'> Tags =====");
            List<WebElement> inputs = driver.findElements(By.xpath("//input[@type='button' or @type='submit']"));
            for (WebElement input : inputs) {
                String value = input.getAttribute("value");
                if (value != null && !value.trim().isEmpty()) {
                    System.out.println(value.trim());
                }
            }

        } finally {
            driver.quit();
        }
    }
}
