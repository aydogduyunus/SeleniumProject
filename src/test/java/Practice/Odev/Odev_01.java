package Practice.Odev;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Odev_01 {
    public static void main(String[] args) {
       /*
        Yeni bir package olusturalim : day01
        Yeni bir class olusturalim : C03_GetMethods

        Amazon sayfasina gidelim. https://www.amazon.com/
        Sayfa basligini(title) yazdirin
        Sayfa basliginin "Amazon" icerdigini test edin
        Sayfa adresini(url) yazdirin
        Sayfa url'inin "amazon" icerdigini test edin.
        Sayfa handle degerini yazdirin
        Sayfa HTML kodlarinda "Gateway" kelimesi gectigini test edin
        Sayfayi kapatin.
        */

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver =  new ChromeDriver();


        //Amazon sayfasina gidelim. https://www.amazon.com/

        driver.get("https://www.amazon.com/");

        //Sayfa basligini(title) yazdirin

        System.out.println("Sayfa Baslıgı = " + driver.getTitle());

        //Sayfa basliginin "Amazon" icerdigini test edin

        String actualTitle = driver.getTitle();
        String exceptedTitle = "Amazon";
        if(actualTitle.contains(exceptedTitle)){
            System.out.println("Test PASSED ");
        }else System.out.println("Test FAILED");

        // Sayfa adresini(url) yazdirin

        System.out.println("Sayfa Url'si = " + driver.getCurrentUrl());

        // Sayfa url'inin "amazon" icerdigini test edin.

        String actualUrl = driver.getCurrentUrl();
        String exceptedUrl = "amazon";

        if(actualUrl.contains(exceptedUrl)){
            System.out.println("Test PASSED");
        }else System.out.println("Test FAILED");

        //Sayfa handle degerini yazdirin

        System.out.println("Sayfa Handle degeri = " + driver.getWindowHandle());

        //Sayfa HTML kodlarinda "Gateway" kelimesi gectigini test edin
        driver.getPageSource();

        if(exceptedUrl.contains("Gateway")){
            System.out.println("Test PASSED");
        }else System.out.println("Test FAILED");


        //Sayfayi kapatin.

        driver.close();







    }
}
