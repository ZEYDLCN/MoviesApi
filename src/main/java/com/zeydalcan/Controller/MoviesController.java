package com.zeydalcan.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zeydalcan.Dto.MoviesDto;
import com.zeydalcan.Dto.MoviesDtoIU;
import com.zeydalcan.Service.IMoviesService;

import jakarta.validation.Valid;

@RestController
@RequestMapping(path = "/rest/api/movies")
public class MoviesController implements IMoviesController{
    @Autowired
    private IMoviesService moviesService;

    @PostMapping(path = "/save")
    public MoviesDto saveMovies(@Valid @RequestBody MoviesDtoIU moviesDtoIU) {
        return moviesService.saveMovies(moviesDtoIU);
    }

    @GetMapping(path = "/list/{id}")
    public MoviesDto getMoviesById( @PathVariable(name = "id") Integer id) {
        return moviesService.getMoviesById(id);
    }

    @GetMapping(path = "/list")
    public List<MoviesDto> getAllMovies() {
        return moviesService.getAllMovies();
    }

    @DeleteMapping(path = "/delete/{id}")
    public void deleteMovies( @PathVariable(name = "id") Integer id) {
        moviesService.deleteMovies(id);

    }

    @PutMapping(path = "/update/{id}")
    public MoviesDto updateMovies( @PathVariable(name = "id") Integer id, @RequestBody MoviesDtoIU moviesDtoIU) {
        return moviesService.updateMovies(id, moviesDtoIU);
    }

}