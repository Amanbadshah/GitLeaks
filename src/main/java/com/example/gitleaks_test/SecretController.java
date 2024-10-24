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
 private String Amna="Password@123";
    @GetMapping("/secret")
    public String getSecret() {

        return "The secret key is: " + secretKey;
    }

    @GetMapping("/secret1")
    public String getSecret1() {
        return "The secret key is: " + secretKey1;
    }
    
    
    

}




