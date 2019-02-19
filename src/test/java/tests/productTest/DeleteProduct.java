package tests.productTest;

import api.ProductApi;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.*;
import util.PropertiesReader;

import static org.hamcrest.Matchers.equalTo;

public class DeleteProduct extends ProductBaseTest{

    int validProductId;
    Response getResponse;

    @BeforeClass
    public void setUp() {
        RestAssured.baseURI = baseURI;
        response = ProductApi.createNewProduct();
        response.then().statusCode(201);
        validProductId=response.then().extract().path("id");
    }

    @Test
    public void deleteValidSpecificProduct(){
        response = ProductApi.deleteSpecificProduct(""+ validProductId);
        response.then().statusCode(200);
        response.then().assertThat().body("id", equalTo(validProductId));
    }

    @AfterClass
    public void tearDown(){
        getResponse =ProductApi.getSpecificProduct(""+validProductId);
        getResponse.then().statusCode(404);
    }
}
