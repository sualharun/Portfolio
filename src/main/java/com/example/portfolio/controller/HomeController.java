package com.example.portfolio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Main web controller for handling static page requests in the portfolio application.
 * 
 * This controller manages the routing for all static content pages including:
 * - Home/landing page
 * - About me personal information
 * - Resume display and download
 * - Skills and certifications showcase
 * 
 * Each endpoint returns a Thymeleaf template and adds page-specific attributes
 * to the model for dynamic content rendering.
 * 
 * @author Sual Harun
 * @version 1.0
 * @since 2025
 */
@Controller
public class HomeController {

    /**
     * Handles requests to the home/landing page.
     * 
     * @param model Spring MVC model for passing data to the view
     * @return Template name "index" (renders index.html)
     */
    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("title", "Welcome to My Portfolio");
        return "index";
    }

    /**
     * Handles requests to the about page showing personal information.
     * 
     * @param model Spring MVC model for passing data to the view
     * @return Template name "about" (renders about.html)
     */
    @GetMapping("/about")
    public String about(Model model) {
        model.addAttribute("title", "About Me");
        return "about";
    }

    /**
     * Handles requests to the resume page with PDF viewer and download functionality.
     * 
     * @param model Spring MVC model for passing data to the view
     * @return Template name "resume" (renders resume.html)
     */
    @GetMapping("/resume")
    public String resume(Model model) {
        model.addAttribute("title", "Resume");
        return "resume";
    }

    /**
     * Handles requests to the skills and certifications showcase page.
     * 
     * @param model Spring MVC model for passing data to the view
     * @return Template name "skills" (renders skills.html)
     */
    @GetMapping("/skills")
    public String skills(Model model) {
        model.addAttribute("title", "Skills & Certifications");
        return "skills";
    }
}