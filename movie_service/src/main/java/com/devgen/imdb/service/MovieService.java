package com.devgen.imdb.service;

import com.devgen.imdb.model.Movie;

import java.util.HashMap;

public class MovieService {

    //Provide API : ADD/DELETE/UPDATE/READ

    //DataStructure Used : MAP

    private HashMap<Long, Movie> movieMap;

    //SystemGenerated ID

    private long idCounter;

    public MovieService() {

        movieMap=new HashMap<>();
        idCounter=1;
    }

    //ReturnType:Movie -> After Add you can pass movie Object to add movie with ID

    public Movie addMovie(String name , String genre ,int year)
    {
        Movie movie = new Movie(1,name,genre,year);

        //Maintain Movie
        movieMap.put(idCounter,movie);
        idCounter++;
        return movie;

    }

}
