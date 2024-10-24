package com.example.gitleaks_test;



import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecretController {
    @Value("${api.secret.key}")
    private String secretKey;
    @Value("${api.secret.key1}")
    private String secretKey1;

    @GetMapping("/secret")
    public String getSecret() {
<<<<<<< HEAD
        return "The secret key is: " + secretKey;
    }

    @GetMapping("/secret1")
    public String getSecret1() {
        return "The secret key is: " + secretKey1;
    }
    
=======
    // This is a hardcoded secret for testing Gitleaks
    String hardcodedSecret = "HARDCODED-SECRET-12345";
    return "The secret key is: " + secretKey + ", Hardcoded Secret: " + hardcodedSecret;
}

>>>>>>> 5b8a9583ba976c35a0be1b502011e453e553b2b0
}

