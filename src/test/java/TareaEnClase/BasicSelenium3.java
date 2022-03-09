package TareaEnClase;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BasicSelenium3 {
    ChromeDriver chromeDriver;
    @BeforeEach
    public void openBrowser(){
        System.setProperty("webdriver.chrome.driver","src/test/resources/driver/chromedriver.exe");
        chromeDriver = new ChromeDriver();
        // implicit wait
        chromeDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        chromeDriver.manage().window().maximize();
        chromeDriver.get("http://todo.ly/");
    }

    @Test
    public void verifyLoginTodoLyu() throws InterruptedException {

        // click img login
        chromeDriver.findElement(By.xpath("//img[@src='/Images/design/pagelogin.png']")).click();
        // set text email
        chromeDriver.findElement(By.xpath("//input[@name='ctl00$MainContent$LoginControl1$TextBoxEmail']")).sendKeys("deni@email.com");
        // set test pwd
        chromeDriver.findElement(By.xpath("//input[contains(@name,'LoginControl1$TextBoxPassword')]")).sendKeys("12345");
        // click boton login
        chromeDriver.findElement(By.id("ctl00_MainContent_LoginControl1_ButtonLogin")).click();
        Thread.sleep(1000);


        String projectName= "Denisse";
        chromeDriver.findElement(By.xpath("//*[@id=\"MainTable\"]/tbody/tr/td[1]/div[6]/div/table/tbody/tr/td[2]")).click();
        chromeDriver.findElement(By.id("NewProjNameInput")).sendKeys(projectName);
        Thread.sleep(1000);
        chromeDriver.findElement(By.id("NewProjNameButton")).click();


        chromeDriver.findElement(By.xpath("//*[@id=\"ItemId_3982584\"]/table/tbody/tr/td[3]")).click();
        chromeDriver.findElement(By.xpath("//*[@id=\"ItemId_3982584\"]/table/tbody/tr/td[4]/div[2]")).click();
        chromeDriver.findElement(By.xpath("//*[@id=\"projectItemMenu\"]/li[1]")).click();
        chromeDriver.findElement(By.id("ItemEditTextbox")).clear();
        projectName=projectName+"123";
        chromeDriver.findElement(By.id("ItemEditTextbox")).sendKeys(projectName);
        chromeDriver.findElement(By.id("ItemEditSubmit")).click();
        Assertions.assertTrue( chromeDriver.findElement(By.xpath("//div[text()=\""+projectName+"\"]")).isDisplayed());

    }

    @AfterEach
    public void closeBrowser(){
        chromeDriver.quit();
    }
}
