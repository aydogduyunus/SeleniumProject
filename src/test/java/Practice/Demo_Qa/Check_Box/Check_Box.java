package Practice.Demo_Qa.Check_Box;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Check_Box {
    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));


        driver.get("https://demoqa.com/checkbox");


        WebElement arti = driver.findElement(By.cssSelector("div[class=\"rct-options\"] button svg "));
        arti.click();

        Thread.sleep(2000);

        WebElement eksi = driver.findElement(By.xpath("// div / button [2] "));
        eksi.click();

        Thread.sleep(2000);

        WebElement arti2 = driver.findElement(By.cssSelector("div[class=\"rct-options\"] button svg "));
        arti2.click();


        WebElement but1 = driver.findElement(By.cssSelector("label[for=\"tree-node-commands\"] span svg"));
        but1.click();

     WebElement but2=driver.findElement(By.cssSelector("label[for=\"tree-node-veu\"] span svg"));
     but2.click();

     WebElement but3 = driver.findElement(By.cssSelector("label[for=\"tree-node-classified\"] span svg"));
     but3.click();

     WebElement but4 = driver.findElement(By.cssSelector("label[for=\"tree-node-wordFile\"] span svg"));
     but4.click();


        WebElement but5 = driver.findElement(By.cssSelector("label[for=\"tree-node-commands\"] span svg"));
        but5.click();


    }

}
