package org.acme;

import static org.hamcrest.Matchers.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;
import io.restassured.RestAssured;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;

@QuarkusTest
public class GivenDateTest {

    @BeforeAll
    static void init() {
        RestAssured.filters(new RequestLoggingFilter(), new ResponseLoggingFilter());
    }
    
    @Test
    void testGiven() {
        RestAssured.given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .body("{ \"context\" : { \"submittedDate\": \"2020-07-14\" } }")
                .post("/sample")
                .then()
                .body("givenDate", is("2020-07-14"))
                .statusCode(200);
    }

    @Test
    void testNull() {
        RestAssured.given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .body("{ \"context\" : { \"submittedDate\": null } }")
                .post("/sample")
                .then()
                .body("givenDate", isA(String.class))
                .statusCode(200);
    }
}