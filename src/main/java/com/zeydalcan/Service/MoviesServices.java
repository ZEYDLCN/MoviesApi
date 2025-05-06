package com.zeydalcan.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zeydalcan.Dto.MoviesDto;
import com.zeydalcan.Dto.MoviesDtoIU;
import com.zeydalcan.Entity.Movies;
import com.zeydalcan.Repository.IMoviesRepository;

@Service
public class MoviesServices implements IMoviesService {
	@Autowired
	private IMoviesRepository moviesRepository;


	public MoviesDto saveMovies(MoviesDtoIU moviesDtoIU) {
		MoviesDto dto = new MoviesDto();
		Movies movies = new Movies();
		BeanUtils.copyProperties(moviesDtoIU, movies);
		
		Movies dbMovies = moviesRepository.save(movies);
		BeanUtils.copyProperties(dbMovies, dto);
		return dto;
	}


	@Override
	public MoviesDto getMoviesById(Integer id) {
		MoviesDto dto = new MoviesDto();
		Optional<Movies> optional = moviesRepository.findById(id);
		if(optional.isPresent())
		{
			Movies dbMovies = optional.get();
			BeanUtils.copyProperties(dbMovies, dto);
		}
		return dto;
	}


	public List<MoviesDto> getAllMovies() {
		List<MoviesDto> dtoList = new ArrayList<>();
		List<Movies> moviesList = moviesRepository.findAll();
		for (Movies movies : moviesList)
		{
		MoviesDto dto = new MoviesDto();
		BeanUtils.copyProperties(movies, dto);
		dtoList.add(dto);
		}
		return dtoList;
	}


	
	public void deleteMovies(Integer id) {
		Optional<Movies> optional = moviesRepository.findById(id);
		if(optional.isPresent())
		{
			moviesRepository.delete(optional.get());
		}
		
	}


	@Override
	public MoviesDto updateMovies(Integer id,MoviesDtoIU moviesDtoIU) {
		MoviesDto dto = new MoviesDto();
		Optional<Movies> optional = moviesRepository.findById(id);
		if(optional.isPresent())
		{
			Movies dbMovies = optional.get();
			dbMovies.setName(moviesDtoIU.getName());
			dbMovies.setYear(moviesDtoIU.getYear());
			dbMovies.setGenre(moviesDtoIU.getGenre());
			dbMovies.setRevenue(moviesDtoIU.getRevenue());
			Movies updateMovies = moviesRepository.save(dbMovies);
			BeanUtils.copyProperties(updateMovies, dto);
			return dto;
		}
		return null;
	}
	
	

}
