package page;

import control.Button;
import control.Image;
import org.openqa.selenium.By;

public class Delete {
    String newNameProj;

    public Delete(String newNameProj) {
        this.newNameProj = newNameProj;
    }

    public Image imageName =new Image(By.xpath("//li[last()]//td[text()='"+newNameProj+"']"));
    public Image imageMenu=new Image(By.xpath("//div[@style='display: block;']/img"));
    public Button buttonDelete=new Button(By.id("ProjShareMenuDel"));
}
