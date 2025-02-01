package com.example.demo;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;

    public List<MovieEntity> allMovies() {
        System.out.println(movieRepository.findAll().toString());
        return movieRepository.findAll();

    }

    public Optional<MovieEntity> singleMovie(Object Id){
        return movieRepository.findById(id);
    }
}
