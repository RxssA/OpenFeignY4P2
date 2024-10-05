package ie.atu.openfeigny4p2;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegistorController {

    @PostMapping("/confirm")
        public String confirm(@RequestBody UserDetails userDetails) {
        String confirmationMessage = String.format("Received details for %s with email: %s", userDetails.getName(), userDetails.getEmail());
        return confirmationMessage;
    }


}
