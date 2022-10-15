Feature: facebook
  @e2e
  Scenario Outline: login

    Given que tengo acceso a facebook
    When yo ingreso mi usuario: "<user>"
    And yo ingreso mi pwd: <password>
    And realizo click en el boton ingresar
    Then deberia iniciar sesion

    Examples:
    |user      |password       |
    |eynar1    |1234           |
    |eynar2    |3333           |
    |eynar3    |5555           |
    |eynar4    |1234567880pppp |

