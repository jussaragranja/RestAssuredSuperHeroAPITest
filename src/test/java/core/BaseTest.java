package core;

import org.junit.Before;

import static io.restassured.RestAssured.baseURI;

/**
 * @author jussaragranja
 * Base Class for Test Execution
 */

public class BaseTest {

    public static String token = "3617586838252492";

    @Before
    public void testURI() {
        baseURI = "https://superheroapi.com/api/";
    }

}
