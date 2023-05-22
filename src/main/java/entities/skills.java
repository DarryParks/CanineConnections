package entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;


@Entity
public class skills {

    @Id
    @GeneratedValue()
    public int id;
    public String name;

    @Lob
    @Column(length = 1000000)
    @JsonIgnore
    @ManyToMany
    @JoinTable
    public List<dog> dogs;

    public skills(){

    }


    public skills(int id, String name) {
        this.id = id;
        this.name = name;
        this.dogs = new ArrayList<>();
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

    public void setDogs(List<dog> dogs) {
        this.dogs = dogs;
    }


    public void addDog(dog dog) {
        dogs.add(dog);
        dog.addSkill(this);
    }

    public List<dog> getDogs() {
        return dogs;
    }

    @Override
    public String toString() {
        return "Skill [id=" + id + ", name=" + name + "]";
    }
}
