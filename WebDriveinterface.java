package FacebbokAutomation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class WebDriveinterface {
    public WebDriver webDriver;



@Test
public void  operation() throws InterruptedException {
    ChromeOptions options= new ChromeOptions();
    options.addArguments("--remote-allow-origins=*");
    WebDriverManager.chromedriver().setup();
    webDriver = new ChromeDriver(options);
    webDriver.get("https://www.facebook.com/");
    webDriver.manage().window().maximize();
    String url = webDriver.getCurrentUrl();
    System.out.println(url);
    String title = webDriver.getTitle();
    System.out.println(title);
    Thread.sleep(5000);
    String source = webDriver.getPageSource();
    System.out.println(source);
    Thread.sleep(2000);
    webDriver.navigate().to("https://www.flipkart.com/");
    Thread.sleep(2000);
    webDriver.navigate().back();
    Thread.sleep(2000);
    webDriver.navigate().refresh();
    Thread.sleep(2000);
    webDriver.navigate().forward();
    Thread.sleep(5000);
    webDriver.quit();
    // driver.close();

}
}