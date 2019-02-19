package tests.productTest;

import api.ProductApi;
import io.restassured.RestAssured;
import org.testng.annotations.*;
import util.PropertiesReader;
import static org.hamcrest.Matchers.equalTo;

public class UpdateProduct extends ProductBaseTest{

    int validProductId;

    @BeforeClass
    public void setUp() {
        RestAssured.baseURI = baseURI;
        response = ProductApi.createNewProduct();
        response.then().statusCode(201);
        validProductId=response.then().extract().path("id");
    }

    @Test
    public void deleteValidSpecificProduct(){
        response = ProductApi.updateProduct(""+ validProductId);
        response.then().statusCode(200);
        response.then().assertThat().body("id", equalTo(validProductId));
        response.then().assertThat().body("name", equalTo(PropertiesReader.get("name1")));
    }

}
