package com.rxcthefirst.summitshare.model;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity(name = "users")
@Getter
@Setter
public class User {

    @Id
    @GeneratedValue
    private Long id;
    private String username;
    private String email;
    private LocalDateTime createdAt = LocalDateTime.now();
}
