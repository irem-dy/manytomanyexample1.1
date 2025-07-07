package com.manytomany.manytomanyexample.dto;

import java.util.List;

public class ArtistCreateRequest {
    private String artistName;
    private List<Long> albumIds;

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public List<Long> getAlbumIds() {
        return albumIds;
    }

    public void setAlbumIds(List<Long> albumIds) {
        this.albumIds = albumIds;
    }
}
