package page;

import control.Button;
import control.TextBox;
import org.openqa.selenium.By;

public class Creation {
    public Button buttonNewProject= new Button(By.xpath("//td[text()='Add New Project']"));
    public TextBox nameProject= new TextBox(By.id("NewProjNameInput"));
    public Button buttonNewName= new Button(By.id("NewProjNameButton"));
}
