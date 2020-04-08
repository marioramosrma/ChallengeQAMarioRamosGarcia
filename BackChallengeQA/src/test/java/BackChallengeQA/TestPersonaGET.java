package BackChallengeQA;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import org.testng.annotations.Test;

public class TestPersonaGET {

    @Test
    public void  testGETPersona200() {

        given().
            get("https://back-qa.herokuapp.com/persona/ezequiel").
        then().
            statusCode(200).
            body("nombre[0]", equalTo("ezequiel")).
            body("apellido[0]", equalTo("hermoso")).
            log().all();
    }

    @Test
    public void testGETPersona500() {

        given().
            get("https://back-qa.herokuapp.com/persona/error/500/ezequiel").
        then().
            statusCode(500).
            body("content", equalTo("Error interno del servidor")).
            log().all();

    }

    @Test
    public void testGETPersona404() {

        given().
            get("https://back-qa.herokuapp.com/persona/error/404/ezequiel").
        then().
            statusCode(404).
            body("content", equalTo("Error endpoint no encontrado")).
            log().all();

    }

    @Test
    public void testGETPersona401() {

        given().
            get("https://back-qa.herokuapp.com/persona/error/401/ezequiel").
        then().
            statusCode(401).
            body("content", equalTo("Error acceso no autorizado")).
            log().all();

    }

}
