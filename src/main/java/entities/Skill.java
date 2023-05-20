package entities;

import java.util.ArrayList;
import java.util.List;

public class Skill {
    public int id;
    public String name;
    public List<Dog> dogs;


    public Skill(int id, String name) {
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

    public void setDogs(List<Dog> dogs) {
        this.dogs = dogs;
    }


    public void addDog(Dog dog) {
        dogs.add(dog);
        dog.addSkill(this);
    }

    public List<Dog> getDogs() {
        return dogs;
    }

    @Override
    public String toString() {
        return "Skill [id=" + id + ", name=" + name + "]";
    }
}
