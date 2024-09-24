# RewardsCalculator
Reward Points Calculator leveraging Spring Boot, Spring JPA, MVC and Java etc

Things Accomplished & Enabled

* Spring Boot with Spring MVC, SPring JPA libraries
* Swagger for API Management
* Caching for better API performance
* In Memory H2 Database
* Lombok module for Simplified Code on Accessors & Mutatators
* MapStruct library for Bean Mappings between DAO & DTO
* Jackson data library for converting to JSON data & as well Serializer/Deserialize


Things that can be implemented

* Pagination on bulk requests
* Enable SonarQube for Code quality
* CI/CD on Teamcity
* JUnit test cases
* Integration tests  


Things that can be further improved

* Exception Handling
* QueryDSL for varied search, sort & paginated requests 
* Benchmarking, Throttling, etc...

## Features
- Customer management
- Transaction history management
- Reward points calculation based on transactions
- Secure APIs with authentication

## Project Structure
```plaintext
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── example
|   |   |                 └── MyProject
│   │   │                           ├── controllers
│   │   │                           ├── services
│   │   │                           ├── repositories
│   │   │                           └── models
│   │   └── resources
│   └── test
│       └── java
