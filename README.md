# Let's Learn Test Driven Development
This repository is created for learning and exploring Test Driven Development in Java using JUnit

## Required Tools
* JDK 1.8 or higher
* Git 
* One of the following build tools:
    * Gradle 5.4.1 or higher  
    * Maven 3.6.0 or higher

## Build Instruction
First, clone this repository into your development environment by using the following command: \
`git clone https://github.com/Cefalo/lets-learn-tdd`

By default, this project can be built using **Gradle**. 

Run the following command from your terminal to build this project using Gradle:

`gradlew build`

If Gradle is not installed, then this command will install Gradle automatically and 
then build the project.

This project can also be built using **Maven**. For this first, you will need to 
rename the maven-settings.xml to pom.xml. After that, run the following command:

`mvn clean install`

## Problem Set and Solutions
In this repository, we tried to solve the following sample problems using TDD:

1. **Truncate As from only first 2 characters of a String** \
   Unit tests are defined at: [StringHelperTests.java](src/test/java/com/cefalo/tdd/StringHelperTests.java)  \
   Functionality implemented at the truncateFirst2As() method of [StringHelper.java](src/main/java/com/cefalo/tdd/StringHelper.java)

2. **Reverse the last 2 characters of a String** \
   Unit tests are defined at: [StringHelperTests.java](src/test/java/com/cefalo/tdd/StringHelperTests.java)  \
   Functionality implemented at the swapLastTwoChars() method of [StringHelper.java](src/main/java/com/cefalo/tdd/StringHelper.java)
   
3. **Password Validation Rules** \
   Unit tests are defined at: [PasswordValidatorTests.java](src/test/java/com/cefalo/tdd/PasswordValidatorTests.java)  \
   Functionality implemented at [PasswordValidator.java](src/main/java/com/cefalo/tdd/PasswordValidator.java)
   
4. **Simple Calculator for simple addition and division** \
   Unit tests are defined at: [SimpleCalculatorTests.java](src/test/java/com/cefalo/tdd/SimpleCalculatorTests.java)  \
   Functionality implemented at [SimpleCalculator.java](src/main/java/com/cefalo/tdd/SimpleCalculator.java)
   
5. **Customer with reward points and redemption** \
   This problem will be used in the workshop to learn step by step Test Driven Development. \
   All the steps of the TDD are already present in this [directory](step-by-step-tdd). \
   Unit tests will be defined at: [CustomerTests.java](src/test/java/com/cefalo/tdd/CustomerTests.java)  \
   Functionality will be implemented at [Customer.java](src/main/java/com/cefalo/tdd/Customer.java)    