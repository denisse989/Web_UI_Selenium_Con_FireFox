package testClean;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import page.LoginModal;
import page.MainPage;
import page.MenuSection;
import page.Settings;

public class ChangeNameTest extends BaseTodoLy {
    MainPage mainPage= new MainPage();
    LoginModal loginModal= new LoginModal();
    MenuSection menuSection = new MenuSection();
    Settings settingsSection=new Settings();

    @Test
    public void verifyLoginTodoLy() throws InterruptedException {
        mainPage.loginImage.click();
        loginModal.emailTxtBox.setText("deni@email.com");
        loginModal.pwdTxtBox.setText("12345");
        loginModal.loginButton.click();
        //
        menuSection.settingsButton.click();
        Thread.sleep(2000);
        settingsSection.fullName.clearSetText("deni123@email.com");
        settingsSection.fullName.getTextControl();
        Thread.sleep(2000);
        settingsSection.buttonOk.click();
        Thread.sleep(2000);
        menuSection.settingsButton.click();
        Thread.sleep(3000);
        Assertions.assertEquals("deni123@email.com",settingsSection.fullName.getTextAttributeControl("value"),"ERROR");

    }
}
