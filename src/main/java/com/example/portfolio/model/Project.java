package com.example.portfolio.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Column;

/**
 * JPA Entity representing a Project or Work Experience entry in the portfolio.
 * 
 * This flexible model supports both personal projects and professional experience
 * entries, differentiated by the 'type' field. Used to populate the 
 * "Experience & Projects" page dynamically from the database.
 * 
 * Database Table: PROJECT (H2 in-memory database)
 * 
 * @author Sual Harun
 * @version 1.0
 * @since 2025
 */
@Entity
public class Project {

    /**
     * Primary key for the project/experience entry.
     * Auto-generated using identity strategy.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    /**
     * Display name of the project or company/position title for experiences.
     * Examples: "FocusFlow - Pomodoro Study Timer", "Software Developer Intern"
     */
    private String name;
    
    /**
     * Role or position held (primarily for experience entries).
     * Examples: "Full Stack Developer", "Software Engineering Intern"
     */
    private String role;
    
    /**
     * Date range or time period for the project/experience.
     * Examples: "Summer 2024", "Jan 2025 - Present", "Fall 2024"
     */
    private String date;
    
    /**
     * Detailed description of the project or work experience.
     * Extended length (1000 chars) to accommodate comprehensive descriptions.
     */
    @Column(length = 1000)
    private String description;
    
    /**
     * Comma-separated list of technologies, tools, and frameworks used.
     * Examples: "Java, Spring Boot, React, H2 Database"
     */
    private String technologies;
    
    /**
     * URL link to project repository, live demo, or company website.
     * Optional field for external links.
     */
    private String url;
    
    /**
     * Path to project screenshot or company logo image.
     * Stored in /static/images/ directory.
     */
    private String imageUrl;
    
    /**
     * Category type for filtering and organization.
     * Values: "project" for personal/academic projects, "experience" for work history
     */
    private String type;

    // ==================== Getters and Setters ====================
    
    /**
     * Gets the unique identifier for this project/experience entry.
     * @return the project ID
     */
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTechnologies() {
        return technologies;
    }

    public void setTechnologies(String technologies) {
        this.technologies = technologies;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}