# Code Companion

A developer's code snippet companion. This application allows you to store and retrieve code snippets for various programming languages.

## Features

*   View a list of code snippets.
*   Filter snippets by language.
*   Search for snippets by keyword.
*   Copy snippets to the clipboard.

## Project Structure

The project is a standard Spring Boot application with the following structure:

```
.
├── .github
│   └── workflows
│       ├── build.yml
│       ├── deploy.yml
│       └── test.yml
├── build.gradle
├── Dockerfile
├── gradle
│   └── wrapper
│       ├── gradle-wrapper.jar
│       └── gradle-wrapper.properties
├── gradlew
├── gradlew.bat
├── HELP.md
├── README.md
├── settings.gradle
└── src
    ├── main
    │   ├── java
    │   │   └── com
    │   │       └── example
    │   │           └── codecompanion
    │   │               ├── controller
    │   │               │   └── SnippetController.java
    │   │               ├── model
    │   │               │   └── Snippet.java
    │   │               ├── repository
    │   │               │   └── SnippetRepository.java
    │   │               ├── service
    │   │               │   └── SnippetService.java
    │   │               └── CodeCompanionApplication.java
    │   └── resources
    │       ├── application.properties
    │       ├── static
    │       │   └── css
    │       │       └── style.css
    │       └── templates
    │           └── index.html
    └── test
        └── java
            └── com
                └── example
                    └── codecompanion
                        └── CodeCompanionApplicationTests.java
```

## How to Use

### Running Locally

To run the application locally, you need to have Java 24 installed.

1.  Clone the repository:
    ```bash
    git clone https://github.com/your-username/code-companion.git
    ```
2.  Navigate to the project directory:
    ```bash
    cd code-companion
    ```
3.  Run the application using the Gradle wrapper:
    ```bash
    ./gradlew bootRun
    ```
The application will be available at http://localhost:8080.

### Building the Application

To build the application, run the following command:

```bash
./gradlew build
```

This will generate a JAR file in the `build/libs` directory.

### Docker

To build the Docker image, run the following command:

```bash
docker build -t code-companion .
```

To run the Docker container, run the following command:

```bash
docker run -p 8080:8080 code-companion
```

## GitHub Actions

This project includes three GitHub Actions workflows:

### 1. Run Tests (`test.yml`)

This workflow is triggered on every push to the `main` branch and on all pull requests. It runs the unit tests for the application.

### 2. Build Application (`build.yml`)

This workflow is triggered on every push to the `main` branch. It builds the Spring Boot application and creates a JAR file as an artifact.

### 3. Deploy to Docker Hub (`deploy.yml`)

This workflow is manually triggered. It builds and pushes the Docker image to a private Docker registry.

**Configuration:**

Before you can use the `deploy.yml` workflow, you need to configure the following secrets in your GitHub repository:

*   `DOCKERHUB_USERNAME`: Your Docker Hub username.
*   `DOCKERHUB_TOKEN`: Your Docker Hub access token.

You also need to replace `your-docker-username` in the `deploy.yml` file with your Docker Hub username.
