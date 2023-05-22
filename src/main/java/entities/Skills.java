package entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;


@Entity
public class Skills {

    @Id
    @GeneratedValue()
    public int id;
    public String name;

    @Lob
    @Column(length = 1000000)
    @JsonIgnore
    @ManyToMany
    @JoinTable
    public List<Dog> Dogs;

    public Skills(){

    }


    public Skills(int id, String name) {
        this.id = id;
        this.name = name;
        this.Dogs = new ArrayList<>();
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

    public void setDogs(List<Dog> Dogs) {
        this.Dogs = Dogs;
    }


    public void addDog(Dog dog) {
        Dogs.add(dog);
        dog.addSkill(this);
    }

    public List<Dog> getDogs() {
        return Dogs;
    }

    @Override
    public String toString() {
        return "Skill [id=" + id + ", name=" + name + "]";
    }
}
