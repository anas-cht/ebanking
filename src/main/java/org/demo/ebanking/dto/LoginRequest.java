package org.demo.ebanking.dto;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class LoginRequest {
    private String username;
    private String password;
    // Getters et setters
}