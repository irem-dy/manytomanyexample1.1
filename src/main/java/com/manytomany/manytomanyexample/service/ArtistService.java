package com.manytomany.manytomanyexample.service;

import com.manytomany.manytomanyexample.entity.Album;
import com.manytomany.manytomanyexample.entity.Artist;
import com.manytomany.manytomanyexample.repo.AlbumRepository;
import com.manytomany.manytomanyexample.repo.ArtistRepository;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class ArtistService {

    private final ArtistRepository artistRepository;
    private final AlbumRepository albumRepository;

    public ArtistService(ArtistRepository artistRepository, AlbumRepository albumRepository) {
        this.artistRepository = artistRepository;
        this.albumRepository = albumRepository;
    }

    public Artist createArtistWithAlbums(String artistName, List<Long> albumIds) {
        Artist artist = new Artist();
        artist.setName(artistName);

        Set<Album> albums = new HashSet<>(albumRepository.findAllById(albumIds));
        artist.setAlbums(albums);

        return artistRepository.save(artist);
    }

    public List<Artist> getAllArtists() {
        return artistRepository.findAll();
    }
}
