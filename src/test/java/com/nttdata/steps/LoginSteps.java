package com.nttdata.steps;

import com.nttdata.screens.LoginScreen;
import com.nttdata.screens.ProductosScreen;
import net.thucydides.core.annotations.Step;

public class LoginSteps {


    LoginScreen loginScreen;
    ProductosScreen productosScreen;

    public void clickPagina(){
        loginScreen.clickPagina();
    }


    @Step("Ingreso de Datos")
    public void ingresarDatos(String usuario,String contraseña){
     loginScreen.clickUsuario();
     loginScreen.ingresarUsuario(usuario,contraseña);
     loginScreen.clickContraseña();
     loginScreen.ingresarContraseña(contraseña);
    }

    @Step("Ingreso a la pagina")
    public void ingresarPagina(){

        loginScreen.ingresarPagina();
    }

    @Step("Confirmo la palabra PRODUCTS")
    public Object getResultText() {
        return productosScreen.getResultText();

    }


}
