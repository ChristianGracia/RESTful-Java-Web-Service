# RESTful-Java-Web-Service

This repo contains a spring boot RESTful web service written in Java with a MySQL db

## Installation

create a file in src/main/resources/ called application.properties

copy and paste the next 4 lines of code and replace the <> with your credentials

```
spring.datasource.username=<Your mysql username>
spring.datasource.password=<Your mysql password>
spring.datasource.url=jdbc:mysql://localhost:3306/<Your mysql db name>
spring.jpa.hibernate.ddl-auto=update
```

run with in the root folder

> **mvn** **spring**-**boot**:**run**
