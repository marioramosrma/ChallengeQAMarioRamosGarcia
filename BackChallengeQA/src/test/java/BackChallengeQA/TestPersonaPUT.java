package BackChallengeQA;

import io.restassured.http.ContentType;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class TestPersonaPUT {

    @Test
    public void  testPUTPersona200() {

        JSONObject request = createPUTRequest();

        given().
            header("Content-Type", "application/json").
            contentType(ContentType.JSON).
            accept(ContentType.JSON).
            body(request.toJSONString()).
        when().
            put("https://back-qa.herokuapp.com/persona/ezequiel").
        then().
            statusCode(200).
            log().all();

    }

    @Test
    public void testPUTPersona500() {

        JSONObject request = createPUTRequest();

        given().
            header("Content-Type", "application/json").
            contentType(ContentType.JSON).
            accept(ContentType.JSON).
            body(request.toJSONString()).
        when().
            put("https://back-qa.herokuapp.com/persona/error/500/ezequiel").
        then().
            statusCode(500).
            log().all();

    }

    @Test
    public void testPUTPersona404() {

        JSONObject request = createPUTRequest();

        given().
            header("Content-Type", "application/json").
            contentType(ContentType.JSON).
            accept(ContentType.JSON).
            body(request.toJSONString()).
        when().
            put("https://back-qa.herokuapp.com/persona/error/404/ezequiel").
        then().
            statusCode(404).
            log().all();

    }

    @Test
    public void testPUTPersona401() {

        JSONObject request = createPUTRequest();

        given().
            header("Content-Type", "application/json").
            contentType(ContentType.JSON).
            accept(ContentType.JSON).
            body(request.toJSONString()).
        when().
            put("https://back-qa.herokuapp.com/persona/error/401/ezequiel").
        then().
            statusCode(401).
            log().all();

    }

    public JSONObject createPUTRequest() {

        JSONObject request = new JSONObject();

        request.put("apellido","hermoso2");

        return request;

    }

}
