package com.manytomany.manytomanyexample.repo;

import com.manytomany.manytomanyexample.entity.Artist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArtistRepository extends JpaRepository<Artist, Long> {
}
