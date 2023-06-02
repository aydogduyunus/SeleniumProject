package Practice.Odev;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Odev_04 {
    public static void main(String[] args) {

         System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
         WebDriver driver = new ChromeDriver();


         //Amazon soyfasina gidelim. "https://www.amazon.com/"
         driver.get("https://www.amazon.com/");

         //Sayfanin konumunu ve boyutlarini yazdirin
        System.out.println("Sayfa Konumu : "+driver.manage().window().getPosition());
        System.out.println("Sayfa Boyutu : "+driver.manage().window().getSize());

        //Sayfanin konumunu ve boyutunu istediginiz sekilde ayarlayin
        driver.manage().window().setPosition(new Point(50,50));
        driver.manage().window().setSize(new Dimension(1920,1080));

        System.out.println("Sayfa  Yeni Konumu : "+driver.manage().window().getPosition());
        System.out.println("Sayfa  Yeni Boyutu : "+driver.manage().window().getSize());

        //Sayfanin sizin istediginiz konum ve boyuta geldigini test edin

        String sayfaKonumu = "50,50";
        String sayfaBoyutu = "1920,1080";
        if( sayfaKonumu.contains(sayfaKonumu)){
            System.out.println("Sayfa Konumu Test PASSED ");
        }else System.out.println("Sayfa Boyutu Test FAILED");

        if(sayfaBoyutu.contains(sayfaBoyutu)){
            System.out.println("Sayfa Boyutu Test PASSED");

        }else System.out.println("Sayfa Boyutu Test FAILED");


        //8. Sayfayi kapatin

        driver.close();

    }
}
