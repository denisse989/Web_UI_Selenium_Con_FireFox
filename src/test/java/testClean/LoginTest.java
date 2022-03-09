package testClean;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import page.LoginModal;
import page.MainPage;
import page.MenuSection;
import singleton.Session;

public class LoginTest extends BaseTodoLy {
    MainPage mainPage= new MainPage();
    LoginModal loginModal= new LoginModal();
    MenuSection menuSection = new MenuSection();

    @Test
    public void verifyLoginTodoLy(){
        mainPage.loginImage.click();
        loginModal.emailTxtBox.setText("clean@upb22.com");
        loginModal.pwdTxtBox.setText("12345");
        loginModal.loginButton.click();
        Assertions.assertTrue(menuSection.logoutButton.isControlDisplayed(),
                "ERROR no se pudo hacer el login");
    }
}
