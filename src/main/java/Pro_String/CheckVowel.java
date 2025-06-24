package Pro_String;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CheckVowel {
    public static void main(String[] args) {

        String input = "Vishal".toLowerCase();

        System.out.print("Vowels in String :");

        for (int i = 0; i < input.length(); i++) {
            String ch = Character.toString(input.charAt(i));
            if (ch.matches("[aeiou]")) {
                System.out.print(" "  + ch + " ");
            }
        }
    }
}
