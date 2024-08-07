package com.example.friday.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "tutorials")
public class Tutorial {
    // encapsulation through private key word (access modifier)
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "published")
    private boolean published;

    public Tutorial() {
    }

    public Tutorial(String title, String description, boolean published) {
        this.title = title;
        this.description = description;
        this.published = published;
    }







}

