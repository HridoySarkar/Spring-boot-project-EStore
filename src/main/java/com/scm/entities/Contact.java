package com.scm.entities;

import jakarta.persistence.*;

import java.util.*;

@Entity
public class Contact {

    @Id
    private int id;
    private String name;
    private String phone;
    private String email;
    private String address;
    private String picture;
    @Column(length = 1000)
    private String description;
    private boolean favorite = false;
    private String websiteLink;
    private String linkedInLink;

    @ManyToOne
    private User user;

    @OneToMany(mappedBy = "contact", cascade = CascadeType.ALL, fetch = FetchType.EAGER, orphanRemoval = true)
    private List<SocialLink> socialLinks = new ArrayList<>();
}