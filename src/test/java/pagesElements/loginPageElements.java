package pagesElements;

import com.google.inject.Binder;
import com.google.inject.Module;
import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BaseDriver;
import utilities.Parent;

@Getter
public class loginPageElements extends Parent implements Module {
    public loginPageElements(){
        PageFactory.initElements(BaseDriver.getDriver(), this);
    }


    @FindBy(css="#username")
    private WebElement inputUserName;
    @FindBy(css="#password")
    private WebElement inputPassword;
    @FindBy(xpath="//button[normalize-space()='Giriş Yap']")
    private WebElement btnLogin;

    @Override
    public void configure(Binder binder) {

    }
}
