package com.example.portfolio.repository;

import com.example.portfolio.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Data Access Object (DAO) interface for Project entity operations.
 * 
 * This interface extends Spring Data JPA's JpaRepository to provide
 * automatic CRUD operations for the Project entity without requiring
 * manual implementation. It handles both project and experience entries.
 * 
 * Available operations include:
 * - findAll() - Retrieve all projects/experiences
 * - save() - Create or update entries
 * - findById() - Find by primary key
 * - delete() - Remove entries
 * - count() - Count total entries
 * 
 * Spring Data JPA automatically generates the implementation at runtime
 * based on the interface definition and method naming conventions.
 * 
 * @author Sual Harun
 * @version 1.0
 * @since 2025
 */
public interface ProjectRepository extends JpaRepository<Project, Long> {
    
    // Additional custom query methods can be added here if needed
    // Examples:
    // List<Project> findByType(String type);
    // List<Project> findByTechnologiesContaining(String technology);
    
}