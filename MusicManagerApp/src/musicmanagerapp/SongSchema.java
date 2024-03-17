/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package musicmanagerapp;

import java.io.Serializable;

/**
 *
 * @author dmoc2
 */
public class SongSchema implements Serializable {
    String songName;
    String artist;
    String album;
    String genre;

    public SongSchema() {
    }
    
    

    public SongSchema(String songName, String artist, String album, String genre) {
        this.songName = songName;
        this.artist = artist;
        this.album = album;
        this.genre = genre;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
    
    public String songDetails(){
        return songName+"\t"+artist+"\t"+album+"\t"+genre+"\n";
    }
    
    
    
}
