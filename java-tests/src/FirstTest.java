import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.URL;

public class FirstTest {

    IOSDriver iosDriver;


    @Before
    public void setup() throws Exception{

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "iPhone");

        URL driverUrl = new URL("http://127.0.0.1:4723/wd/hub");
        iosDriver = new IOSDriver(driverUrl , capabilities);

    }

    @After
    public void tearDown() throws Exception{
//        iosDriver.quit();
    }

    @Test
    public void clickFillTextButton(){
        WebElement fillTextBoxButton = iosDriver.findElement(By.name("Add text"));
        fillTextBoxButton.click();

        WebElement textbox = iosDriver.findElement(By.name("Textbox"));

    }

}
