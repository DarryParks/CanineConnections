package entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Dog {

    @Id
    @GeneratedValue()
    public int id;
    public String dogName;

    @Lob
    @Column(length = 1000000)
    public String skill;
    @JsonIgnore
    @ManyToMany
    @JoinTable
    public List<Skills> skills;

    public Dog(int id, String dogName, String skill) {
        this.id = id;
        this.dogName = dogName;
        this.skill = skill;
    }


    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getDogName() {
        return dogName;
    }

    public String getSkill() {
        return skill;
    }


    public void addSkill(Skills skills) {
        this.skills.add(skills);
        skills.addDog(this);

    }


    public List<Skills> getSkills() {
        return skills;
    }

    @Override
    public String toString() {
        return "Dog [id=" + id + ", name=" + dogName + "]";
    }


}
