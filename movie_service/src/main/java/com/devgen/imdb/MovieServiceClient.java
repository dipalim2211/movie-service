package com.devgen.imdb;

import com.devgen.imdb.model.Movie;
import com.devgen.imdb.service.MovieService;

public class MovieServiceClient
{

    public static void main(String[] args) {

        /*
        Movie movie = new Movie(1,"hey baby","Comedy",2005);
        System.out.println(movie);
         */

        //add Movie

        MovieService movieService = new MovieService();
        Movie movie=movieService.addMovie("hey baby","Comedy",2005);   //addMovie:Return movie object

        System.out.println(movie);

    }

}
