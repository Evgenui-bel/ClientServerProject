package com.evgen.server.models;

import jakarta.persistence.*;

@Entity
@Table(name = "types")
public class Type {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String title;
    private String description;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Type(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public Type() {
    }


    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

