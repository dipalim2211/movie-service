package com.devgen.imdb.model;

public class Movie {

    private long id;         //realTime:long
    private String name;
    private String genre;   //action,sci-fi,drama
    private int year ;      //Requirement

    public Movie(long id, String name, String genre, int year) {
        this.id = id;
        this.name = name;
        this.genre = genre;
        this.year = year;
    }


    public long getId() {
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

    //Setter Methode to Update Information

    public void setName(String name) {
        this.name = name;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setYear(int year) {
        this.year = year;
    }

    //To print Movie Information
    @Override
    public String toString() {
        return "Movie{" +
                "Id = " + id +
                ", Name = '" + name + '\'' +
                ", genre = '" + genre + '\'' +
                ", Year = " + year +
                '}'+"\n";

    }
}
