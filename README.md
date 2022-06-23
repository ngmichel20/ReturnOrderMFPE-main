# Return Order Management System - MFPE Project - Nguyen Khanh-Michel - Cognizant

# Project Overview
A leading Supply chain Management Organization wants to automate the return orders, 
by classifying them to repair or replacement. 
Repair is for all main or integral part of their product. Replacement is for accessories.

# Technologies and versions used
- JDK 1.8
- Spring Boot
- Eureka
- H2 Database
- Feign


##Project structure
 - "ReturnOrderMFPE-main" : the main repository which contains all the microservices.
 - "authorization-microservice" : the security microservice.
 - "component-processing-microservice" : the component processing microservice which allows to interact with packaging and delivery microservice to get the consolidated cost for the processing.
 - "eureka" : the eureka server
 - "pacakaginganddelivery-microservice" : The microservice should contain a list of packaging and delivery cost detail
 - "return-order-portal" : the main microservice, the portal, which also contains all the html, css files.


## How to launch the application
To launch the application, run all the main method from all the microservices except for the "authorization-microservice" because the security part has not been linked to all the microservices.
To have a view of the frontend part, go to "http://locahost:8084" after launched all the main methods.
