package tests.productTest;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.BeforeSuite;

public class ProductBaseTest {


    final String baseURI = "http://localhost:3030";
    Response response;



    @BeforeSuite
    public void setUp() {
        RestAssured.baseURI = baseURI;
    }

}
