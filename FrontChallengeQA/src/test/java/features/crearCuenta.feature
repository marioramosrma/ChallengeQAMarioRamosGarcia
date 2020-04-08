Feature: Creacion de cuenta
  Como nuevo cliente, quiero poder registrarme en automationpractice.com.

  Scenario: Crear una nueva cuenta correctamente
    Given El usuario se encuentra en el inicio de automationpractice
    When Hace click sobre el boton Sign in
    And Rellena la direccion de email con un correo no existente
    And El usuario hace click sobre el boton Create an account
    And Rellena el formulario de informacion personal
    And El usuario hace click sobre el boton Register
    Then El usuario quedara registrado correctamente

  Scenario: Crear una nueva cuenta con un correo ya registrado
    Given El usuario se encuentra en el inicio de automationpractice
    When Hace click sobre el boton Sign in
    And Rellena la direccion de email con un correo existente
    And El usuario hace click sobre el boton Create an account
    Then Se visualiza un error de registro por correo ya existente
