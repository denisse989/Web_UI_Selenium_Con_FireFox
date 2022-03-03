package tareaSeleniumuConFireFox;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasicSelenium {
    WebDriver firefoxDriver ;
    @BeforeEach
    public void openBrowser(){
        System.setProperty("webdriver.gecko.driver","src/test/resources/driver/geckodriver.exe");
        firefoxDriver = new FirefoxDriver();
        firefoxDriver.get("https://www.google.com/");
    }
    @Test
    public void goToFireFox() throws InterruptedException {
        Thread.sleep(5000);
    }

    @AfterEach
    public void closeBrowser(){
        firefoxDriver.quit();
    }
}
