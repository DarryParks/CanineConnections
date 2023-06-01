package com.example.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import java.util.Collection;
import java.util.HashSet;

@Entity
public class Skills {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Lob
    @Column(length = 1000000)
    private String description;

    @ManyToOne
    @JoinColumn(name = "dog_id")
    @JsonIgnore
    private Dog dog;


    @ManyToMany(mappedBy = "skills")
    private Collection<Dog> dogCollection = new HashSet<>();

    public Skills() {
    }

    public Skills(String name, String description) {
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

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public Collection<Dog> getDogCollection() {
        return dogCollection;
    }

    public void setDogCollection(Collection<Dog> dogCollection) {
        this.dogCollection = dogCollection;
    }

    public void setSkills(Dog dog) {

    }
}