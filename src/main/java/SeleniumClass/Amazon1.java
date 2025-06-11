package SeleniumClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;
import java.util.Set;

public class Amazon1 {
    public static void main(String[] args) {


        WebDriver driver = new ChromeDriver();

        driver.get("https://practice.expandtesting.com/inputs");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://practice.expandtesting.com/inputs");

        Set<String> win = driver.getWindowHandles();
        System.out.println("Window Handles are : " + win);

        List<WebElement> blocks = driver.findElements(By.xpath("//div[@class=\"navbar-collapse collapse\"]/ul/li"));

        System.out.println("Total blocks found: " + blocks.size());

        for (int i = 0; i < blocks.size(); i++) {
            String blockText = blocks.get(i).getText().trim();
            System.out.println("Block " + (i + 1) + ": " + blockText);

//        for (WebElement block : blocks) {
//            System.out.println(block.getText());
        }
        driver.quit();
    }
}