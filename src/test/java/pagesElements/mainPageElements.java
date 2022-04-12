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

public class mainPageElements extends Parent implements Module {
    public mainPageElements(){
        PageFactory.initElements(BaseDriver.getDriver(), this);
    }

    @FindBy(css="div[class*='netekstre'] div[class='right-icon']")
    private WebElement btnNetekstreModulu;


    @Override
    public void configure(Binder binder) {

    }
}
