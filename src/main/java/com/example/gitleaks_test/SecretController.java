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
        // Return a redacted version of the secret key
        return "The secret key is: " + maskSecret(secretKey);
    }

    @GetMapping("/secret1")
    public String getSecret1() {
        // Return a redacted version of the secret key1
        return "The secret key is: " + maskSecret(secretKey1);
    }

    private String maskSecret(String secret) {
        // Mask all but the last 4 characters of the secret
        if (secret.length() <= 4) {
            return "****";
        }
        return "****" + secret.substring(secret.length() - 4);
    }
}
