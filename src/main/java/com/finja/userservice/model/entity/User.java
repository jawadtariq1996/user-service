package com.finja.userservice.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "finja_user")
public class User {

    @Id
    @Column(name = "id", updatable = false, nullable = false, unique = true)
    private UUID userId;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "middle_name")
    private String middleName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "email")
    private String email;

    @Column(name = "country_code")
    private String countryCode;

    @Column(name = "mobile_number")
    private String mobileNumber;

    @Column(name = "created_at")
    private LocalDateTime created_at;
}
