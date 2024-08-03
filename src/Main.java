import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/prabhatkumar/Desktop/chromedriver-mac-x64/chromedriver");

        WebDriver drive = new ChromeDriver();
        drive.get("https://chatgpt.com/");
        System.out.println("Page title is: " + drive.getTitle());
        drive.quit();
    }
}