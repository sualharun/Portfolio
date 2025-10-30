# Contributing to Portfolio Website

Thank you for your interest in contributing to this portfolio project! This document provides guidelines for contributing to the codebase.

## 📋 Table of Contents

- [Getting Started](#getting-started)
- [Development Setup](#development-setup)
- [Code Style Guidelines](#code-style-guidelines)
- [Submitting Changes](#submitting-changes)
- [Bug Reports](#bug-reports)
- [Feature Requests](#feature-requests)

## 🚀 Getting Started

### Prerequisites

- Java 17 or higher
- Git
- A text editor or IDE (VS Code, IntelliJ IDEA recommended)

### Development Setup

1. **Fork the repository**
   ```bash
   git clone https://github.com/yourusername/portfolio.git
   cd portfolio
   ```

2. **Create a feature branch**
   ```bash
   git checkout -b feature/your-feature-name
   ```

3. **Run the application**
   ```bash
   ./mvnw spring-boot:run -DskipTests
   ```

4. **Test your changes**
   ```bash
   ./mvnw test
   ```

## 💻 Code Style Guidelines

### Java Code
- Follow standard Java naming conventions
- Use meaningful variable and method names
- Add JavaDoc comments for public methods and classes
- Keep methods focused and single-purpose
- Use Spring Boot best practices

### Frontend Code
- Use semantic HTML5 elements
- Follow CSS BEM methodology for class naming
- Ensure responsive design principles
- Test on multiple screen sizes

### File Structure
```
src/
├── main/
│   ├── java/com/example/portfolio/
│   │   ├── controller/     # Web controllers
│   │   ├── model/         # Data models
│   │   ├── repository/    # Data access
│   │   └── service/       # Business logic
│   └── resources/
│       ├── static/        # CSS, images, PDFs
│       └── templates/     # Thymeleaf templates
```

## 📝 Submitting Changes

### Commit Messages
Use clear, descriptive commit messages:
```
feat: Add new project card component
fix: Resolve mobile navigation issue  
docs: Update README with deployment instructions
style: Improve button hover animations
```

### Pull Request Process

1. **Update documentation** if needed
2. **Add tests** for new functionality
3. **Ensure all tests pass**
   ```bash
   ./mvnw test
   ```
4. **Update the README** if you changed functionality
5. **Submit pull request** with:
   - Clear title and description
   - Reference any related issues
   - Include screenshots for UI changes

### Pull Request Template
```markdown
## Description
Brief description of changes made.

## Type of Change
- [ ] Bug fix
- [ ] New feature
- [ ] Breaking change
- [ ] Documentation update

## Testing
- [ ] Tests pass locally
- [ ] Manual testing completed
- [ ] Cross-browser testing (if applicable)

## Screenshots (if applicable)
Add screenshots here for UI changes.
```

## 🐛 Bug Reports

When submitting bug reports, please include:

1. **Browser and version** (if frontend issue)
2. **Java version** (if backend issue)
3. **Steps to reproduce**
4. **Expected behavior**
5. **Actual behavior**
6. **Screenshots or error messages**

### Bug Report Template
```markdown
**Describe the bug**
A clear description of what the bug is.

**To Reproduce**
Steps to reproduce the behavior:
1. Go to '...'
2. Click on '....'
3. See error

**Expected behavior**
What you expected to happen.

**Screenshots**
Add screenshots if applicable.

**Environment:**
- OS: [e.g., macOS, Windows]
- Browser: [e.g., Chrome, Firefox]
- Java Version: [e.g., 17, 21]
```

## 💡 Feature Requests

For feature requests, please:

1. **Check existing issues** to avoid duplicates
2. **Describe the feature** clearly
3. **Explain the use case** and benefits
4. **Consider implementation** complexity

### Feature Request Template
```markdown
**Is your feature request related to a problem?**
A clear description of what the problem is.

**Describe the solution you'd like**
A clear description of what you want to happen.

**Describe alternatives you've considered**
Any alternative solutions or features you've considered.

**Additional context**
Add any other context or screenshots about the feature request.
```

## 🎯 Areas for Contribution

### High Priority
- **Responsive design improvements**
- **Accessibility enhancements**
- **Performance optimizations**
- **Cross-browser compatibility**

### Medium Priority
- **Additional project templates**
- **Theme customization options**
- **SEO improvements**
- **Loading animations**

### Low Priority
- **Additional color schemes**
- **Social media integration**
- **Analytics integration**
- **Deployment automation**

## 🔧 Development Tips

### Local Development
```bash
# Run with hot reload for frontend changes
./mvnw spring-boot:run -Dspring-boot.run.jvmArguments="-Dspring.devtools.restart.enabled=true"

# Run tests in watch mode
./mvnw test -Dtest.watch=true

# Access H2 Console for database inspection
http://localhost:8080/h2-console
```

### Common Issues
- **Port conflicts**: Change `server.port` in `application.properties`
- **Java version**: Ensure Java 17+ is installed and active
- **Database issues**: H2 is in-memory, data resets on restart

## 📚 Resources

### Documentation
- [Spring Boot Documentation](https://spring.io/projects/spring-boot)
- [Thymeleaf Documentation](https://www.thymeleaf.org/documentation.html)
- [H2 Database Documentation](https://www.h2database.com/html/main.html)

### Tools
- [Spring Boot DevTools](https://docs.spring.io/spring-boot/docs/current/reference/html/using.html#using.devtools)
- [Maven Documentation](https://maven.apache.org/guides/)

## 🤝 Code of Conduct

### Our Pledge
We are committed to making participation in this project a harassment-free experience for everyone.

### Expected Behavior
- Use welcoming and inclusive language
- Be respectful of differing viewpoints
- Accept constructive criticism gracefully
- Focus on what is best for the community

### Unacceptable Behavior
- Harassment or discrimination
- Trolling or insulting comments
- Public or private harassment
- Publishing private information without permission

## 📞 Contact

If you have questions about contributing, feel free to:
- Open an issue for discussion
- Contact the maintainer directly
- Join community discussions

---

Thank you for contributing to make this portfolio project better! 🎉