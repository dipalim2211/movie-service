package com.devgen.imdb;

import com.devgen.imdb.model.Movie;
import com.devgen.imdb.service.MovieService;

public class MovieServiceClient
{

    public static void main(String[] args) {

        //Create Movie

        MovieService movieService = new MovieService();
        movieService.addMovie("hey baby","Comedy",2005);
        movieService.addMovie("Inception","Sci-fi",2008);
        movieService.addMovie("Interstellar","Sci-Fi",2014);
        movieService.addMovie("Parasite","Thriller",2019);
        movieService.addMovie("Chava","Historical",2025);

        //Read Movie

        Movie movie=movieService.getMovieByID(4);

        System.out.println(movie);


    }

}
