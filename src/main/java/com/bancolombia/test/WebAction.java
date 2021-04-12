package com.bancolombia.test;

import com.bancolombia.test.page.PageWeb;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class WebAction {

    private WebDriver driver;

    public WebAction(WebDriver driver){
        this.driver = driver;
    }

    public void abrirPagina(String url){
        try {
            driver.get(url);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        }catch(Exception e){
            System.out.println("Fallo" + e);
        }
    }

    public void seleccionarPersonas() {
        PageWeb pageWeb = new PageWeb(driver);
        pageWeb.seleccionarPersonas();
    }

    public void seleccionarSolicitudProducto(){
        PageWeb pageWeb = new PageWeb(driver);
        pageWeb.seleccionarSolicitudProducto();
    }

    public void seleccionarFiltroInversiones(){
        PageWeb pageWeb = new PageWeb(driver);
        pageWeb.seleccionarFiltroInversiones();
    }

    public void seleccionarMostrarFiltros(){
        PageWeb pageWeb = new PageWeb(driver);
        pageWeb.seleccionarMostrarFiltros();
    }

    public void seleccionarMontoMinimo(){
        PageWeb pageWeb = new PageWeb(driver);
        pageWeb.seleccionarMontoMinimo();
    }

    public void seleccionarOpcionConoceMas(){
        PageWeb pageWeb = new PageWeb(driver);
        pageWeb.seleccionarOpcionConoceMas();
    }

    public void seleccionarOpcionDocumentos() throws InterruptedException {
        PageWeb pageWeb = new PageWeb(driver);
        pageWeb.seleccionarOpcionDocumentos();
    }

    public void seleccionarOpcionReglamento() throws InterruptedException {
        PageWeb pageWeb = new PageWeb(driver);
        pageWeb.seleccionarReglamento();
    }

    public void validarDocumentoPdf() {
        PageWeb pageWeb= new PageWeb(driver);
        Assert.assertTrue("Se abrio página con PDF",pageWeb.validarDocumentoPdf());
    }
}
