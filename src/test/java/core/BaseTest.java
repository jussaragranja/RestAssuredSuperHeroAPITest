package core;


import org.junit.jupiter.api.BeforeAll;

import static io.restassured.RestAssured.baseURI;

/**
 * @author jussaragranja
 * Base Class for Test Execution
 */

public class BaseTest {

    public static String TOKEN = "3617586838252492";
    protected static final String BASE_URL = "https://superheroapi.com/api/";

    @BeforeAll
    public static void setup() {
        baseURI = BASE_URL;
    }

}
