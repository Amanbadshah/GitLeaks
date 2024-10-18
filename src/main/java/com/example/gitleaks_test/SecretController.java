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
        return "The secret key is: " + secretKey;
    }
}

