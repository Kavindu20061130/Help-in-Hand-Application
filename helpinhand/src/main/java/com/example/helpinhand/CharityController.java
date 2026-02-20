// This line defines the package name of the project
// It helps organize related classes together
package com.example.helpinhand;

// This line imports the Controller annotation
// It allows the class to handle web requests
import org.springframework.stereotype.Controller;

// This line imports the GetMapping annotation
// It is used to handle HTTP GET requests
import org.springframework.web.bind.annotation.GetMapping;

// This line imports the PostMapping annotation
// It is used to handle HTTP POST requests
import org.springframework.web.bind.annotation.PostMapping;

// This annotation tells Spring that this class is a web controller
// It is integrated with Spring MVC
@Controller
public class CharityController {

    // This annotation maps HTTP POST requests to "/charity/register"
    // It is triggered when the charity registration form is submitted
    @PostMapping("/charity/register")
    public String registerCharity() {

        // This line redirects the user after successful registration
        // It sends the user to the registration success page
        return "redirect:/register-success";
    }

    // This annotation maps HTTP GET requests to "/register-success"
    // It loads the success confirmation page
    @GetMapping("/register-success")
    public String addedPage() {

        // This line returns the HTML page name
        // Spring loads added.html from the templates folder
        return "added";
    }
}
