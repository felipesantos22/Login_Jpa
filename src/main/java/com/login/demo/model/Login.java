package com.login.demo.model;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Login {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private int id;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

}
