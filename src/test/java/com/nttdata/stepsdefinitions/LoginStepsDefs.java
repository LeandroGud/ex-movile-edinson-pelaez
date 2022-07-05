package com.nttdata.stepsdefinitions;

import com.nttdata.steps.LoginSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

import java.util.concurrent.TimeUnit;

public class LoginStepsDefs {



    @Steps
    LoginSteps loginSteps;

    @Given("que me encuentro en el login de SwagLabs")
    public void que_me_encuentro_en_el_login_de_swag_labs() {
            loginSteps.clickPagina();
    }
    @When("ingrese usuario {string}, contraseña {string}")
    public void ingrese_usuario_contraseña(String usuario, String contraseña) {
        loginSteps.ingresarDatos(usuario,contraseña);
        loginSteps.ingresarPagina();

    }
    @Then("valido que deberia aparecer el titulo {string}")
    public void valido_que_deberia_aparecer_el_titulo(String products) {
        Assert.assertEquals(loginSteps.getResultText(), products);
   }
    //@And("tambien valido que exista al menos un item")
    //public void tambien_valido_que_exista_al_menos_un_item() {
    //}
}
