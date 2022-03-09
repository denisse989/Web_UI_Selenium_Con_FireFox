package page;

import control.Button;
import control.TextBox;
import org.openqa.selenium.By;

public class Settings {
    public TextBox fullName=new TextBox(By.xpath("//*[@id=\"FullNameInput\"]"));
    public Button buttonOk= new Button(By.xpath("/html/body/div[9]/div[2]/div/button[1]"));
    //public TextBox fullNameAct=new TextBox(By.xpath("//*[@id=\"FullNameInput\"]"));
}
