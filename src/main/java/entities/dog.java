package entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class dog {

    @Id
    @GeneratedValue()
    public int id;
    public String name;

    @Lob
    @Column(length = 1000000)
    public String skill;
    @JsonIgnore
    @ManyToMany
    @JoinTable
    public List<entities.skills> skills;

    public dog(int id, String name, String skill) {
        this.id = id;
        this.name = name;
        this.skill = skill;
    }


    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSkill() {
        return skill;
    }


    public void addSkill(skills skills) {
        this.skills.add(skills);
        skills.addDog(this);

    }


    public List<skills> getSkills() {
        return skills;
    }

    @Override
    public String toString() {
        return "Dog [id=" + id + ", name=" + name + "]";
    }


}
