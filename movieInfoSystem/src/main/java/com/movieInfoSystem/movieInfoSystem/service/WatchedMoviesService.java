package com.movieInfoSystem.movieInfoSystem.service;

import com.movieInfoSystem.movieInfoSystem.entity.WatchedMovie;
import com.movieInfoSystem.movieInfoSystem.repository.WatchedMoviesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WatchedMoviesService {

    @Autowired // Spring framework will inject a WatchedMoviesRepository instance here automatically
    private WatchedMoviesRepository WatchedMoviesRepo;

    // Method to save a WatchedMovie instance to the repository
    public void saveToWatchedMovies(WatchedMovie wm){
        WatchedMoviesRepo.save(wm);
    }


    // Method to retrieve all WatchedMovie instances from the repository
    public List<WatchedMovie> getAllWatchedMovies(){
        return WatchedMoviesRepo.findAll();
    }

    // Method to delete a WatchedMovie instance from the repository by ID
    public void deleteById(int id){
        WatchedMoviesRepo.deleteById(id);
    }
}
