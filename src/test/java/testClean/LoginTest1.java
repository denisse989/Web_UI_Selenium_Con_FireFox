package testClean;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import page.*;
import singleton.Session;

public class LoginTest1 extends BaseTodoLy {
    MainPage mainPage= new MainPage();
    LoginModal loginModal= new LoginModal();
    MenuSection menuSection = new MenuSection();
    String projectName="DenissePrueba1";
    Creation creation=new Creation();
    Actualizacion actualizacion= new Actualizacion();
    Delete delete=new Delete();


    @Test
    public void verifyLoginTodoLy() throws InterruptedException {
        mainPage.loginImage.click();
        loginModal.emailTxtBox.setText("deni@email.com");
        loginModal.pwdTxtBox.setText("12345");
        loginModal.loginButton.click();
        Assertions.assertTrue(menuSection.logoutButton.isControlDisplayed(),
                "ERROR no se pudo hacer el login");
        //CREATION
        creation.buttonNewProject.click();
        creation.nameProject.setText(projectName);
        creation.buttonNewName.click();
        Thread.sleep(1000);
        //Actualizar
        actualizacion.nameProject.click();
        actualizacion.imageMenu.click();
        actualizacion.buttonEdit.click();
        String newNameProj="Denisse123";
        actualizacion.textBoxName.clearSetText("Denisse123");
        actualizacion.guardar.click();
        Thread.sleep(2000);
        Assertions.assertEquals(newNameProj,actualizacion.newName.getTextControl(),"ERROR no se creo el projecto");
        //Delete
        delete.imageName.click();
        delete.imageMenu.click();
        delete.buttonDelete.click();
        Session.getInstance().externo();

        Thread.sleep(2000);
        String currentName=delete.currentProject.getTextControl();
        Assertions.assertTrue(!currentName.equals("Denisse123"),"ERROR el projecto no se Elimino");

    }
}
