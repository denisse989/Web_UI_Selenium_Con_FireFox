import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicSelenium {
    ChromeDriver chromeDriver;
    @BeforeEach
    public void openBrowser(){
        System.setProperty("webdriver.chrome.driver","src/test/resources/driver/chromedriver.exe");
        chromeDriver = new ChromeDriver();
        chromeDriver.get("https://www.google.com/");
    }


    @Test
    public void goToGoogle() throws InterruptedException {
        Thread.sleep(5000);
    }

    @AfterEach
    public void closeBrowser(){
        chromeDriver.quit();
    }
}
