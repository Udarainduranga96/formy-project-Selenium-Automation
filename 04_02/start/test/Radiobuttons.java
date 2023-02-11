import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Radiobuttons {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\webDrivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/checkbox");

        WebElement radioButton1 = driver.findElement(By.id("checkbox-3"));
        radioButton1.click();
        Thread.sleep(500);
        radioButton1.click();
        WebElement radioButton2 =driver.findElement(By.xpath("//*[@id=\"checkbox-2\"]"));
      radioButton2.click();
        Thread.sleep(500);
        WebElement radioButton3 = driver.findElement(By.id("checkbox-1"));
        radioButton3.click();

//        WebElement radioButton2 = driver.findElement(By.cssSelector("input[value= 'option2']"));
//        radioButton2.click();
//
//        WebElement radioButton3 =driver.findElement(By.xpath("/html/body/div/div[3]/input"));
//        radioButton3.click();

        driver.quit();
    }
}
