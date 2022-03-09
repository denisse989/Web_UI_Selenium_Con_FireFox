package page;

import control.Button;
import control.Image;
import control.Label;
import control.TextBox;
import org.openqa.selenium.By;

public class Actualizacion {
    String nameProj;

    public Actualizacion(String nameProj) {
        this.nameProj = nameProj;
    }

    public TextBox nameProject= new TextBox(By.xpath("//li[last()]//td[text()='" + nameProj + "']"));
    public Button imageMenu=new Button(By.xpath("//div[@style='display: block;']/img"));
    public Button buttonEdit=new Button(By.xpath("//ul[contains(@style,'block')]/li/a[text()='Edit']"));
    public TextBox textBoxName=new TextBox(By.xpath("//td/div/input[@id='ItemEditTextbox']"));
    public Button guardar=new Button(By.xpath("//td/div/img[@id='ItemEditSubmit']"));


}
