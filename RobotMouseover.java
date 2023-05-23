package FacebbokAutomation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.KeyEvent;

public class RobotMouseover {
    public WebDriver driver;

    @BeforeMethod
    public void setup() {
        // System.setProperty("webDriver.chrome.driver","C:\\Users\\sande\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
        // driver = new ChromeDriver();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(options);
    }

    @Test
    public void robot_class() throws InterruptedException, AWTException {
       driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
       Thread.sleep(5000);

        Robot robot = new Robot();
       robot.mouseMove(300,500);
       robot.mouseWheel(2);
       robot.keyPress(KeyEvent.VK_S);
       robot.keyRelease(KeyEvent.VK_S);
       robot.keyPress(KeyEvent.VK_U);
       robot.keyRelease(KeyEvent.VK_U);
       robot.keyPress(KeyEvent.VK_M);
       robot.keyRelease(KeyEvent.VK_M);
       robot.keyPress(KeyEvent.VK_I);
      robot.keyRelease(KeyEvent.VK_I);
       Thread.sleep(3000);
//select
       robot.keyPress(KeyEvent.VK_CONTROL);
      robot.keyPress(KeyEvent.VK_A);
      robot.keyRelease(KeyEvent.VK_CONTROL);
      robot.keyRelease(KeyEvent.VK_A);
      Thread.sleep(3000);
       //copy
       robot.keyPress(KeyEvent.VK_CONTROL);
      robot.keyPress(KeyEvent.VK_C);
       robot.keyRelease(KeyEvent.VK_CONTROL);
       robot.keyRelease(KeyEvent.VK_C);
       Thread.sleep(3000);

      //pressing tab key
      robot.keyPress(KeyEvent.VK_TAB);
       robot.keyRelease(KeyEvent.VK_TAB);
       Thread.sleep(3000);
       //paste
       robot.keyPress(KeyEvent.VK_CONTROL);
       robot.keyPress(KeyEvent.VK_V);
       robot.keyRelease(KeyEvent.VK_CONTROL);
       robot.keyRelease(KeyEvent.VK_V);
       Thread.sleep(5000);
        //click on login
      robot.keyPress(KeyEvent.VK_ENTER);
      robot.keyRelease(KeyEvent.VK_ENTER);

    }











   // @Test

   // public void Locators() throws InterruptedException {
       // driver.get("https://www.facebook.com/");
        //driver.manage().window().maximize();
         //Thread.sleep(5000);

         //driver.findElement(By.cssSelector("input[id='email']")).sendKeys("8763245536");
      //driver.findElement(By.cssSelector("input#email")).sendKeys("8763245536");
      //driver.findElement(By.xpath("//input[@id='email']")).sendKeys("8763245536");

        // contains method
        //driver.findElement(By.xpath("//input[contains(@aria-label,'Email address or phone number')]")).sendKeys("8763245536");
        //driver.findElement(By.xpath("//input[starts-with(@aria-label,'Email address')]")).sendKeys("8763245536");
        //driver.findElement(By.xpath("//input[ends-with(@aria-label,'phone number')]")).sendKeys("8763245536");


       // driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("Sumi5732");
     // driver.findElement(By.xpath("//button[text()='Log in']")).click();
       // driver.findElement(By.xpath("//button[contains(text(),'Log')]")).click();
    }

