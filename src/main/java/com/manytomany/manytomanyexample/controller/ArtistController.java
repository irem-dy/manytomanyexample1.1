package com.manytomany.manytomanyexample.controller;

import com.manytomany.manytomanyexample.dto.ArtistCreateRequest;
import com.manytomany.manytomanyexample.entity.Artist;
import com.manytomany.manytomanyexample.service.ArtistService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/artists")
public class ArtistController {

    private final ArtistService artistService;

    public ArtistController(ArtistService artistService) {
        this.artistService = artistService;
    }

    @PostMapping("/create")
    public Artist createArtist(@RequestBody ArtistCreateRequest request) {
        return artistService.createArtistWithAlbums(request.getArtistName(), request.getAlbumIds());
    }

    @GetMapping
    public List<Artist> getAllArtists() {
        return artistService.getAllArtists();
    }
}
