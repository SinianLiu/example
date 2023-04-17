package com.movieInfoSystem.movieInfoSystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
//@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
public class MovieInfoSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieInfoSystemApplication.class, args);
	}

}

