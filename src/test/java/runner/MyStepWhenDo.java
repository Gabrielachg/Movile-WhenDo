package runner;

import activity.whenDo.CreateNoteForm;
import activity.whenDo.MainScreen;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class MyStepWhenDo {

    MainScreen mainScreen = new MainScreen();
    CreateNoteForm createNoteForm = new CreateNoteForm();

    @Given("que tengo abierto la app: whenDo")
    public void queTengoAbiertoLaAppWhenDo() {
    }

    @When("hago click en el boton [+]")
    public void hagoClickEnElBoton() {
        mainScreen.addNoteButton.click();
    }

    @And("ingreso el titulo: {}")
    public void ingresoElTituloCatolica(String titulo) {
        createNoteForm.titleTxtBox.setText(titulo);
    }

    @And("ingreso la descripcion: {}")
    public void ingresoLaDescripcionCatoDescription(String description) {
        createNoteForm.noteTxtBox.setText(description);
    }

    @And("hago click en boton [guardar]")
    public void hagoClickEnBotonGuardar() {
        createNoteForm.saveButton.click();
    }

    @Then("la nota {string} deberia ser creada")
    public void laNotaDeberiaSerCreada(String expectedResult) {
        Assertions.assertTrue(mainScreen.isNoteDisplayed(expectedResult),
                "ERROR, the note was not created");
    }
}
