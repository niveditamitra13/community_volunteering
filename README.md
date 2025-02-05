# Community Volunteering

## Overview
Community Volunteering is a platform designed to connect volunteers with organizations in need. It allows volunteers to find opportunities, sign up for tasks, and contribute to their communities effectively.

## Features
- Browse available volunteering opportunities
- Register as a volunteer
- Organizations can post tasks and manage volunteers
- User authentication and role-based access
- Event tracking and reporting

## Technologies Used
- **Backend:** Spring Boot
- **Frontend:** Thymeleaf, HTML, CSS, JavaScript
- **Database:** MySQL / H2
- **Other Tools:** ViewController, Lombok, JPA, Hibernate

## Installation
### Prerequisites
- Java 17+
- Maven
- MySQL or H2

### Steps to Set Up
1. Clone the repository:
   ```sh
   git clone https://github.com/niveditamitra13/community_volunteering.git
   ```
2. Navigate to the project directory:
   ```sh
   cd community_volunteering
   ```
3. Configure the database in `application.properties`:
   ```properties
   spring.application.name=demo
   server.port=8090
   spring.h2.console.enabled=true
   spring.datasource.url=jdbc:h2:mem:DATABASE_NAME
   spring.datasource.driverClassName=org.h2.Driver
   spring.mvc.hiddenmethod.filter.enabled=true
   ```
4. Build and run the project:
   ```sh
   mvn spring-boot:run
   ```
5. Access the application at:
   ```
   http://localhost:8090
   ```

## Contribution
1. Fork the repository.
2. Create a new branch:
   ```sh
   git checkout -b feature-name
   ```
3. Make changes and commit:
   ```sh
   git commit -m "Your message"
   ```
4. Push changes and create a pull request:
   ```sh
   git push origin feature-name
   ```

## License
This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Contact
For any queries, reach out via [GitHub Issues](https://github.com/niveditamitra13/community_volunteering/issues).

