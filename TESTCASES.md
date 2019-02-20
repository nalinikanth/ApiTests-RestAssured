# Test cases for Products API

- [createNewProduct](../../src/test/java/tests/productTests/AddProductTest.java) Create a new product and verify the product is created successfully
- [deleteValidSpecificProduct](../../src/test/java/tests/productTests/DeleteProductTest.java)  Delete an existing product, should get deleted successfully 
- [deleteInValidSpecificProduct](../../src/test/java/tests/productTests/DeleteProductTest.java)  Delete a non existing product, should throw 404 not found 
- [getValidSpecificProduct](../../src/test/java/tests/productTests/GetProductTest.java)  Get an existing product, should get details of existing product successfully 
- [getInValidSpecificProduct](../../src/test/java/tests/productTests/GetProductTest.java)  Get a non existing product, should throw 404 not found 
- [getAllProducts](../../src/test/java/tests/productTests/GetProductsTest.java) Get all existing product, should return all existing products
- [updateValidSpecificProduct](../../src/test/java/tests/productTests/UpdateProductTest.java)  Update an existing product, product should get updated successfully 
- [updateInValidProduct](../../src/test/java/tests/productTests/UpdateProductTest.java)  update a non existing product, should throw 404 not found 
- [updateWithInValidProductBody](../../src/test/java/tests/productTests/UpdateProductTest.java)  update an existing product with invalid body, should throw 400 Bad request