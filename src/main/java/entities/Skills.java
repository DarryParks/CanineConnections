package entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.Collection;
import java.util.HashSet;


@Entity
public class Skills {

    @Id
    @GeneratedValue()
    public int id;
    public String name;

    @Lob
    @Column(length = 1000000)
    public String description;

    @Lob
    @Column(length = 1000000)
    public Dog skills;
    @JsonIgnore
    @ManyToMany
    @JoinTable
    public Collection<Dog> dogCollection = new HashSet<>();

    public Skills() {

    }


    public Skills(int id, String name, String description, String skills) {
        this.id = id;
        this.name = name;
        this.description = description;


    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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




    @Override
    public String toString() {
        return "Skill [id=" + id + ", name=" + name + "]";
    }
}
