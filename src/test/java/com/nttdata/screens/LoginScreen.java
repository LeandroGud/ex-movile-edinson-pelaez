package com.nttdata.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class LoginScreen extends PageObject {


        //Ingresamos datos


    @AndroidFindBy(xpath = "//android.widget.ScrollView[@content-desc=\"test-Login\"]/android.view.ViewGroup/android.widget.ImageView[1]")
    private WebElement clickSwag;

    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc=\"test-Username\"]")
    private WebElement clickUser;

    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc=\"test-Username\"]")
    private WebElement ingresarUser;

    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc=\"test-Password\"]")
    private WebElement clickPassword;
    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc=\"test-Password\"]")
    private WebElement ingresarPassword;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-LOGIN\"]")
    private WebElement ingresarButton;



public void clickPagina(){
    clickSwag.click();
    getDriver().manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
}

    public void clickUsuario(){

        clickUser.click();
    }
    public void ingresarUsuario(String usuario, String contraseña){
        ingresarUser.sendKeys(usuario);

    }


    public void clickContraseña(){
        clickPassword.click();
    }
   public void ingresarContraseña(String contraseña){
        ingresarPassword.sendKeys(contraseña);
    }


    public void ingresarPagina(){
        ingresarButton.click();

    }







}
