package com.movieInfoSystem.movieInfoSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.movieInfoSystem.movieInfoSystem.entity.Movie;
import org.springframework.stereotype.Repository;

@Repository //Indicate this interface is a repository component in Spring
public interface MovieRepository extends JpaRepository<Movie, Integer>{
    // The "JpaRepository" interface is a Spring Data JPA interface that provides CRUD functionality for a specific entity type. In this case, it provides CRUD functionality for the "Movie" entity.
}
