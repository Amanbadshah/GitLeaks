package com.example.gitleaks_test;



import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecretController {
    @Value("${api.secret.key}")
    private String secretKey;

    @GetMapping("/secret")
    public String getSecret() {
    // This is a hardcoded secret for testing Gitleaks
    String hardcodedSecret = "HARDCODED-SECRET-12345";
    return "The secret key is: " + secretKey + ", Hardcoded Secret: " + hardcodedSecret;
}

}

