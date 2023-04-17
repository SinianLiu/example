package com.movieInfoSystem.movieInfoSystem.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

// Declaring Movie class as an Entity for Persistence
@Entity
public class Movie {
    // Defining instance variables
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String director;
    private String type;
    private String country;
    private int year;
    private float rating;

    // Constructor
    public Movie(int id, String name, String director, String type, String country, int year, float rating) {
        this.id = id;
        this.name = name;
        this.director = director;
        this.type = type;
        this.country = country;
        this.year = year;
        this.rating = rating;
    }

    // Default constructor
    public Movie(){
        super();
    }

    // Getter and Setter methods for instance variables
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

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }
}
