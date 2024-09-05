package com.karthick.Movieapp;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/movies")
public class MovieController {
    @Autowired
    private Movieservice movieservice;
    @GetMapping
    public ResponseEntity<List<Movie>> getallmovies()
    {
        return new ResponseEntity<List<Movie>>(movieservice.allmovie(), HttpStatus.OK);
    }
    @GetMapping("/{imdbId}")
    public ResponseEntity<Optional<Movie>> getsinglemovie(@PathVariable String imdbId)
    {
        return new ResponseEntity<Optional<Movie>>(movieservice.getsingle(imdbId),HttpStatus.OK);
    }
}
