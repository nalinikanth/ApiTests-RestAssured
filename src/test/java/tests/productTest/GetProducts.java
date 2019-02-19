package tests.productTest;

import api.ProductApi;
import org.testng.annotations.Test;

public class GetProducts extends ProductBaseTest{


    @Test
    public void getAllProducts(){
        response = ProductApi.getAllProducts();
        response.then()
                .statusCode(200);
    }

}

