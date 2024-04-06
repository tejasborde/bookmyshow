package com.tejas.bookmyshow.service;

import com.tejas.bookmyshow.entity.Movie;

import java.util.List;

public interface IMovieService {

    List<Movie> getAllMovies();

    Movie createMovie(Movie movie);

    Movie getMovieById(Long id);

    Movie updateMovie(Long id, Movie movie);

    void deleteMovie(Long id);
}
