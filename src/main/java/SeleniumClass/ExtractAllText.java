package SeleniumClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class ExtractAllText {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        try {
            driver.get("https://rahulshettyacademy.com/AutomationPractice/"); // 🔁 Replace with your desired URL
            driver.manage().window().maximize();

            // Get entire page body text
            String bodyText = driver.findElement(By.tagName("body")).getText();
            System.out.println("===== All Visible Text from Page =====");
            System.out.println(bodyText);

            // OPTIONAL: Print text from specific common elements (debugging)
            printElementsText(driver, "h1");
            printElementsText(driver, "h2");
            printElementsText(driver, "p");
            printElementsText(driver, "a");
            printElementsText(driver, "span");
            printElementsText(driver, "button");

        } finally {
            driver.quit();
        }
    }

    public static void printElementsText(WebDriver driver, String tagName) {
        List<WebElement> elements = driver.findElements(By.tagName(tagName));
        System.out.println("===== " + tagName.toUpperCase() + " Tags =====");
        for (WebElement el : elements) {
            String text = el.getText().trim();
            if (!text.isEmpty()) {
                System.out.println(text);
            }
        }
    }
}
