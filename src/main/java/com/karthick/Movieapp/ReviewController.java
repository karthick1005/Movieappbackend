package com.karthick.Movieapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/reviews")
public class ReviewController {
    @Autowired
    private ReviewService reviewService;
    @PostMapping
    public ResponseEntity<Review> createreview(@RequestBody Map<String,String> payload) {
        return new ResponseEntity<Review>(reviewService.Createreview(payload.get("reviewbody"),payload.get("imdbId")), HttpStatus.OK);
    }
}
