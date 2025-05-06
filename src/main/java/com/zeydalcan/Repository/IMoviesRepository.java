package com.zeydalcan.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zeydalcan.Entity.Movies;

public interface IMoviesRepository extends JpaRepository<Movies, Integer>{

}
