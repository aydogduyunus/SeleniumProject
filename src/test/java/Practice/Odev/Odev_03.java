package Practice.Odev;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Odev_03 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver =  new ChromeDriver();



        //  2.Amazon soyfasina gidelim. https://www.amazon.com/

        driver.get("https://www.amazon.com/");

        //  3.Sayfanin konumunu ve boyutlarini yazdirin

        System.out.println("Sayfanin Konumu  : " + driver.manage().window().getPosition());

        System.out.println("Sayfanin Boyutlari : "+driver.manage().window().getSize());


        //  4.Sayfayi simge durumuna getirin

        driver.manage().window().minimize();
        Thread.sleep(3000);


        //  5.simge durumunda 3 saniye bekleyip sayfayi maximize yapin

        driver.manage().window().maximize();

        // 6.Sayfanin konumunu ve boyutlarini maximize durumunda yazdirin

        System.out.println(" Max Sayfanin Konumu  : " + driver.manage().window().getPosition());

        System.out.println(" Max Sayfanin Boyutlari : "+driver.manage().window().getSize());


        // 7.Sayfayi fullscreen yapin

        driver.manage().window().fullscreen();


        //8.Sayfanin konumunu ve boyutlarini fullscreen durumunda yazdirin

        System.out.println("Full Screen Konum : "+driver.manage().window().getPosition());
        System.out.println("Full Screen Boyut : "+driver.manage().window().getSize());

        //9.Sayfayi kapatin

        driver.close();


    }


}
