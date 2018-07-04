
Basic Web app using Spring 5

Currently a spike through from Controller, Service through to Repository using JPA and SpringBoot 

Uses a local H2-Console for Data

For Running the app
```
mvn spring-boot:run
```

To view the data in the H2-Database, once the application is up and running (previous step). Browse to 

```
http://localhost:8080/h2-console
```

Change the JDBC URL to: jdbc:h2:mem:testdb and Connect. Once logged in, view data from any of the databases
 
`Author, Book, Author-Book, Publisher` 

To view the Authors list, ensure the application is fired up (first step) then head over to. The endpoints are all defined
in the controllers and these show the data that is pulled out of the H2 DB, wired up using Springboot and Hibernate (JPA) 
```
http://localhost:8080/authors
http://localhost:8080/books
http://localhost:8080/allBooks
```
