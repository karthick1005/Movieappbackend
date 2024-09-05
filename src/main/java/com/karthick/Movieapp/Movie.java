package com.karthick.Movieapp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.List;

@Document(collection = "movies")
@Data //this takes care of getter setter
@AllArgsConstructor //this is for creating constructor for make the arguments
@NoArgsConstructor
public class Movie {
    @Id//this is unqiue id so the annotation can make it as unique
    private ObjectId id;
    private String imdbId;
    private String title;
    private String releaseDate;
    private String trailerLink;
    private List<String> genres;
    private String poster;
    private List<String> backdrops;
    @DocumentReference//only the id of it and the the review data will be in seperate collectipn
    private List<Review> reviewIds;

}
