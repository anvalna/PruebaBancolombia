Feature:Informacion de inversion virtual

  As usuario de bancolombia
  I want tener informacion de inversion virtual
  So invertir en bancolombia

  @Prueba
  Scenario: Informacion de inversion virtual
    Given he ingresado a la pagina de bancolombia
    When selecciono la opcion Personas
    And selecciono la opcion Solicita tus productos
    And selecciono la opcion Inversiones
    And selecciono monto minimo
    And selecciono la opcion conoce mas
    And seleccciono la opcion documentos
    And selecciono la opcion Reglamento inversion virtual
    Then observo el documento con la informacion correspondiente