package Practice.Odev;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Odev_02 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver =  new ChromeDriver();



        //Youtube ana sayfasina gidelim . https://www.youtube.com/

        driver.get("https://www.youtube.com/");

        Thread.sleep(3000);

        //Amazon soyfasina gidelim. https://www.amazon.com/

        driver.get("https://www.amazon.com/");

        Thread.sleep(3000);

        // Tekrar YouTube'sayfasina donelim

        driver.navigate().back();

        Thread.sleep(3000);

        // Yeniden Amazon sayfasina gidelim
        driver.navigate().forward();

        Thread.sleep(3000);


        // Sayfayi Refresh(yenile) yapalim
        driver.navigate().refresh();


        // Sayfayi kapatalim / Tum sayfalari kapatalim

        driver.close(); // Tek Sayfayı Kapatır. --- driver.quit () ise tüm pencereleri kapatir.














    }
}
