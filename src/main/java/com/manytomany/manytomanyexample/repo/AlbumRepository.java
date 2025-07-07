package com.manytomany.manytomanyexample.repo;

import com.manytomany.manytomanyexample.entity.Album;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlbumRepository extends JpaRepository<Album, Long> {
}
