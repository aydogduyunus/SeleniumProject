package techproed.day05_XpathCssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_Xpath {
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));


        // https://www.amazon.com sayfasına gidiniz
        driver.get("https://www.amazon.com");

        // arama kutusuna "city bike"  yazıp aratın
        // WebElement aramaKutusu = driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]"));

        WebElement aramaKutusu = driver.findElement(By.xpath("//input[@placeholder=\"Search Amazon\"]"));
        aramaKutusu.sendKeys("city bike"+ Keys.ENTER);

        // Hybrid Bikes bölümüne tıklayın

        WebElement hybridBikes = driver.findElement(By.xpath("//span[text()='Hybrid Bikes']"));
        hybridBikes.click();

        // sonuc sayısını yazdırın
       WebElement sonusSayisi = driver.findElement(By.xpath("//span[text()='14 results for']"));
        System.out.println(sonusSayisi.getText());

        String sonuc[]= sonusSayisi.getText().split(" ");
        System.out.println(sonuc[0]);


        // ilk ürününe tıklayın

       driver.findElement(By.xpath("(//div[@class=\"a-section aok-relative s-image-fixed-height\"])[1]")).click();



        //Sayfayı kapatınız
        driver.close();

    }
}
