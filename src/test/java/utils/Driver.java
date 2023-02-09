package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Driver {

    private static InheritableThreadLocal<WebDriver> driver = new InheritableThreadLocal<>();


    public static WebDriver getDriver(){

        if (driver.get()==null) {
                    WebDriverManager.firefoxdriver().setup();
                    driver.set(new FirefoxDriver());
                    driver.get().manage().window().maximize();
                    driver.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            }

        return driver.get();
    }

    public static void close(){
        if (driver.get()!=null){
            driver.get().quit();
            driver.set(null);
        }
    }
}
