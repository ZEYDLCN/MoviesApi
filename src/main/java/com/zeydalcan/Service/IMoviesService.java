package com.zeydalcan.Service;

import java.util.List;

import com.zeydalcan.Dto.MoviesDto;
import com.zeydalcan.Dto.MoviesDtoIU;

public interface IMoviesService {

	public MoviesDto saveMovies(MoviesDtoIU moviesDtoIU);
	public MoviesDto getMoviesById(Integer id);
	public List<MoviesDto> getAllMovies();
	public void deleteMovies(Integer id);
	public MoviesDto updateMovies(Integer id, MoviesDtoIU moviesDtoIU);
	
	
}
