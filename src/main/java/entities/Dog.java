package entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.Collection;
import java.util.HashSet;

@Entity
public class Dog {

    @Id
    @GeneratedValue()
    public Long id;
    public String name;

    @Lob
    @Column(length = 1000000)
    public String description;

    @Lob
    @Column(length = 1000000)
    public String skills;
    @JsonIgnore
    @ManyToMany
    @JoinTable
    public Collection<Skills> dogSkills = new HashSet<>();

//    public Dog() {
//
//    }


    public Dog(Long id, String name, String description, String skills) {
        this.id = id;
        this.description = description;
        this.name = name;
        this.skills = skills;
    }


    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public Collection<Skills> getDogSkills() {
        return dogSkills;
    }

    public void setDogSkills(Collection<Skills> dogSkills) {
        this.dogSkills = dogSkills;
    }


    @Override
    public String toString() {
        return "Dog [id=" + id + ", name=" + name + "]";
    }


}
