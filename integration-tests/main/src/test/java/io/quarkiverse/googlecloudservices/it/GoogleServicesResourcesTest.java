package io.quarkiverse.googlecloudservices.it;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledIfSystemProperty;

import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
@EnabledIfSystemProperty(named = "gcloud.test", matches = "true")
public class GoogleServicesResourcesTest {

    @Test
    public void testBigQuery() {
        given()
                .when().get("/bigquery")
                .then()
                .statusCode(200);
    }

    @Test
    public void testBigtable() {
        given()
                .when().get("/bigtable")
                .then()
                .statusCode(200);
    }

    @Test
    public void testFirestore() {
        given()
                .when().get("/firestore")
                .then()
                .statusCode(200);
    }

    @Test
    public void testPubSub() {
        given()
                .when().get("/pubsub")
                .then()
                .statusCode(204);
    }

    @Test
    public void testSpanner() {
        given()
                .when().get("/spanner")
                .then()
                .statusCode(200);
    }

    @Test
    public void testStorage() {
        given()
                .when().get("/storage")
                .then()
                .statusCode(200);
    }

    @Test
    public void testSecretManager() {
        given()
                .when().get("/secretmanager")
                .then()
                .statusCode(200)
                .body(is("integration-test-secret"));
    }
}
