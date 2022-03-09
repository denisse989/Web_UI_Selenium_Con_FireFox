package page;

import control.Button;
import control.Image;
import control.Label;
import control.TextBox;
import org.openqa.selenium.By;

public class Actualizacion {
    String projectName="DenissePrueba1";


    public TextBox nameProject= new TextBox(By.xpath("//li[last()]//td[text()='"+projectName+"']"));
    public Button imageMenu=new Button(By.xpath("//div[@style='display: block;']/img"));
    public Button buttonEdit=new Button(By.xpath("//ul[contains(@style,'block')]/li/a[text()='Edit']"));
    public TextBox textBoxName=new TextBox(By.xpath("//td/div/input[@id='ItemEditTextbox']"));
    public Button guardar=new Button(By.xpath("//td/div/img[@id='ItemEditSubmit']"));
    public TextBox newName=new TextBox(By.id("CurrentProjectTitle"));


}
