## Prueba del Back ChallengeQA

Para descargar las dependecias hay que realizar ``maven clean`` y ``maven install``, para verificar que compila el proyecto ``maven compile``.

Para ejecutar el proyecto ````maven test````.

Esta prueba se ha realizado con RestAssured. Las pruebas realizadas han sido las siguientes:

### Se tiene un desarrollo de Backend con 4 servicios externalizados GET
Servicio de persona que devuelve un status 200 {"response": {"nombre": "ezequiel","apellido":"hermoso"}} https://back-qa.herokuapp.com/persona/ezequiel

Servicio de persona que devuelve un status error 500 {"error": "Error interno del servidor"} https://back-qa.herokuapp.com/persona/error/500/ezequiel

Servicio de persona que devuelve un status error 404 {"error": "Error endpoint no encontrado"} https://back-qa.herokuapp.com/persona/error/404/ezequiel

Servicio de persona que devuelve un status error 401 {"error": "Error acceso no autorizado"} https://back-qa.herokuapp.com/persona/error/401/ezequiel

### 4 Servicios externalizados POST
Servicio de persona se le envía un request {"nombre": "ezequiel", "apellido":"hermoso"} que devuelve un status 200 https://back-qa.herokuapp.com/persona/

Servicio de persona se le envía un request {"nombre": "ezequiel", "apellido":"hermoso"} que devuelve un status error 500 https://back-qa.herokuapp.com/persona/error/500/

Servicio de persona se le envía un request {"nombre": "ezequiel", "apellido":"hermoso"} que devuelve un status error 404 https://back-qa.herokuapp.com/persona/error/404/

Servicio de persona se le envía un request {"nombre": "ezequiel", "apellido":"hermoso"} que devuelve un status error 401 https://back-qa.herokuapp.com/persona/error/401/

### 4 Servicios externalizados PUT
Servicio de persona se le envía un request {"apellido":"hermoso2"} que devuelve un status 200 https://back-qa.herokuapp.com/persona/ezequiel

Servicio de persona se le envía un request {"apellido":"hermoso2"} que devuelve un status error 500 https://back-qa.herokuapp.com/persona/error/500/ezequiel

Servicio depersona se le envía un request {"apellido":"hermoso2"} que devuelve un status error 404 https://back-qa.herokuapp.com/persona/error/404/ezequiel

Servicio de persona se le envía un request {"apellido":"hermoso2"} que devuelve un status error 401 https://back-qa.herokuapp.com/persona/error/401/ezequiel

Para verificar que se modificó con el put se debe ejecutar el siguiente servicio servicio de persona que devuelve un status 200 {"response": {"nombre": "ezequiel","apellido":"hermoso2"}} https://back-qa.herokuapp.com/persona/ezequiel

Servicio de persona se le envía un request {"nombre: ezequiel", "apellido:hermoso"} que devuelve un status error 500 https://back-qa.herokuapp.com/persona/ezequiel
