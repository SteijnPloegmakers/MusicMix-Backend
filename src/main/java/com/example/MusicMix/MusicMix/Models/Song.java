package com.example.MusicMix.MusicMix.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Song {

    @Id
    @GeneratedValue
    private long id;

    @Column
    private String title;

    @Column
    private String artist;

    @Column
    private int year;

    //@Column
    //private File Audio;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

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

    /*public File getAudio() {
        return audio;
    }

    public void setAudio(File audio) {
        audio = audio;
    }*/
}
