#Test cases for Products API

- [createNewProduct](src/test/java/tests/productTest/AddProduct.java) Create a new product and verify the product is created successfully.
- [deleteValidSpecificProduct](src/test/java/tests/productTest/DeleteProduct.java)  Delete an existing product, should get deleted successfully 
- [deleteInValidSpecificProduct](src/test/java/tests/productTest/DeleteProduct.java)  Delete a non existing product, should throw 404 not found 
- [getValidSpecificProduct](src/test/java/tests/productTest/GetProduct.java)  Get an existing product, should get details of existing product successfully 
- [getInValidSpecificProduct](src/test/java/tests/productTest/GetProduct.java)  Get a non existing product, should throw 404 not found 
- [getAllProducts](src/test/java/tests/productTest/GetProducts.java) Get all existing product, should return all existing products
- [updateValidSpecificProduct](src/test/java/tests/productTest/UpdateProduct.java)  Update an existing product, product should get updated successfully 
- [updateInValidProduct](src/test/java/tests/productTest/UpdateProduct.java)  update a non existing product, should throw 404 not found 
- [updateWithInValidProductBody](src/test/java/tests/productTest/UpdateProduct.java)  update an existing product with invalid body, should throw 400 Bad request