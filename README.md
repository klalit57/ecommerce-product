# ecommerce-product
It is an project having a Product repository connecting with MongoDB database on cloud, A Dockerfile is also included which helps needs for Dockerizing our application.

To import and run this project

Step - 1
Download this repository.
Export the project from downloaded zip file.

Step - 2
Place the extracted project in eclipse workspace folder.

Step -3
Now go to File and select import in eclipse IDE
A search window will open type Existing Maven Project and select it, it will import our project.

Step - 4
for Configuring database, i have configured it with cloud.mongo db database.
You could set up your database if you want. Your database on Mongodb cloud will generate a connection link, Place it in application.properties.
Make Sure you place your username and password and database name in place of <username> and <password> and <databaseName>

#connecting with mongodb database which is stored on cloud
spring.data.mongodb.uri=mongodb+srv://<username>:<password>@productecom.cextko2.mongodb.net/?retryWrites=true&w=majority
spring.data.mongodb.database=<databaseName>
  
Step - 5 
Update your Maven project to make sure all the dependencies are downloaded.
Now Run your Project as Maven intall, it will create a jar file in target folder.

Step - 6
To make a Docker image
Make sure you have Docker Desktop installed in your Computer and Open in
Open Windows Powershell

  Run following commands
  a. docker --version  
  b. cd C:\Users\Admin\eclipse-workspace\ecommerce  
  c. docker build -t ecommerce-product-assignment.jar .
  
Step - 7
 Documentaion Link
  http://localhost:8080/swagger-ui/index.html
  http://localhost:8080/v3/api-docs
  
    
  


