package com.movieInfoSystem.movieInfoSystem.controller;

import com.movieInfoSystem.movieInfoSystem.service.WatchedMoviesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller // marks this class as a Spring MVC controller
public class WatchedMoviesController {
    @Autowired // dependency injection for WatchedMoviesService
    private WatchedMoviesService service;

    @RequestMapping("/delete_movie/{id}") // maps the URL path to this method
    public String DeleteMovie(@PathVariable("id") int id){
        // deletes the movie with the given id
        service.deleteById(id);
        // redirects to the /watched_movies URL
        return "redirect:/watched_movies";
    }
}
