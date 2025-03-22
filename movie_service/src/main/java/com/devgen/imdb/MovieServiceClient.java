package com.devgen.imdb;

import com.devgen.imdb.model.Movie;
import com.devgen.imdb.service.MovieService;

import java.util.List;
import java.util.SortedMap;

//Service Layer - write business logic by using inputs and generate output in object format

public class MovieServiceClient
{

    public static void main(String[] args) {

        //Create Movie

        MovieService movieService = new MovieService();
        movieService.addMovie("Pushpa","Action",2024);

        //Read Movie by ID

        Movie movie=movieService.getMovieByID(2);
        System.out.println(movie);

        //Read all movie

        List<Movie> movies =movieService.getAllMovies();
        System.out.println(movies);

        //Delete

        boolean isDeleted=movieService.deleteMovie(200);

        if(isDeleted){
            System.out.println("Movie Deleted Successfully");
        } else {
            System.out.println("Movie Not Found");
        }

        movies=movieService.getAllMovies();
        System.out.println(movies);

        //Update

        //change year 2005 to 2010
        boolean isUpdated=movieService.updateMovie(1,"hey baby","Comedy",2010);

        if(isUpdated){
            System.out.println("Movie Deleted Successfully");
        }else {
            System.out.println("Movie Not Found");
        }
        movies =movieService.getAllMovies();
        System.out.println(movies);

        //search

        movies=movieService.searchMovieByGenre("Sci-Fi");
        System.out.println(movies);

        movies=movieService.searchMovieByYear(2014);
        System.out.println(movies);
    }

}
