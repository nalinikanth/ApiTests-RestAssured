#API automation for Products API

This document explains required software, test structure and how to run tests.

## Prerequisites
Software that is required to make this repo work :) 
- Java 1.8
- Maven 

## Test structure

__ProductAPI__ - Has extracted calls for Products API
__Product__ - To form a body for Products API from product.properties file
__PropertiesReader__ - Utility to read properties from various property files
__Resources__ - Contains property files
__env.properties__ - Environment details for the environment on which the tests need to be run
__product.properties__ - product details to create product body
__test.productTests__ - Contains tests check [Testcases](TESTCASES.md) for details

## Running Test

From terminal use `mvn clean test` to run all the tests
use `mvn -Dtest=testfilename test` to run a specific file

Find reports under target -> surefire-reports
