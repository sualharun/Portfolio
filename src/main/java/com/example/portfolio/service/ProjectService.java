package com.example.portfolio.service;

import com.example.portfolio.model.Project;
import com.example.portfolio.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import jakarta.annotation.PostConstruct;

import java.util.List;

/**
 * Service class for managing Project and Experience data in the portfolio application.
 * 
 * This service handles:
 * - CRUD operations for projects and work experiences
 * - Database initialization with sample portfolio data
 * - Business logic for portfolio content management
 * 
 * The service automatically populates the database with sample data on application startup
 * if no existing data is found, making it easy to demonstrate the portfolio functionality.
 * 
 * @author Sual Harun
 * @version 1.0
 * @since 2025
 */
@Service
public class ProjectService {

    /**
     * Repository for database operations on Project entities.
     * Automatically injected by Spring's dependency injection.
     */
    @Autowired
    private ProjectRepository projectRepository;

    /**
     * Retrieves all projects and experiences from the database.
     * 
     * @return List of all Project entities (both projects and experiences)
     */
    public List<Project> getAllProjects() {
        return projectRepository.findAll();
    }

    /**
     * Saves a new project or experience to the database.
     * 
     * @param project The Project entity to save
     * @return The saved Project entity with generated ID
     */
    public Project saveProject(Project project) {
        return projectRepository.save(project);
    }

    /**
     * Initializes the database with sample portfolio data on application startup.
     * 
     * This method is automatically called after the bean is constructed (@PostConstruct).
     * It populates the database with:
     * - Work experience entries (internships, positions)
     * - Personal and academic projects
     * - Technology stacks and descriptions
     * 
     * Only runs if the database is empty to avoid duplicate entries.
     * 
     * To customize: Modify the project entries below to reflect your own
     * experience and projects before deploying.
     */
    @PostConstruct
    public void initializeProjects() {
        // Only add projects if none exist (prevents duplicates on restart)
        if (projectRepository.count() == 0) {
            // ==================== WORK EXPERIENCE ====================
            
            // Software Engineering Internship at Vantashala
            Project vantashala = new Project();
            vantashala.setName("Vantashala");
            vantashala.setRole("Software Engineer Intern");
            vantashala.setDate("Summer 2024");
            vantashala.setDescription("Backend Development: Built and integrated backend services powering customer-facing dashboards (e.g., \"Recent Orders\" module), enabling real-time order tracking and improving client visibility into activity. Code Optimization: Refactored and cleaned legacy code across multiple repositories, reducing technical debt and improving software maintainability for the team. Deployment & Delivery: Supported production rollouts by pushing updates to live environments, ensuring smooth delivery of new features to customers with minimal downtime.");
            vantashala.setTechnologies("Java, Spring Boot, Git, Backend Services, Production Deployment");
            vantashala.setUrl("");
            vantashala.setImageUrl("/images/vantashala.png");
            vantashala.setType("experience");
            projectRepository.save(vantashala);

            // ==================== PERSONAL PROJECTS ====================
            
            // This Portfolio Website
            Project portfolio = new Project();
            portfolio.setName("Personal Portfolio Website");
            portfolio.setRole("Full-Stack Developer");
            portfolio.setDate("January 2025");
            portfolio.setDescription("Designed and developed this portfolio website to showcase my projects, skills, and experience. Built the website using modern web development technologies, including Spring Boot for the backend and HTML, CSS, and JavaScript for the frontend. Focused on creating a responsive and visually appealing design while ensuring smooth navigation and functionality.");
            portfolio.setTechnologies("Spring Boot, Thymeleaf, HTML, CSS, and JavaScript");
            portfolio.setUrl("");
            portfolio.setImageUrl("/images/portfolio.png");
            portfolio.setType("project");
            projectRepository.save(portfolio);

            Project focusFlow = new Project();
            focusFlow.setName("FocusFlow - Pomodoro Study Timer");
            focusFlow.setRole("Full-Stack Developer");
            focusFlow.setDate("July 2025");
            focusFlow.setDescription("Built full-stack focus session application with Google OAuth2 authentication, real-time WebSocket synchronization, YouTube music integration, and comprehensive analytics dashboard tracking user study habits and session completion rates");
            focusFlow.setTechnologies("React, Spring Boot, OAuth2, WebSocket");
            focusFlow.setUrl("");
            focusFlow.setImageUrl("/images/focusflow.png");
            focusFlow.setType("project");
            projectRepository.save(focusFlow);

            Project movieRecommender = new Project();
            movieRecommender.setName("Movie Recommender");
            movieRecommender.setRole("Full-Stack Developer");
            movieRecommender.setDate("May 2025");
            movieRecommender.setDescription("Developed a movie recommendation website with a Spring Boot backend integrated with a Python machine learning model that applies TF-IDF vectorization and cosine similarity on movie descriptions to suggest relevant films, exposing results through REST APIs that include hyperlinks to streaming platforms.");
            movieRecommender.setTechnologies("Java, Spring Boot, Python, Data Science");
            movieRecommender.setUrl("");
            movieRecommender.setImageUrl("/images/movie-recommender.png");
            movieRecommender.setType("project");
            projectRepository.save(movieRecommender);
        }
    }
}