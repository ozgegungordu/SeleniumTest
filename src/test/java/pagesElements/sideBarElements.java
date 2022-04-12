package pagesElements;

import com.google.inject.Binder;
import com.google.inject.Module;
import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BaseDriver;
import utilities.Parent;


@Getter //Lombok
public class sideBarElements extends Parent implements Module {

    public sideBarElements(){
        PageFactory.initElements(BaseDriver.getDriver(), this);
    }

    @FindBy(xpath="//span[. = 'Hesap Bakiyeleri']")
    private WebElement btnHesapBakiyeleri;

    @Override
    public void configure(Binder binder) {

    }
}
