package com.tejas.bookmyshow.repository;

import com.tejas.bookmyshow.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Long> {
}

