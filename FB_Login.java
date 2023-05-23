package FacebbokAutomation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import javax.print.DocFlavor;
import java.io.File;
import java.io.IOException;


@Test
public class FB_Login {
    public WebDriver driver;
    @BeforeMethod
    public void setup(){
        //System.setProperty("webDriver.chrome.driver","C:\\Users\\sande\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
        //driver = new ChromeDriver();
        ChromeOptions options= new ChromeOptions();
       options.addArguments("--remote-allow-origins=*");
        WebDriverManager.chromedriver().setup();
       driver = new ChromeDriver(options);
    }

@Test
    public void login() throws InterruptedException, IOException {
    driver.get("https://www.facebook.com/");
    driver.manage().window().maximize();
    WebElement ele = driver.findElement(By.id("email"));
    ele.sendKeys("8763245536");
    Thread.sleep(3000);
    WebElement pass = driver.findElement(By.name("pass"));
    pass.sendKeys("sumi5732");
    WebElement log = driver.findElement(By.name("login"));
    log.click();

//withoutwebelement
    // driver.findElement(By.id("email")).sendKeys("8763245536");
    //driver.findElement(By.name("pass")).sendKeys("sumi5732");
    // driver.findElement(By.name("login")).click();
}
@Test
   public void signup() throws InterruptedException {
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        WebElement sign = driver.findElement(By.linkText("Create new account"));
        sign.click();
        Thread.sleep(3000);
        driver.findElement(By.name("firstname")).sendKeys("Sumitra");
        driver.findElement(By.name("lastname")).sendKeys("Das");
        driver.findElement(By.name("reg_email__")).sendKeys("6366272171");
        driver.findElement(By.id("password_step_input")).sendKeys("Sumi5732");
        WebElement day = driver.findElement(By.id("day"));
        day.sendKeys("15");
        day.click();
        Thread.sleep(3000);
        WebElement month = driver.findElement(By.name("birthday_month"));
        month.sendKeys("june");
        month.click();
        Thread.sleep(3000);
        WebElement year = driver.findElement(By.name("birthday_year"));
        year.sendKeys("2000");
        year.click();
        Thread.sleep(3000);
         WebElement gender = driver.findElement(By.name("sex"));
        gender.isSelected();
        gender.click();
        driver.findElement(By.xpath("(//label[@class='_58mt'])[1]")).click();
        Thread.sleep(5000);
        WebElement signup = driver.findElement(By.name("websubmit"));
        signup.click();
        WebElement dis = driver.findElement(By.linkText("Sign Up"));
        boolean text = sign.isDisplayed();
        System.out.println(text);
    }
}










