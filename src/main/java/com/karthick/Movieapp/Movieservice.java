package com.karthick.Movieapp;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class Movieservice {
    @Autowired
    private Movierepository movierepository;
    public List<Movie> allmovie()
    {
        System.out.println(movierepository);
        return movierepository.findAll();
    }
    //optional make the value null if it is empty
    public Optional<Movie> getsingle(String id)
    {
        return movierepository.findMovieByImdbId(id);
    }
}
