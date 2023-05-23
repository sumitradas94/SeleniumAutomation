package FacebbokAutomation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

@Test
public class Locators {
    public WebDriver driver;

    @BeforeMethod
    public void setup() throws InterruptedException {
        // System.setProperty("webDriver.chrome.driver","C:\\Users\\sande\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
        // driver = new ChromeDriver();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(options);


    }
    @Test
    public void Locator(){
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();
     driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("6366272171");
    driver.findElement(By.xpath("//button[text()='Request OTP']")).click();
    driver.close();

    }
    @Test
    public void Login() throws InterruptedException {
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//span[@id=\"nav-link-accountList-nav-line-1\"]")).click();
        driver.findElement(By.name("email")).sendKeys("sumdas9419@gmail.com");
        driver.findElement(By.id("continue")).click();
        driver.findElement(By.cssSelector("input#ap_password")).sendKeys("8763245536");
        //driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("8763245536");
        driver.findElement(By.id("signInSubmit")).click();
        Thread.sleep(3000);
        driver.findElement(By.linkText("Forgot Password")).click();
        driver.close();
    }


        public void Create() throws InterruptedException {
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[@id=\"nav-link-accountList-nav-line-1\"]")).click();
      driver.findElement(By.xpath("//a[@class='a-button-text']")).click();
driver.findElement(By.xpath("//input[@placeholder='First and last name']")).sendKeys("Sumitra");
driver.findElement(By.id("ap_phone_number")).sendKeys("6366272171");
driver.findElement(By.xpath("//input[@name='secondaryLoginClaim']")).sendKeys("sumdas9419@gmail.com");
driver.findElement(By.xpath("//input[starts-with(@placeholder,'At least 6')]")).sendKeys("sumi5732");
driver.findElement(By.xpath("//input[contains(@aria-labelledby,'auth-continue-announce')]")).click();
    }
}
