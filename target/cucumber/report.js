$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("virtual_investment.feature");
formatter.feature({
  "line": 1,
  "name": "Informacion de inversion virtual",
  "description": "\r\nAs usuario de bancolombia\r\nI want tener informacion de inversion virtual\r\nSo invertir en bancolombia",
  "id": "informacion-de-inversion-virtual",
  "keyword": "Feature"
});
formatter.before({
  "duration": 7458252100,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "Informacion de inversion virtual",
  "description": "",
  "id": "informacion-de-inversion-virtual;informacion-de-inversion-virtual",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 7,
      "name": "@Prueba"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "he ingresado a la pagina de bancolombia",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "selecciono la opcion Personas",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "selecciono la opcion Solicita tus productos",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "selecciono la opcion Inversiones",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "selecciono monto minimo",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "selecciono la opcion conoce mas",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "seleccciono la opcion documentos",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "selecciono la opcion Reglamento inversion virtual",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "observo el documento con la informacion correspondiente",
  "keyword": "Then "
});
formatter.match({
  "location": "StepVirtual_Investment.heIngresadoALaPaginaDeBancolombia()"
});
formatter.result({
  "duration": 7412041800,
  "status": "passed"
});
formatter.match({
  "location": "StepVirtual_Investment.seleccionoLaOpcionPersonas()"
});
formatter.result({
  "duration": 10529755600,
  "error_message": "org.openqa.selenium.TimeoutException: Expected condition failed: waiting for alert to be present (tried for 10 second(s) with 500 milliseconds interval)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027PSOFKA0073\u0027, ip: \u002710.0.75.1\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_211\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 2.38.552522 (437e6fbedfa876..., userDataDir: C:\\Users\\ANGEL~1.VAL\\AppDat...}, cssSelectorsEnabled: true, databaseEnabled: false, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, rotatable: false, setWindowRect: true, takesHeapSnapshot: true, takesScreenshot: true, unexpectedAlertBehaviour: , unhandledPromptBehavior: , version: 89.0.4389.114, webStorageEnabled: true}\nSession ID: ee6645198f482d27d3dc70f7b478ae7c\r\n\tat org.openqa.selenium.support.ui.WebDriverWait.timeoutException(WebDriverWait.java:95)\r\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:272)\r\n\tat com.bancolombia.test.page.PageWeb.seleccionarPersonas(PageWeb.java:54)\r\n\tat com.bancolombia.test.WebAction.seleccionarPersonas(WebAction.java:27)\r\n\tat com.bancolombia.test.stepsDefinition.StepVirtual_Investment.seleccionoLaOpcionPersonas(StepVirtual_Investment.java:39)\r\n\tat ✽.When selecciono la opcion Personas(virtual_investment.feature:10)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "StepVirtual_Investment.seleccionoLaOpcionSolicitaTusProductos()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepVirtual_Investment.seleccionoLaOpcionInversiones()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepVirtual_Investment.seleccionoMontoMinimo()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepVirtual_Investment.seleccionoLaOpcionConoceMas()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepVirtual_Investment.selecccionoLaOpcionDocumentos()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepVirtual_Investment.seleccionoLaOpcionReglamentoInversionVirtual()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepVirtual_Investment.observoElDocumentoConLaInformacionCorrespondiente()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 45900,
  "status": "passed"
});
});