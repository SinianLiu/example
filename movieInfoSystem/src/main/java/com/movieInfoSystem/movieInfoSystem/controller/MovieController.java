// Import necessary packages
package com.movieInfoSystem.movieInfoSystem.controller;
import com.movieInfoSystem.movieInfoSystem.entity.Movie;
import com.movieInfoSystem.movieInfoSystem.entity.WatchedMovie;
import com.movieInfoSystem.movieInfoSystem.service.MovieService;
import com.movieInfoSystem.movieInfoSystem.service.WatchedMoviesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller // Controller annotation to indicate this class is a controller
public class MovieController {
    @Autowired   // Autowire the MovieService object
    private MovieService service;

    @Autowired // Autowire the WatchedMoviesService object
    private WatchedMoviesService wmServices;

    @GetMapping("/") // Handle the GET request for the root URL
    public String home(){
        return "home"; // Return the home.html template
    }

    @GetMapping("/add_movie") // Handle the GET request for /add_movie URL
    public String addMovie(){
        return "addMovie";
    }

    @GetMapping("/interested_movies")
    public ModelAndView getAllIntMovies(){
        List<Movie> list = service.getAllMovie(); // Retrieve all movies from the database
        return new ModelAndView("interestedMovieList","movie", list);
        // Return the interestedMovieList.html template and pass the movie list as a parameter
    }

    @PostMapping("/save") // Handle the POST request for /save URL
    public String addMovieToDB(@ModelAttribute Movie m){
        service.save(m); // Save the movie to the database
        return "redirect:/interested_movies"; // Redirect to the /interested_movies URL
    }

    @GetMapping("/watched_movies")
    public String getWatchedMovies(Model model){
        List<WatchedMovie> list = wmServices.getAllWatchedMovies(); // Retrieve all watched movies from the database
        model.addAttribute("movie",list); // Add the watched movie list as a model attribute
        return"watchedMovieList";
    }


    @RequestMapping("/add_to_watched/{id}") // Handle the GET request for /add_to_watched/{id} URL
    public String getTheWatchedMovie(@PathVariable("id") int id){
        Movie m = service.getMovieById(id); // Retrieve the movie with the given id
        WatchedMovie wmList = new WatchedMovie(m.getId(),m.getName(), m.getDirector(),m.getType(), m.getCountry(), m.getYear(), m.getRating());
        // Create a new WatchedMovie object with the retrieved movie details
        wmServices.saveToWatchedMovies(wmList); // Save the watched movie to the database
        service.DeleteById(id); // Delete the movie from the "Interested Movies" list
        return "redirect:/watched_movies"; // Redirect to the /watched_movies URL
    }

    @RequestMapping("/edit_movie/{id}") // Handle the GET request for /edit_movie/{id} URL
    public String editMovie(@PathVariable("id") int id, Model model){
        Movie m = service.getMovieById(id); // Retrieve the movie with the given id
        model.addAttribute("Movie", m); // Add the retrieved movie as a model attribute
        return "movieEdit";
    }

    @RequestMapping("/delete_interested_movie/{id}")
    public String deleteInterMovie(@PathVariable("id")int id){
        service.DeleteById(id); // Deletes the movie from the "Interested Movies" list
        return "redirect:/interested_movies";
    }

}

