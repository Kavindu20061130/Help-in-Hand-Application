// This line defines the package name of the project
// It is used to organize all related classes
package com.example.helpinhand;

// This line imports the Controller annotation
// It allows this class to handle web requests
import org.springframework.stereotype.Controller;

// This line imports the PostMapping annotation
// It is used to handle HTTP POST requests
import org.springframework.web.bind.annotation.PostMapping;

// This line imports the RequestParam annotation
// It is used to receive form input values
import org.springframework.web.bind.annotation.RequestParam;

// This annotation tells Spring that this class is a web controller
// It is integrated with Spring MVC
@Controller
public class MaterialDonationController {

    // This annotation maps HTTP POST requests to "/materials/donate"
    // This method is called when the donation form is submitted
    @PostMapping("/materials/donate")
    public String submitDonation(

            // This line receives the donor name from the form input
            @RequestParam String donorName,

            // This line receives the pickup address from the form input
            @RequestParam String pickupAddress,

            // This line receives the selected charity name from the form input
            @RequestParam String charityName) {

        // This line prints the donor name to the console
        // It is mainly used for testing and debugging
        System.out.println("Donor: " + donorName);

        // This line prints the pickup address to the console
        System.out.println("Address: " + pickupAddress);

        // This line prints the charity name to the console
        System.out.println("Charity: " + charityName);

        // This line returns the success page name
        // Spring loads success.html from the templates folder
        return "success";
    }
}
