package entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Dog {

    @Id
    @GeneratedValue()
    public int id;
    public String name;

    @Lob
    @Column(length = 1000000)
    public String skill;
    public List<Skill> skills;

    public Dog(int id, String name, String skill) {
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


    public void addSkill(Skill skill) {
        skills.add(skill);
        skill.addDog(this);

    }


    public List<Skill> getSkills() {
        return skills;
    }

    @Override
    public String toString() {
        return "Dog [id=" + id + ", name=" + name + "]";
    }


}
