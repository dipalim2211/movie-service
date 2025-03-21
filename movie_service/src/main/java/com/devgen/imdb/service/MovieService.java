package com.devgen.imdb.service;

import com.devgen.imdb.model.Movie;

import java.util.HashMap;

public class MovieService {

    //Provide API : ADD/DELETE/UPDATE/READ

    private HashMap<Long, Movie> movieMap;

    private long idCounter;

    public MovieService() {

        movieMap=new HashMap<>();
        idCounter=1;
    }

    // ADD API

    public Movie addMovie(String name , String genre ,int year)
    {
        Movie movie = new Movie(idCounter,name,genre,year);

        //Maintain Movie
        movieMap.put(idCounter,movie);
        idCounter++;
        return movie;

    }

    //API to get Movie data on ID

    public Movie getMovieByID(long id){
        return movieMap.get(id);
    }

    //Read All movie from mapMovie and return List<Movie>

    public List<Movie> getAllMovies(){

    }
}
