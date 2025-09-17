## How to Run

Using IDE (Eclipse/IntelliJ):

# Right-click on testng.xml → Run as TestNG Suite.

## Using Maven:

Add TestNG dependency in pom.xml:

<dependency>
  <groupId>org.testng</groupId>
  <artifactId>testng</artifactId>
  <version>7.10.2</version>
  <scope>test</scope>
</dependency>


## Run:

mvn test


## Using Command Line:

java -cp "path/to/testng.jar;bin" org.testng.TestNG testng.xml
