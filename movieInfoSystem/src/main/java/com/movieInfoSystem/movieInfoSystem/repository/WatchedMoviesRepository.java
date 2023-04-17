package com.movieInfoSystem.movieInfoSystem.repository;

import com.movieInfoSystem.movieInfoSystem.entity.WatchedMovie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WatchedMoviesRepository extends JpaRepository<WatchedMovie, Integer> {

}
