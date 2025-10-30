package com.example.portfolio.controller;

import com.example.portfolio.model.Project;
import com.example.portfolio.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * Web controller for handling dynamic project and experience display requests.
 * 
 * This controller manages the "Experience & Projects" page by:
 * - Fetching all projects and experiences from the database
 * - Separating entries by type (project vs experience)
 * - Providing filtered data to the Thymeleaf template for rendering
 * 
 * The page displays both work experience and personal projects in separate
 * sections with consistent card-based styling and responsive design.
 * 
 * @author Sual Harun
 * @version 1.0
 * @since 2025
 */
@Controller
public class ProjectController {

    /**
     * Service for accessing project and experience data from the database.
     * Automatically injected by Spring's dependency injection.
     */
    @Autowired
    private ProjectService projectService;

    /**
     * Handles requests to the projects and experience page.
     * 
     * This method:
     * 1. Retrieves all projects/experiences from the database
     * 2. Filters entries by type: "project" vs "experience"
     * 3. Passes separated lists to the template for organized display
     * 4. Sets page title for browser tab and navigation
     * 
     * @param model Spring MVC model for passing data to the view
     * @return Template name "projects" (renders projects.html)
     */
    @GetMapping("/projects")
    public String projects(Model model) {
        // Fetch all entries from database
        List<Project> allProjects = projectService.getAllProjects();
        
        // Filter personal/academic projects (type = "project")
        List<Project> projects = allProjects.stream()
            .filter(p -> "project".equals(p.getType()))
            .toList();
        
        // Filter work experience entries (type = "experience")
        List<Project> experiences = allProjects.stream()
            .filter(p -> "experience".equals(p.getType()))
            .toList();
        
        // Add filtered data to model for template rendering
        model.addAttribute("projects", projects);
        model.addAttribute("experiences", experiences);
        model.addAttribute("title", "Projects and Experience");
        return "projects";
    }
}