# Java Calculator using Maven

A small web calculator with a Java Spring Boot backend and HTML/CSS/JavaScript frontend. Maven manages dependencies, compiles the code, runs tests, and packages the application as an executable JAR.

## Requirements
- JDK 17 or newer
- Maven 3.6.3 or newer

Check installations:
```bash
java -version
mvn -version
```

## Run the project
Open a terminal in the folder containing `pom.xml` and run:
```bash
mvn spring-boot:run
```
Open http://localhost:8080 in your browser.

## Maven commands for your practical demonstration
```bash
mvn validate
mvn dependency:tree
mvn test
mvn compile
mvn package
```
The executable JAR is created in `target/java-calculator-1.0.0.jar`.
Run the packaged application:
```bash
java -jar target/java-calculator-1.0.0.jar
```
Then visit http://localhost:8080.

## What Maven demonstrates
- **Project configuration:** `pom.xml` contains project coordinates, Java version, dependencies, and build plugin configuration.
- **Dependency management:** `spring-boot-starter-web` provides the web server and REST API; `spring-boot-starter-test` provides test tools and is test-scoped.
- **Compilation:** `mvn compile` compiles Java source files into `target/classes`.
- **Testing:** `mvn test` runs the JUnit tests.
- **Packaging:** `mvn package` builds an executable Spring Boot JAR in `target/`.

## GitHub: push this project
Create an empty GitHub repository, then run these commands from this project folder (replace the URL with your repository URL):
```bash
git init
git add .
git commit -m "Add Java Maven calculator application"
git branch -M main
git remote add origin https://github.com/YOUR-USERNAME/YOUR-REPOSITORY.git
git push -u origin main
```
If your current GitHub repository already contains the starter frontend, you can either use this as a separate clean project or copy the `src/main/resources/static/` files into your existing project under that same path. Avoid overwriting existing work before making a backup.

## Project structure
```text
java-calculator/
├── pom.xml
├── README.md
├── .gitignore
└── src/
    ├── main/
    │   ├── java/com/example/calculator/
    │   │   ├── CalculatorApplication.java
    │   │   ├── controller/CalculatorController.java
    │   │   └── service/CalculatorService.java
    │   └── resources/static/
    │       ├── index.html
    │       ├── style.css
    │       └── script.js
    └── test/java/com/example/calculator/service/CalculatorServiceTest.java
```
