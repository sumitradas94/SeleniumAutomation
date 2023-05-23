package FacebbokAutomation;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
@Test
public class Takescreenshot {

    public WebDriver driver;

@Test
    public void screenshot() throws IOException {
    //System.setProperty("webDriver.chrome.driver","C:\\Users\\sande\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
   // driver = new ChromeDriver();
    ChromeOptions options= new ChromeOptions();
    options.addArguments("--remote-allow-origins=*");
    WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver(options);
    driver.get("https://www.facebook.com/");
    driver.manage().window().maximize();
        TakesScreenshot ts = (TakesScreenshot) driver;
        File sfile = ts.getScreenshotAs(OutputType.FILE);
        File dfile = new File("D:\\Automation sele\\Facebook\\screenshotfb\\" + "facebook.png");
        FileHandler.copy(sfile, dfile);


    }
}

