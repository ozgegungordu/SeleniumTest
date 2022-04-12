package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class BaseDriver {
    public static WebDriver driver;

    @BeforeClass
    public static WebDriver getDriver()
    {
        if (driver==null)
        {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.get("https://otomasyon.netfinans.com/");
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
            driver.manage().timeouts().setScriptTimeout(Duration.ofSeconds(60));

        }
        return driver;
    }



    @AfterClass
    public static void DriverQuit(){
        if (driver!=null){
            driver.quit();
            driver=null;
        }
    }
}