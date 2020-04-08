package BackChallengeQA;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;

import io.restassured.http.ContentType;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class TestPersonaPOST {

    @Test
    public void  testPOSTPersona200() {

        JSONObject request = createPOSTRequest();

        given().
            header("Content-Type", "application/json").
            contentType(ContentType.JSON).
            accept(ContentType.JSON).
            body(request.toJSONString()).
        when().
            post("https://back-qa.herokuapp.com/persona/").
        then().
            statusCode(200).
            log().all();

    }

    @Test
    public void testPOSTPersona500() {

        JSONObject request = createPOSTRequest();

        given().
            header("Content-Type", "application/json").
            contentType(ContentType.JSON).
            accept(ContentType.JSON).
            body(request.toJSONString()).
        when().
            post("https://back-qa.herokuapp.com/persona/error/500/").
        then().
            statusCode(500).
            body("content", equalTo("Error interno del servidor")).
            log().all();

    }

    @Test
    public void testPOSTPersona404() {

        JSONObject request = createPOSTRequest();

        given().
            header("Content-Type", "application/json").
            contentType(ContentType.JSON).
            accept(ContentType.JSON).
            body(request.toJSONString()).
        when().
            post("https://back-qa.herokuapp.com/persona/error/404/").
        then().
            statusCode(404).
            body("content", equalTo("Error endpoint no encontrado")).
            log().all();

    }

    @Test
    public void testPOSTPersona401() {

        JSONObject request = createPOSTRequest();

        given().
            header("Content-Type", "application/json").
            contentType(ContentType.JSON).
            accept(ContentType.JSON).
            body(request.toJSONString()).
        when().
            post("https://back-qa.herokuapp.com/persona/error/401/").
        then().
            statusCode(401).
            body("content", equalTo("Error acceso no autorizado")).
            log().all();

    }

    public JSONObject createPOSTRequest() {

        JSONObject request = new JSONObject();

        request.put("nombre","ezequiel");
        request.put("apellido","hermoso");

        return request;

    }

}
