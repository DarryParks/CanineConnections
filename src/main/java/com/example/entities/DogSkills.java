package com.example.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.Collection;
import java.util.HashSet;

@Entity
public class DogSkills {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    public String name;

    @Lob
    @Column(length = 1000000)
    public String description;

    @ManyToOne
    @JoinColumn(name = "dog_id")
    public String skills;

    @JsonIgnore
    @ManyToMany(mappedBy = "dogSkills")
    public Collection<DogSkills> dogSkills = new HashSet<>();

    public DogSkills(Long id, String name, String description, String skills) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.skills = skills;

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

    public Collection<DogSkills> dogSkills() {
        return dogSkills;
    }


    public void setSkills(Dog dog) {
     this.dogSkills = dogSkills;
    }
}
