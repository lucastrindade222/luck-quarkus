package br.com.lucas.recouser;

import org.junit.jupiter.api.Test;

import br.com.lucas.DTO.RaffleName;
import io.quarkus.test.junit.QuarkusTest;
import io.restassured.http.ContentType;

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
          .when().get("/api/raffle/number/1")
          .then()
             .statusCode(200)
             .body("number",is(1));
    }

    @Test
    public void testraffleName() {
           given()
          .contentType(ContentType.JSON)
          .body(new RaffleName("carro,casa"))
          .when().post("/api/raffle/names")
          .then()
          .statusCode(200);
    }

}
