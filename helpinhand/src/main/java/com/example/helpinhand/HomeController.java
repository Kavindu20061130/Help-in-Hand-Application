//This is the main page of the project back End it 
//is the homecontroller which controles the functions of main page
// This line defines the package name of the project
// It groups related controller classes together
package com.example.helpinhand;

// This line imports the Controller annotation from Spring
// It allows this class to handle web page requests
import org.springframework.stereotype.Controller;

// This line imports the GetMapping annotation
// It is used to map HTTP GET requests to methods
import org.springframework.web.bind.annotation.GetMapping;

// This annotation tells Spring that this class is a web controller
// It is integrated with the Spring MVC framework
@Controller
public class HomeController {

    // This annotation maps the root URL ("/") to this method
    // When the user opens the home page, this method is called
    @GetMapping("/")
    public String home() {

        // This line returns the name of the HTML file
        // Spring loads index.html from the templates folder
        return "index";
    }

    // This annotation maps the "/about" URL to this method
    // It is used to display the about page
    @GetMapping("/about")
    public String about() {

        // This line loads the about.html file
        // It shows information about the system or organization
        return "about";
    }

    // This annotation maps the "/online" URL to this method
    // It is used for online donation navigation
    @GetMapping("/online")
    public String onlineDonation() {

        // This line loads the online.html file
        // It displays the online donation page
        return "online";
    }

    // This annotation maps the "/charity" URL to this method
    // It shows instructions related to charity
    @GetMapping("/charity")
    public String charityInstructions() {

        // This line loads the charity.html file
        // It displays charity guidelines
        return "charity";
    }

    // This annotation maps the "/charity/register" URL
    // It opens the charity registration form
    @GetMapping("/charity/register")
    public String charityRegister() {

        // This line loads the charity-register.html file
        // It displays the charity registration page
        return "charity-register";
    }

    // This annotation maps the "/materials" URL
    // It is used for material donation requests
    @GetMapping("/materials")
    public String materials() {

        // This line loads the materials.html file
        // It displays the material donation page
        return "materials";
    }
}
