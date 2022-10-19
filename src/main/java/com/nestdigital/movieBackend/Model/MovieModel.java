package com.nestdigital.movieBackend.Model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "movies")
public class MovieModel {
    @Id
    @GeneratedValue
    private int id;
    private String movieName;
    private int rYear;
    private String language;

    public MovieModel(int id, String movieName, int rYear, String language) {
        this.id = id;
        this.movieName = movieName;
        this.rYear = rYear;
        this.language = language;
    }

    public MovieModel() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public int getrYear() {
        return rYear;
    }

    public void setrYear(int rYear) {
        this.rYear = rYear;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}
