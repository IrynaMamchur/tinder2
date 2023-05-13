package com.irina197.tinder1.entity;

import com.irina197.tinder1.entity.Sex;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@Entity
@Table(name = "users")


public class User {

    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "sex")
    private Sex sex;

    @Column(name = "points")
    private int points;

    public User(int id, String name, Sex sex, int points) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.points = points;
    }

    public User() {

    }

    public void add(User user) {
    }
}