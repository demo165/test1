# Demo1 - Spring Boot Application

A Spring Boot application deployed on **Render** using **Docker**.

## 🚀 Live Demo

**Live Application:**
https://test1-gkrk.onrender.com/

## 🛠️ Technologies Used

* Java
* Spring Boot
* Maven
* Docker
* Render
* Git & GitHub

## 📁 Project Structure

```text
demo1/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/example/demo1/
│   │   │       ├── Demo1Application.java
│   │   │       └── Ccontroller.java
│   │   └── resources/
│   │       └── application.properties
├── .mvn/
├── mvnw
├── mvnw.cmd
├── Dockerfile
├── pom.xml
└── README.md
```

## ⚙️ Configuration

The application uses the Render-provided `PORT` environment variable:

```properties
spring.application.name=demo1
server.port=${PORT:8080}
```

This allows the application to run on:

* `8080` locally by default
* The port provided by Render when deployed

## 🐳 Docker Deployment

The application is packaged and deployed using Docker.

Docker provides a consistent Java runtime environment for the application and allows it to be deployed on Render without relying on Render's native Java build environment.

## 💻 Run Locally

Clone the repository:

```bash
git clone https://github.com/demo165/test1.git
```

Navigate to the project:

```bash
cd test1/demo1
```

Run the application using Maven Wrapper:

### Windows

```powershell
.\mvnw.cmd spring-boot:run
```

### Linux / macOS

```bash
./mvnw spring-boot:run
```

The application will normally be available at:

```text
http://localhost:8080
```

## 📦 Build the Application

To create the packaged application:

```bash
.\mvnw.cmd clean package -DskipTests
```

The generated JAR file will be inside:

```text
target/
```

## ☁️ Deployment

The application is deployed on **Render** using Docker.

Every time changes are pushed to the connected GitHub repository, Render can automatically build and deploy the updated application.

## 🔗 Links

* **Live Application:** https://test1-gkrk.onrender.com/
* **GitHub Repository:** https://github.com/demo165/test1

## 👨‍💻 Project

**Demo1**
Spring Boot application deployed using Docker and Render.
