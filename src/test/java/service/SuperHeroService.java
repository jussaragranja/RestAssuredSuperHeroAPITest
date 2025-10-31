package service;

import io.restassured.response.ValidatableResponse;

import static io.restassured.RestAssured.given;

public class SuperHeroService {

    private final String token;

    public SuperHeroService(String token) {
        this.token = token;
    }

    public ValidatableResponse getHeroById(String id) {
        return given()
                .when()
                .get(token + "/" + id)
                .then();
    }

}
