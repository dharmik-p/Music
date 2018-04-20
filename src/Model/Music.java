/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.time.LocalDate;

/**
 *
 * @author dharm
 */
public class Music {

    private String musicName,genre,album;
    
    private LocalDate ReleaseDate;

    public Music(String musicName, String genre, String album, LocalDate ReleaseDate) {
        setMusicName(musicName);
        setGenre(genre);
        setAlbum(album);
        setReleaseDate(ReleaseDate);
    }

    public String getGenre() {
        return genre;
    }

    /**
     *
     * @param genre
     */
    public void setGenre(String genre) {
        if (genre.equalsIgnoreCase("Rock") | genre.equalsIgnoreCase("Pop") | genre.equalsIgnoreCase("Jazz") | genre.equalsIgnoreCase("Romantic") | genre.equalsIgnoreCase("Horror")) {
            this.genre = genre;
        } else {
            throw new IllegalArgumentException("Genre must be valid");
        }

    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
       if (album.isEmpty()) {
            throw new IllegalArgumentException("album is required");
        } else {
            this.album = album;
        }
    }

    public LocalDate getReleaseDate() {
        return ReleaseDate;
    }

    public void setReleaseDate(LocalDate ReleaseDate) {

        if (LocalDate.from(ReleaseDate).isAfter(LocalDate.now())) {
            throw new IllegalArgumentException("Release date is not correct");
        } else {
            this.ReleaseDate = ReleaseDate;
        }

    }


    

    public String getMusicName() {
        return musicName;
    }

    public void setMusicName(String musicName) {
         if (musicName.isEmpty()) {
            throw new IllegalArgumentException("Music Name is required");
        } else {
            this.musicName = musicName;
        }
    }

   

    @Override
    public String toString() {
        return  musicName;
    }
    
}
