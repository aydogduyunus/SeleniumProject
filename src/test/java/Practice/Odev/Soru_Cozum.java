package Practice.Odev;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Soru_Cozum {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver =  new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));



    /*

        a. http://a.testaddressbook.com adresine gidiniz.
        b. Sign in butonuna basin
        c. email textbox,password textbox, and signin button elementlerini locate ediniz..
        d. Kullanıcı adını ve şifreyi aşağıya girin ve oturum aç (sign in)buttonunu tıklayın:
        i. Username : testtechproed@gmail.com
        ii. Password : Test1234!
                e. Expected user id nin testtechproed@gmail.com oldugunu dogrulayin(verify).
                f. “Addresses” ve “Sign Out” textlerinin görüntülendiğini( displayed)
                doğrulayin(verify).
        3. Sayfada kac tane link oldugunu bulun.


     */


        driver.get("http://testaddressbook.com");
        Thread.sleep(2000);

       WebElement admintik =  driver.findElement(By.className("btn-simple"));
        Thread.sleep(2000);

        admintik.click();


        WebElement logTik = driver.findElement(By.partialLinkText("Log In"));

        logTik.click();

        WebElement name = driver.findElement(By.id("username"));

        name.sendKeys("testtechproed@gmail.com");

        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("Test1234!");


        WebElement loginTik = driver.findElement(By.cssSelector(".login-button.Button.Button--primary.Button--block.m-bottom-2"));
        loginTik.click();




















    }





}
