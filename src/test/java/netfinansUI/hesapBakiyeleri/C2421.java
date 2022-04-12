package netfinansUI.hesapBakiyeleri;


import com.google.inject.Inject;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Guice;
import org.testng.annotations.Test;
import pagesElements.hesapBakiyeleriPageElements;
import pagesElements.loginPageElements;
import pagesElements.mainPageElements;
import pagesElements.sideBarElements;
import utilities.BaseDriver;

import java.util.List;


@Guice(modules = {loginPageElements.class, mainPageElements.class,
        sideBarElements.class, hesapBakiyeleriPageElements.class})
public class C2421 extends BaseDriver {

    @Inject
    hesapBakiyeleriPageElements hesapBakiyeleriPageElements;
    @Inject
    sideBarElements sideBarElements;
    @Inject
    loginPageElements loginPageElements;
    @Inject
    mainPageElements mainPageElements;


    /**
     * Author = Furkan
     * @throws InterruptedException
     */

    @Test(groups = {"smokeTest","regressionTest"})
    void  C2421_Hesap_Bakiyeleri() throws InterruptedException {
        invalidLogin();
        mainPageElements.getBtnNetekstreModulu().click();
        sideBarElements.getBtnHesapBakiyeleri().click();
        Thread.sleep(1000);

        //hesapBakiyeleriPageElements.getBtnListele().click();
        JavascriptExecutor executor = (JavascriptExecutor) BaseDriver.getDriver();
        executor.executeScript("arguments[0].click();", hesapBakiyeleriPageElements.getBtnListele());
        Thread.sleep(1000);

        hesapBakiyeleriPageElements.getDropDownPagination().click();
        Thread.sleep(1000);
        hesapBakiyeleriPageElements.fetchAllDataAsList(hesapBakiyeleriPageElements.getListPaginationOptions(),"10 / sayfa,25 / sayfa,50 / sayfa,100 / sayfa,");

        Thread.sleep(1000);

    }


    void invalidLogin(){
        loginPageElements.getInputUserName().sendKeys("ortaknetekstre@yandex.com");
        loginPageElements.getInputPassword().sendKeys("Kd!cyhz4");
        loginPageElements.getBtnLogin().click();
    }



}
