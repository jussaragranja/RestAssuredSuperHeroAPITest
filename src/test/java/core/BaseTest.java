package core;


import org.junit.jupiter.api.BeforeAll;

import static io.restassured.RestAssured.baseURI;

/**
 * @author jussaragranja
 * Base Class for Test Execution
 */

public class BaseTest {

    public static String token = "3617586838252492";

    @BeforeAll
    public static void testURI() {
        baseURI = "https://superheroapi.com/api/";
    }

}
