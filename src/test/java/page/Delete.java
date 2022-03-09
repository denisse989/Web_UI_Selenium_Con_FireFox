package page;

import control.Button;
import control.Image;
import control.TextBox;
import org.openqa.selenium.By;

public class Delete {
    String newNameProj= "Denisse123";

    public Button imageName =new Button(By.xpath("//li[last()]//td[text()='"+newNameProj+"']"));
    public Button imageMenu=new Button(By.xpath("//div[@style='display: block;']/img"));
    public Button buttonDelete=new Button(By.id("ProjShareMenuDel"));
    public TextBox currentProject=new TextBox(By.id("CurrentProjectTitle"));
}
