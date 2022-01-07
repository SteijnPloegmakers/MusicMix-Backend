package com.example.MusicMix.MusicMix.Models;

import com.sun.istack.NotNull;
import javax.persistence.*;
import java.util.UUID;

@Entity
public class Playlist {

    @Id
    @GeneratedValue
    private UUID id;

    @Column
    @NotNull
    private String title;

    @Column
    private String description;

    @ManyToOne
    @JoinColumn(name= "song_id", referencedColumnName = "id")
    @NotNull
    private Song song;

    public UUID getId() {return id;}

    public void setId(UUID id) {this.id = id;}

    public String getTitle() {return title;}

    public void setTitle(String title) {this.title = title;}

    public String getDescription() {return description;}

    public void setDescription(String description) {this.description = description;}

    public Song getSongId() {return song;}

    public void setSongId(Song songId) {this.song = songId;}
}
