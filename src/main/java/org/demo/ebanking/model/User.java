package org.demo.ebanking.model;


import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;


@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username ;
    private String name ;
    private String password;


    @ElementCollection(fetch = FetchType.EAGER)
    private List<String> roles; // Stocke directement les noms de rôles (ex: ["ROLE_ADMIN", "ROLE_USER"])


    public List<String> getRoles() {
        if (roles == null) {
            roles = new ArrayList<>();
        }
        return roles;
    }


}
