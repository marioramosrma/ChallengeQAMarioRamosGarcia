Feature: Compra de articulos
  Como cliente, quiero poder comprar articulos en automationpractice.com.

  Scenario: Compra de 3 articulos
    Given El usuario se encuentra en el inicio de automationpractice
    When Hace click sobre el boton Sign in
    And Inicia sesion con su usuario
    And Hace click sobre el boton WOMEN
    And Hace click sobre un articulo
    And Añade el articulo al carrito
    And Hace click en Proceed to checkout
    And Hace click en Proceed to checkout
    And Hace click en Proceed to checkout
    And Acepta los terminos y condiciones
    And Hace click en Proceed to checkout
    And Escoge un metodo de pago
    And Confirma el pedido
    Then El pedido se habra completado correctamente