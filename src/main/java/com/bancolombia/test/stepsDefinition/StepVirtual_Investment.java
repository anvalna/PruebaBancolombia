package com.bancolombia.test.stepsDefinition;

import com.bancolombia.test.WebAction;
import com.bancolombia.test.helpers.ConfigurationController;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

public class StepVirtual_Investment {

    private WebDriver driver;
    private WebAction webAction;
    private String urlBase = "https://www.grupobancolombia.com/";

    @Before
    public void setUp(){
        //Instancia webdriver
        ConfigurationController controller = new ConfigurationController();
        driver = controller.getDriver();
        webAction = new WebAction(driver);
    }

    @After
    public void tearDown(){
        //driver.close();
    }

    @Given("^he ingresado a la pagina de bancolombia$")
    public void heIngresadoALaPaginaDeBancolombia() {
        webAction.abrirPagina(urlBase);
    }

    @When("^selecciono la opcion Personas$")
    public void seleccionoLaOpcionPersonas() {
        webAction.seleccionarPersonas();
    }

    @And("^selecciono la opcion Solicita tus productos$")
    public void seleccionoLaOpcionSolicitaTusProductos() {
       webAction.seleccionarSolicitudProducto();
    }

    @And("^selecciono la opcion Inversiones$")
    public void seleccionoLaOpcionInversiones() {
        webAction.seleccionarFiltroInversiones();
    }

    @And("^selecciono monto minimo$")
    public void seleccionoMontoMinimo() {
        webAction.seleccionarMostrarFiltros();
        webAction.seleccionarMontoMinimo();
    }

    @And("^selecciono la opcion conoce mas$")
    public void seleccionoLaOpcionConoceMas() {
        webAction.seleccionarOpcionConoceMas();
    }

    @And("^seleccciono la opcion documentos$")
    public void selecccionoLaOpcionDocumentos() {
        webAction.seleccionarOpcionDocumentos();
    }

    @And("^selecciono la opcion Reglamento inversion virtual$")
    public void seleccionoLaOpcionReglamentoInversionVirtual() {
       webAction.seleccionarOpcionReglamento();
    }

    @Then("^observo el documento con la informacion correspondiente$")
    public void observoElDocumentoConLaInformacionCorrespondiente() {
        webAction.validarDocumentoPdf();
    }
}
