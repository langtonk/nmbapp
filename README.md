# nmbapp
# springbootmongodb

nmb app



## Prerequisites 
- Java
- [Spring Boot](https://spring.io/projects/spring-boot)
- [Maven](https://maven.apache.org/guides/index.html)
- [Mongo DB](https://docs.mongodb.com/guides/)
- [Lombok](https://objectcomputing.com/resources/publications/sett/january-2010-reducing-boilerplate-code-with-project-lombok)


## Tools
- Eclipse or IntelliJ IDEA (or any preferred IDE) with embedded Gradle
- Maven (version >= 3.6.0)
- Postman (or any RESTful API testing tool)


<br/>

    
### API Endpoints

- #### Super Hero CRUD Operations
    > **POST Mapping** http://localhost:8080/customer/save  - save customer
    
    > **GET Mapping** http://localhost:8080/customer/all - Get all customers
       
  
    
      Request Body  
      ```
        {
            "FirstName": "Tony",
            "surname": "Man",
            "nationalId": "Business",
            "phone": 07314343250,
            "gender": "male",
            "homeOwner": "yes",
        }
 
