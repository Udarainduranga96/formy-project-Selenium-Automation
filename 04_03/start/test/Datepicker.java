package test;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Datepicker {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\webDrivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/datepicker");
        WebElement datePicker = driver.findElement(By.id("datepicker"));
        datePicker.sendKeys("02/08/2023");
        datePicker.sendKeys(Keys.RETURN);

        driver.quit();
    }
}