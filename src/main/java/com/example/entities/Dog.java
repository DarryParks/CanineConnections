package com.example.entities;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import org.springframework.data.annotation.Id;

import java.util.Collection;
import java.util.HashSet;

@Entity
public class Dog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Lob
    @Column(length = 1000000)
    private String description;

    @JsonIgnore
    @ManyToMany(mappedBy = "dogCollection")
    private Collection<Skills> dogSkills = new HashSet<>();

    public Dog() {
    }

    public Dog(String name, String description) {
        this.name = name;
        this.description = description;
    }

   

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Collection<Skills> getDogSkills() {
        return dogSkills;
    }

    public void setDogSkills(Collection<Skills> dogSkills) {
        this.dogSkills = dogSkills;
    }
}