import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/Virus/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.guru99.com/first-webdriver-script.html");
    }

}
