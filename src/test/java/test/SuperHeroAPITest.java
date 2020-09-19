package test;

import core.BaseTest;
import org.junit.Test;
import test.model.SuperHeroModel;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.equalTo;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;


/**
 * @author jussaragranja
 * Test Class - GET
 */

public class SuperHeroAPITest extends BaseTest {

    /**
     * Cenário 01: Consultar a ficha de um super herói (/id)
     * Dado que esteja conectado na SuperHeroAPI
     * Quando requisitar o histórico do super herói "Green Arrow"
     * Então deve ser retornado que a sua inteligência é igual a "81"
     * E deve ser retornado que o seu verdadeiro nome é ser "Oliver Queen"
     * E deve ser retornado que é afiliado do grupo "Justice League Elite"
     */

    @Test
    public void getHeroByIdSuccessTest(){

        SuperHeroModel superHeroModel = new SuperHeroModel();
        superHeroModel.setIntelligence("81");
        superHeroModel.setFullName("Oliver Queen");
        superHeroModel.setGroupAffiliation("Justice League Elite");

        given()
                .when()
                .get(token+"/298")
                .then()
                .assertThat()
                .body(
                        "powerstats.intelligence", equalTo(superHeroModel.getIntelligence()),
                        "biography.full-name", equalTo(superHeroModel.getFullName()),
                        "connections.group-affiliation", containsString(superHeroModel.getGroupAffiliation())
                )
                .body(matchesJsonSchemaInClasspath("schema/getHeroById.json"))
                .log().all();
    }

}
