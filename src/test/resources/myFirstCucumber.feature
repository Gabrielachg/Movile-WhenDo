@regresion
Feature: facebook
  @e2e @sanity
  Scenario: login

    Given que tengo acceso a facebook
    When yo ingreso mi usuario: "eynar"
    And yo ingreso mi pwd: eynar9!
    And realizo click en el boton ingresar
    Then deberia iniciar sesion
