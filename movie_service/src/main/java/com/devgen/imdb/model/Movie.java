package com.devgen.imdb.model;

public class Movie {

    private int id;         //realTime:long
    private String name;
    private String genre;   //action,sci-fi,drama
    private int year ;      //Requirement

    public Movie(int id, String name, String genre, int year) {
        this.id = id;
        this.name = name;
        this.genre = genre;
        this.year = year;
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGenre() {
        return genre;
    }

    public int getYear() {
        return year;
    }


    //To print Movie Information
    @Override
    public String toString() {
        return "Movie{" +
                "Id = " + id +
                ", Name = '" + name + '\'' +
                ", genre = '" + genre + '\'' +
                ", Year = " + year +
                '}';
    }
}
