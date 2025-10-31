package test;

import core.BaseTest;
import org.junit.jupiter.api.Test;
import service.SuperHeroService;
import test.model.SuperHeroModel;
import org.junit.jupiter.api.DisplayName;


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

    private final SuperHeroService service = new SuperHeroService(TOKEN);

    @Test
    @DisplayName("Consultar ficha de Green Arrow por ID")
    void getHeroByIdSuccessTest(){

        SuperHeroModel greenArrow = SuperHeroModel.builder()
                .intelligence("81")
                .fullName("Oliver Queen")
                .groupAffiliation("Justice League Elite")
                .build();

        service.getHeroById("298")
                .assertThat()
                .body(
                        "powerstats.intelligence", equalTo(greenArrow.getIntelligence()),
                        "biography.full-name", equalTo(greenArrow.getFullName()),
                        "connections.group-affiliation", containsString(greenArrow.getGroupAffiliation())
                )
                .body(matchesJsonSchemaInClasspath("schema/getHeroById.json"))
                .log().all();
    }

}
