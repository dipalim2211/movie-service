package com.devgen.imdb.service;

import com.devgen.imdb.model.Movie;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class MovieService {

    //Provide API : ADD/DELETE/UPDATE/READ

    private HashMap<Long, Movie> movieMap;

    private long idCounter;

    public MovieService() {

        movieMap=new HashMap<>();
        idCounter=1;
        initializeMovie();
    }

    //Pre-data initialise in system
    private void initializeMovie()      // Call through Constructor
    {
    addMovie("hey baby","Comedy",2005);
    addMovie("Inception","Sci-Fi",2008);
    addMovie("Interstellar","Sci-Fi",2014);
    addMovie("Parasite","Thriller",2019);
    addMovie("Chava","Historical",2025);
    addMovie("Gone Girl","Thriller",2014);
    addMovie("Superbad ","Comedy",2005);
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

    public List<Movie> getAllMovies()
    {
        return new ArrayList<>(movieMap.values());
    }

    //Delete Movie by ID

    public Boolean deleteMovie(long id){
        Movie movie=movieMap.remove(id);        //check returnType and it pass value

        if(movie!= null)
        {
            return  true;
        }
        return false;
    }

    //Update Movie

    public boolean updateMovie(long id,String name,String genre,int year){

        Movie movie=movieMap.get(id);
        if(movie==null){
            return false;
        }
    else {
            movie.setName(name);
            movie.setGenre(genre);
            movie.setYear(year);
            return true;
        }
    }

    //Search

    public List<Movie> searchMovieByGenre(String Genre){

        List<Movie>matchingMovie = new ArrayList<>();

        for(Movie movies : movieMap.values())
        {
            if(movies.getGenre().equals(Genre))
            {
                matchingMovie.add(movies);
            }
        }

        return matchingMovie;
    }

    public List<Movie> searchMovieByYear(int Year){

        List<Movie>matchingMovie = new ArrayList<>();

        for(Movie movies : movieMap.values())
        {
            if(movies.getYear()==(Year))
            {
                matchingMovie.add(movies);
            }
        }

        //sort it by name
        Collections.sort(matchingMovie,(o1, o2) -> o1.getName().compareTo(o2.getName()));

        return matchingMovie;

    }

}
