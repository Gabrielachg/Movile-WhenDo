package runner;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepdefs {

    /**
     *  cucumber expression / regular expression
     *  {} ----> reemplazar cualquier valor
     *  {string} ---> remplaza un valor si esta en "valor"
     *  {int} ---> remplazar valores enteros
     *  {word} ---> remplaza una palabra
     *  {float} ---> remplaza un valor flotante
     */

    @Given("que tengo acceso a {}")
    public void queTengoAccesoAFacebook(String app) {

    }

    @When("yo ingreso mi usuario: {string}")
    public void yoIngresoMiUsuarioEynar(String name) {
    }

    @And("yo ingreso mi pwd: {}")
    public void yoIngresoMiPwdEynar(String pwd) {
    }

    @And("realizo click en el boton ingresar")
    public void realizoClickEnElBotonIngresar() {
    }

    @Then("deberia iniciar sesion")
    public void deberiaIniciarSesion() {
    }
}
