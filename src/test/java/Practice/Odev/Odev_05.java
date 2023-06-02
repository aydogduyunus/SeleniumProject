package Practice.Odev;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Odev_05 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));


        //https://id.heroku.com/login sayfasina gidin
        driver.get("https://id.heroku.com/login");

        //Bir mail adersi giriniz

      WebElement mail = driver.findElement(By.id("email"));
      mail.sendKeys("resulduzenli1@gmail.com");

        //Bir password giriniz

        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("123456A");


        //Login butonuna tiklayiniz

        WebElement logTik = driver.findElement(By.name("commit"));
        logTik.click();


        //"There was a problem with your login." texti gorunur ise
        //"kayit yapilamadi" yazdiriniz


        String text = driver.getPageSource();
        String aranacakCumle = "There was a problem with your login.";

        if (text.contains(aranacakCumle)){
            System.out.println("Kayit Yapilamadi");
        }else {
            System.out.println("Kayit Yapildi");
        }



        Thread.sleep(2000);
        //eger yazi gorunur degilse "kayit yapildi" yazdiriniz

        //sayfayı kapatiniz

        driver.close();















    }


}
