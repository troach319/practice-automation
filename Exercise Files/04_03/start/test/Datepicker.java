import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Datepicker {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/tariqrwilliams/Downloads/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/datepicker");

        WebElement dateField = driver.findElement(by.id("datepicker"));
        dateField.sendKeys("03/19/2021");
        dateField.sendKeys(Keys.RETURN);

        driver.quit();
    }
}