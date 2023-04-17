package com.movieInfoSystem.movieInfoSystem.service;
import com.movieInfoSystem.movieInfoSystem.entity.Movie;
import com.movieInfoSystem.movieInfoSystem.entity.Movie;
import com.movieInfoSystem.movieInfoSystem.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service    //Indicates this class is a service component in Spring
public class MovieService {
    @Autowired
    private MovieRepository mRepo;
    public void save(Movie m){
        mRepo.save(m);
    }

    public List<Movie> getAllMovie(){
        return mRepo.findAll();
    }

    public Movie getMovieById(int id){
        return mRepo.findById(id).get();
    }

    public void DeleteById(int id){
        mRepo.deleteById(id);
    }
}
