package org.resume.restaurant.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "RESTAURANTS")
public class Restaurant {
    @Id
    @Column(name = "ID")
    private int id;
    @Column(name = "NAME")
    private String name;


    public Restaurant(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Restaurant(int id) {
        this.id = id;
    }

    public Restaurant() {
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



    @Override
    public String toString() {
        return "Restaurant{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
