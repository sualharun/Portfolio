# Personal Portfolio Website

A modern, responsive personal portfolio website built with Spring Boot, showcasing projects, skills, certifications, and experience in a professional format.

## 🌟 Features

- **Modern Dark Theme**: Professional card-based UI with blue accent colors
- **Dynamic Projects**: Database-driven project and experience showcase
- **Skills & Certifications**: Dedicated section for technical skills and AWS certifications
- **Resume Integration**: Embedded PDF viewer with download functionality
- **Responsive Design**: Mobile-friendly layout that works on all devices
- **Professional Navigation**: Clean 5-page structure for easy browsing

## 🛠️ Technology Stack

- **Backend**: Spring Boot 3.4.4, Java 17+
- **Database**: H2 In-Memory Database with JPA/Hibernate
- **Frontend**: Thymeleaf Templates, HTML5, CSS3
- **Build Tool**: Maven with Maven Wrapper
- **Styling**: Custom CSS with modern gradients and animations

## 📋 Prerequisites

Before running this application, ensure you have:

- **Java 17 or higher** installed
- **Git** for cloning the repository
- A modern web browser for viewing the portfolio

### Verify Java Installation
```bash
java --version
```
*Should show Java 17 or higher*

## 🚀 Quick Start

### 1. Clone the Repository
```bash
git clone https://github.com/yourusername/portfolio.git
cd portfolio
```

### 2. Run the Application
```bash
# Using Maven Wrapper (Recommended)
./mvnw spring-boot:run -DskipTests

# Alternative: If you have Maven installed globally
mvn spring-boot:run -DskipTests
```

### 3. Access the Portfolio
Open your browser and navigate to:
```
http://localhost:8080
```

## 📁 Project Structure

```
portfolio/
├── src/
│   ├── main/
│   │   ├── java/com/example/portfolio/
│   │   │   ├── PortfolioApplication.java     # Main Spring Boot application
│   │   │   ├── controller/                   # Web controllers
│   │   │   ├── model/                        # Data models
│   │   │   ├── repository/                   # Data access layer
│   │   │   └── service/                      # Business logic
│   │   └── resources/
│   │       ├── static/                       # CSS, images, PDFs
│   │       ├── templates/                    # Thymeleaf HTML templates
│   │       └── application.properties        # App configuration
│   └── test/                                 # Unit tests
├── target/                                   # Build output (auto-generated)
├── mvnw & mvnw.cmd                          # Maven wrapper scripts
├── pom.xml                                   # Maven configuration
└── README.md                                # This file
```

## 🎨 Pages Overview

### 1. **Home** (`/`)
- Welcome section with professional introduction
- Clean landing page with navigation to other sections

### 2. **About Me** (`/about`)
- Personal background and interests
- Professional journey and goals
- Hobbies and personality showcase

### 3. **Skills & Certifications** (`/skills`)
- Technical skills organized by category
- AWS Cloud Practitioner certification with download link
- Educational background
- Professional philosophy and approach

### 4. **Experience & Projects** (`/projects`)
- Professional experience entries
- Personal and academic projects
- Technology stack for each project
- Live demos and GitHub links where applicable

### 5. **Resume** (`/resume`)
- Embedded PDF viewer for resume preview
- Download functionality for offline viewing
- Full-size viewing option

## 💾 Database Information

The application uses an **H2 in-memory database** that automatically initializes with sample data on startup:

- **Projects**: FocusFlow Pomodoro Timer, Movie Recommender System
- **Experience**: Software Development internships and roles
- **Data Persistence**: In-memory (resets on restart)

### Accessing H2 Console (Development)
```
URL: http://localhost:8080/h2-console
JDBC URL: jdbc:h2:mem:testdb
Username: sa
Password: (leave blank)
```

## 🔧 Configuration

### Application Properties
Key configurations in `src/main/resources/application.properties`:
```properties
# Server configuration
server.port=8080

# H2 Database configuration
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.username=sa
spring.datasource.password=
spring.h2.console.enabled=true

# JPA configuration
spring.jpa.hibernate.ddl-auto=create-drop
spring.jpa.show-sql=false
```

## 📱 Customization Guide

### Adding New Projects
1. Edit `ProjectService.java` in the `initializeProjects()` method
2. Create new `Project` objects with your information
3. Restart the application to see changes

### Updating Resume
1. Replace `src/main/resources/static/Sual-Harun-Resume.pdf` with your resume
2. Ensure the filename matches or update the template references
3. Restart the application

### Modifying Styles
- **Global styles**: `src/main/resources/static/css/styles.css`
- **Page-specific**: Individual CSS files for each page
- **Color scheme**: Modify CSS variables for consistent theming

## 🚀 Deployment Options

### Local Development
```bash
./mvnw spring-boot:run -DskipTests
```

### Production JAR
```bash
./mvnw clean package -DskipTests
java -jar target/portfolio-0.0.1-SNAPSHOT.jar
```

### Docker (Optional)
```dockerfile
FROM openjdk:17-jdk-slim
COPY target/portfolio-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/app.jar"]
```

## 🛠️ Development

### Running Tests
```bash
./mvnw test
```

### Building the Project
```bash
./mvnw clean compile
```

### Package for Production
```bash
./mvnw clean package -DskipTests
```

## 📋 Troubleshooting

### Common Issues

**Java Version Compatibility**
```bash
# If you get compilation errors, ensure Java 17+
java --version
```

**Port Already in Use**
```bash
# Kill any existing Spring Boot processes
pkill -f "spring-boot:run"
# Or change port in application.properties
server.port=8081
```

**Maven Wrapper Issues**
```bash
# Make Maven wrapper executable (Linux/Mac)
chmod +x mvnw
```

## 🤝 Contributing

This is a personal portfolio project, but feedback and suggestions are welcome:

1. Fork the repository
2. Create a feature branch
3. Make your changes
4. Submit a pull request

## 📄 License

This project is open source and available under the [MIT License](LICENSE).

## 📞 Contact

- **Email**: [sualharun.wl@example.com]

---

**Built with ❤️ by Sual Harun**

*This portfolio demonstrates modern web development practices using Spring Boot and showcases technical skills for potential employers.*
