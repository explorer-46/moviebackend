package com.nestdigital.movieBackend.Dao;


import com.nestdigital.movieBackend.Model.MovieModel;
import org.springframework.data.repository.CrudRepository;

public interface MovieDao extends CrudRepository<MovieModel,Integer> {
}
