package FacebbokAutomation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

@Test
public class Webelementinterface {
    public WebDriver webDriver;
    @Test
    public void LunchDriver() throws InterruptedException {
        //System.setProperty("webDriver.chrome.driver","C:\\Users\\sande\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
        //webDriver = new ChromeDriver();
        ChromeOptions options= new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriverManager.chromedriver().setup();
        webDriver = new ChromeDriver(options);
        webDriver.get("https://www.facebook.com/");
        webDriver.manage().window().maximize();
//Clear method
        WebElement method = webDriver.findElement(By.id("email"));
        method.sendKeys("sandeep@gmail.com");
        Thread.sleep(3000);
        method.clear();
        Thread.sleep(3000);
        method.sendKeys("8763245536");
//getAttribute

        String attribute = method.getAttribute("placeholder");
        System.out.println(attribute);
 //get cssValue
     String cssValue = method.getCssValue("font-size");
     System.out.println(cssValue);
//getLocation
        int x = method.getLocation().getX();
        int y = method.getLocation().getY();
        System.out.println("x value : " +x);
        System.out.println("y value : " +y);
//getSize
        int h= method.getSize().getHeight();
        System.out.println("h value : " + h);
        int W = method.getSize().getWidth();
        System.out.println("W value : " + W);
//getText
        WebElement ele = webDriver.findElement(By.linkText("Create new account"));
        String text = ele.getText();
        System.out.println(text);
//isDisplayed
        boolean displayed = method.isDisplayed();
        System.out.println(displayed);
//isSelected
     boolean select = method.isSelected();
     System.out.println(select);
//isEnable
        boolean name = method.isEnabled();
        System.out.println(name);
//sendKeys
        WebElement eid = webDriver.findElement(By.id("email"));
        ele.sendKeys("8763245536");
        WebElement pass = webDriver.findElement(By.name("pass"));
        pass.sendKeys("sumi5732");


    }

    }

