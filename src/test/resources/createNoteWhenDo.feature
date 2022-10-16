Feature: Notes
  @movile
  Scenario: Como usuario quiero crear una nota para ver mi progreso en mis tareas

    Given que tengo abierto la app: whenDo
    When hago click en el boton [+]
    * ingreso el titulo: Catolica
    * ingreso la descripcion: cato description
    And hago click en boton [guardar]
    Then la nota "Catolica" deberia ser creada