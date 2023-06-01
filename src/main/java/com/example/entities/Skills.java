package com.example.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.Collection;
import java.util.HashSet;

@Entity
public class Skills {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    public String name;

    @Lob
    @Column(length = 1000000)
    public String description;

    @ManyToOne
    @JoinColumn(name = "dog_id")
    public Dog skills;

    @JsonIgnore
    @ManyToMany(mappedBy = "dogSkills")
    public Collection<Dog> dogCollection = new HashSet<>();

    public Skills(Long id, String name, String description, Dog skills) {

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

    public Collection<Dog> getDogCollection() {
        return dogCollection;
    }

    public void setDogCollection(Collection<Dog> dogCollection) {
        this.dogCollection = dogCollection;
    }

    public void setSkills(Dog skills) {
        this.skills = skills;
    }
}
