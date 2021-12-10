package com.example.MusicMix.MusicMix.Models;

import com.sun.istack.NotNull;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.UUID;

@Entity
public class Song {

    @Id
    @GeneratedValue
    private UUID id;

    @Column
    @NotNull
    private String title;

    @Column
    @NotNull
    private String artist;

    @Column
    @NotNull
    private int year;

    @Column
    @NotNull
    private String audioFilePath;


    public UUID getId() {
        return id;
    }

    public void setId(UUID id) { this.id = id;}

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getAudio() { return audioFilePath; }

    public void setAudio(String audioFilePath) { this.audioFilePath = audioFilePath;}

}
