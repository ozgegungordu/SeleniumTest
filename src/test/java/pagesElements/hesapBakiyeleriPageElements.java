package pagesElements;

import com.google.inject.Binder;
import com.google.inject.Module;
import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BaseDriver;
import utilities.Parent;

import java.util.List;


public class hesapBakiyeleriPageElements extends Parent implements Module {
    public hesapBakiyeleriPageElements(){
        PageFactory.initElements(BaseDriver.getDriver(), this);
    }


    @FindBy(xpath = "//li[@class='ant-pagination-options']//li[@role='option']")
    private List<WebElement> listPaginationOptions;

    @FindBy(css = "#antContainerScroll > div > div.fadeInComponent > div > div > div > div > div.ant-collapse-content.ant-collapse-content-active > div > form > div > div.ant-col.text-center.mb-15.ant-col-xs-24.ant-col-lg-0 > button")
    private WebElement btnListele;

    @FindBy(xpath = "//li[@class='ant-pagination-options']//i")
    private WebElement dropDownPagination;

    @FindBy(xpath = "//li[@class='ant-pagination-options']//li[@role='option']")
    private WebElement optionsPagination;

    public List<WebElement> getListPaginationOptions() {
        return listPaginationOptions;
    }

    public WebElement getBtnListele() {
        return btnListele;
    }

    public WebElement getDropDownPagination() {
        return dropDownPagination;
    }

    public WebElement getOptionsPagination() {
        return optionsPagination;
    }

    @Override
    public void configure(Binder binder) {
    }
}
