package Practice.Demo_Qa.Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Text_Box {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver =  new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));


        driver.get("https://demoqa.com/text-box");

        WebElement name = driver.findElement(By.id("userName"));

        name.sendKeys("Resul");

        WebElement eMail = driver.findElement(By.id("userEmail"));
        eMail.sendKeys("resulduzenli1@gmail.com");

        WebElement adress = driver.findElement(By.id("currentAddress"));
        adress.sendKeys("Ankara");

        WebElement perAdress = driver.findElement(By.id("permanentAddress"));
        perAdress.sendKeys("Etimesgut/ANKARA");

        WebElement subtik = driver.findElement(By.id("submit"));

        subtik.sendKeys(Keys.ENTER);











    }
}
