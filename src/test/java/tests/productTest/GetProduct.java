package tests.productTest;

import api.ProductApi;
import io.restassured.RestAssured;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import util.PropertiesReader;

import static org.hamcrest.Matchers.*;

public class GetProduct extends ProductBaseTest {


    int validProductId;
    String inValidProductId="3232251959";

    @BeforeClass
    public void setUp() {
        RestAssured.baseURI = baseURI;
        response = ProductApi.createNewProduct();
        response.then()
                .statusCode(201);
        response.then().assertThat().body("type", equalTo(PropertiesReader.get("type")));
        validProductId=response.then().extract().path("id");
    }

    @Test
    public void getValidSpecificProduct(){
        response = ProductApi.getSpecificProduct(""+ validProductId);
        response.then()
                .statusCode(200);
        response.then().assertThat().body("id", equalTo(validProductId));
    }

    @Test
    public void getInvalidSpecificProduct(){
        response = ProductApi.getSpecificProduct(inValidProductId);
        response.then()
                .statusCode(404);
    }
}

