package com.bancolombia.test.page;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class PageWeb {

    private WebDriver driver;

    @FindBy(xpath = "//*[@id=\"header-personas\"]")
    private WebElement opcionPersonas;

    @FindBy(xpath = "//*[@id= \"header-solicitud-productos\"]")
    private WebElement opcionSolicitudProducto;

    @FindBy(xpath = "//*[@id= \"filtro-inversiones\"]")
    private WebElement opcionFiltroInversiones;

    @FindBy(xpath = "//*[@Id = \"mostrar-filtros\"]")
    private WebElement opcionMostrarFiltros;

    @FindBy(xpath = "//*[@Id = \"tag-catMontoMinimo500000 icon-cash\"]")
    private WebElement opcionMontoMinimo;

    @FindBy(xpath = "//*[@Id = \"filtrado-conoce-inversion-0\"]")
    private WebElement opcionConoceMas;

    @FindBy(xpath = "//*[text() = \"Documentos\"]")
    private WebElement opcionDocumentos;

    @FindBy(xpath = "//*[@src=\"/wcm/connect/69304693-1ff3-43a0-bc20-291e4b104e8a/save.png?MOD=AJPERES\"]")
    private WebElement opcionReglamento;

    public PageWeb(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.driver = driver;
    }

    public void seleccionarPersonas() {
        if(opcionPersonas.isDisplayed()){
            opcionPersonas.click();
        }else{
            System.out.println("No se ha desplegado opción Personas");
        }

    }

    public void seleccionarSolicitudProducto(){
        if(opcionSolicitudProducto.isDisplayed()){
            opcionSolicitudProducto.click();
        }
    }

    public void seleccionarFiltroInversiones(){
        if(opcionFiltroInversiones.isDisplayed()){
            opcionFiltroInversiones.click();
        }
    }

    public void seleccionarMostrarFiltros(){
        if(opcionMostrarFiltros.isDisplayed()){
            opcionMostrarFiltros.click();
        }
    }

    public void seleccionarMontoMinimo(){
        if(opcionMontoMinimo.isDisplayed()){
            opcionMontoMinimo.click();
        }
    }

    public void seleccionarOpcionConoceMas(){
        if(opcionConoceMas.isDisplayed()){
            opcionConoceMas.click();
        }
    }

    public void seleccionarOpcionDocumentos() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1700)", "");
        //Thread.sleep(5000);
        if(opcionDocumentos.isDisplayed()){
            opcionDocumentos.click();
        }
    }

    public void seleccionarReglamento() throws InterruptedException {
        Thread.sleep(5000);
        if (opcionReglamento.isDisplayed()) {
            opcionReglamento.click();
        }
    }


    public boolean validarDocumentoPdf() {
        for(String winHandle : driver.getWindowHandles()){
            driver.switchTo().window(winHandle);
        }
        if(driver.getCurrentUrl().equalsIgnoreCase("https://www.grupobancolombia.com/wcm/connect/www.grupobancolombia.com15880/fee51124-9970-433f-919b-48af49d1c081/Contrato+Inversi%C3%B3n+Virtual.pdf?MOD=AJPERES&CVID=mGPj0Ri")){
            System.out.println("Se desplego pdf correctamente");
            return true;
        }else{
            return false;
        }
    }
}

