package com.scm.entities;


import jakarta.persistence.*;
import lombok.*;
import java.util.*;

@Entity(name="user")
@Table(name = "users")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {
    @Id
    private String userId;
    @Column(name = "user_name",nullable = false)
    private String name;
    private String password;
    @Column(unique = true, nullable = false)
    private String email;
    @Column(length = 10000)
    private String about;
    private String phoneNumber;
    @Column(length = 1000)
    private String profilePic;
    private boolean enabled = false;
    private boolean emailVerified = false;
    private boolean phoneNumberVerified = false;

    //self, Google, Facebook etc
    private Providers provider=Providers.SELF;
    private String providerUserId;

    //add more fields if needed
    @OneToMany(mappedBy = "user",cascade = CascadeType.ALL,fetch = FetchType.LAZY, orphanRemoval = true)
    private List<Contact> contacts = new ArrayList<>();





}
