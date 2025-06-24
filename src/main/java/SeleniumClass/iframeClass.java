package SeleniumClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class iframeClass {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.globalsqa.com/demo-site/frames-and-windows/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.findElement(By.id("iFrame")).click();

        // Switch to the correct iframe. First, locate the iframe.
        WebElement iframe = driver.findElement(By.name("globalSqa"));
        driver.switchTo().frame(iframe);

        // Get the image's 'alt' attribute if text is not visible directly
        WebElement name = driver.findElement(By.xpath("//img[@class=\" ls-is-cached lazyloaded\"]"));
        String title = name.getAttribute("alt");

        System.out.println("Image alt text: " + title);

        // Always a good practice to switch back to default content
        driver.switchTo().defaultContent();
        driver.quit();

    }
}
