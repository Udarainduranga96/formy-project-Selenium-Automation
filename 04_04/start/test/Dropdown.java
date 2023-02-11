import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Dropdown {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\webDrivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/dropdown");
        WebElement dropDownmenu = driver.findElement(By.id("dropdownMenuButton"));
        dropDownmenu.click();

        WebElement aotoC = driver.findElement(By.id("autocomplete"));
        aotoC.click();

        driver.quit();
    }
}
