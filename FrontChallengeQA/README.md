## Prueba del Front ChallengeQA

Para descargar las dependecias hay que realizar ``maven clean`` y ``maven install``, para verificar que compila el proyecto ``maven compile``.

Para ejecutar el proyecto ````maven test````.

Esta prueba se ha realizado con Selenium y Cucumber, siguiendo el patrón de Page Object. Las pruebas realizadas han sido las siguientes:

Se tiene la siguiente Web siendo un Ecommerce B2C, http://automationpractice.com/index.php el cual se requiere automatizar una serie de pruebas de regresion para validar una serie de funcionalidades la casuistica es la siguiente:

- Validar la funcionalidad de crear cuenta la cual estara vinculada a una cuenta de correo y luego se rellena un formulario, y el alta se realice correctamente

- Validar poder realizar la compra de cualquier producto de la web, donde se debe cumplir el flujo funcional de seleccionar la prenda, agregarla al carrito, proceder al pago (3 veces) luego aceptar los terminos de servicio, seleccionar cualquiera de los 2 metodos de pago disponibles, confirmar la orden y luego volver a la orden y poder capturar la evidencia del historico del carrito

- Validar intentar crear una cuenta con un correo ya registrado, donde se debe capturar el error y para que dar el ok al test se debe hacer un equals al error textual"An account using this email address has already been registered. Please enter a valid password or request a new one." 