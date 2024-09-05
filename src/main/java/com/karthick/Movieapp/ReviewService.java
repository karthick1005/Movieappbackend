package com.karthick.Movieapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

@Service
public class ReviewService {
    @Autowired
    private ReviewRepository reviewrepository;
    @Autowired
    private MongoTemplate template;
    @Autowired
    private MongoTemplate mongoTemplate;

    public Review Createreview(String reviewbody,String imdbId)
    {
        Review review = reviewrepository.insert(new Review(reviewbody));
    mongoTemplate.update(Movie.class).matching(Criteria.where("imdbId").is(imdbId)).apply(new Update().push("reviewIds").value(review)).first();
    return review;
    }
}
