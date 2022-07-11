package br.com.lucas.recouser;

import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;
import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;
@QuarkusTest
public class RaffleControleTest {
    

    @Test
    public void testNewBingo() {
        given()
          .when().get("/api/raffle/newBingo")
          .then()
             .statusCode(200)
             .body("[74].id",is(75));
    }

    @Test
    public void testRaffleNumbers() {
        given()
          .when().get("/api/raffle/number")
          .then()
             .statusCode(200)
             .body("number",is(1));
    }

}
