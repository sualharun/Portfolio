package com.example.portfolio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Main entry point for the Personal Portfolio Spring Boot application.
 * 
 * This application showcases a modern, responsive portfolio website featuring:
 * - Dynamic project and experience management
 * - Skills and certifications display
 * - Resume integration with PDF viewer
 * - Professional UI with dark theme
 * 
 * The application uses:
 * - Spring Boot 3.4.4 for the web framework
 * - H2 in-memory database for data storage
 * - Thymeleaf for server-side templating
 * - JPA/Hibernate for database operations
 * 
 * @author Sual Harun
 * @version 1.0
 * @since 2025
 */
@SpringBootApplication
public class PortfolioApplication {

	/**
	 * Main method to start the Spring Boot application.
	 * 
	 * The application will start an embedded Tomcat server on port 8080
	 * and initialize the H2 database with sample portfolio data.
	 * 
	 * @param args Command line arguments (not used in this application)
	 */
	public static void main(String[] args) {
		SpringApplication.run(PortfolioApplication.class, args);
	}

}
