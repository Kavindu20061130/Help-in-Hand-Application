// This line defines the package name of the project
// It groups all donation-related controller classes
package com.example.helpinhand;

// This line imports the Controller annotation
// It allows this class to handle web requests
import org.springframework.stereotype.Controller;

// This line imports the Model class
// It is used to pass data from the controller to the HTML page
import org.springframework.ui.Model;

// This line imports the GetMapping annotation
// It is used to handle HTTP GET requests
import org.springframework.web.bind.annotation.GetMapping;

// This line imports the RequestParam annotation
// It is used to read values from the URL
import org.springframework.web.bind.annotation.RequestParam;

// This annotation tells Spring that this class is a controller
// It integrates the class with Spring MVC
@Controller
public class DonationController {

    // This annotation maps the "/payment" URL to this method
    // It opens the payment page when accessed
    @GetMapping("/payment")
    public String showPaymentPage(

            // This annotation reads the donation amount from the URL
            // required = false allows the page to load without the amount
            @RequestParam(name = "amount", required = false) String amount,

            // This object is used to send data to the view
            Model model) {

        // This condition checks whether an amount was provided
        if (amount != null) {

            // This line adds the donation amount to the model
            // It makes the value available in payment.html
            model.addAttribute("donationAmount", amount);
        }

        // This line returns the payment.html page
        // Spring loads it from the templates folder
        return "payment";
    }
}
