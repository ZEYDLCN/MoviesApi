package com.zeydalcan.Controller;

import java.util.List;

import com.zeydalcan.Dto.MoviesDto;
import com.zeydalcan.Dto.MoviesDtoIU;

public interface IMoviesController {
    public MoviesDto saveMovies(MoviesDtoIU moviesDtoIU);
    public MoviesDto getMoviesById(Integer id);
    public List<MoviesDto> getAllMovies();
    public void deleteMovies(Integer id);
    public MoviesDto updateMovies(Integer id, MoviesDtoIU moviesDtoIU);
}