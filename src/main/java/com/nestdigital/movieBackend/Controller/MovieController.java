package com.nestdigital.movieBackend.Controller;

import com.nestdigital.movieBackend.Dao.MovieDao;
import com.nestdigital.movieBackend.Model.MovieModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MovieController {
    @Autowired
    private MovieDao dao;
    @CrossOrigin(origins = "*")
    @PostMapping(path = "/movieview",consumes = "application/json",produces = "application/json")
    public String Movie(@RequestBody MovieModel movie){
        dao.save(movie);
        return "{status:'success'}";
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/viwall")
    public List<MovieModel> viewMovie(){
        return (List<MovieModel>) dao.findAll();

    }
}
