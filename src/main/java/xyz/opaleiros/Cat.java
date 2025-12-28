package xyz.opaleiros;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;

@Entity
public class Cat extends PanacheEntity {
    public String name;
    public int age;
    public String color;
}
