package com.example.MusicMix.MusicMix.Controllers;

import com.example.MusicMix.MusicMix.Models.Song;
import com.example.MusicMix.MusicMix.Repo.SongRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class SongController {

    @Autowired
    private SongRepo songRepo;

    @GetMapping(value = "/api")
    public String getPage() {return "Welcome on MusicMix";}

    @GetMapping(value = "api/songs")
    public List<Song> getSongs() {return songRepo.findAll();}

    @PostMapping(value = "api/postsong")
    public String saveSong(@RequestBody Song song){
        songRepo.save(song);
        return "Saved Song...";
    }

    @PutMapping(value = "api/updatesong/{id}")
    public String updateSong(@PathVariable UUID id, @RequestBody Song song){
        Song updatedSong = songRepo.findById(id).get();

        updatedSong.setTitle(song.getTitle());
        updatedSong.setArtist(song.getArtist());
        updatedSong.setYear(song.getYear());

        songRepo.save(updatedSong);
        return "Updated Song...";
    }

    @DeleteMapping(value = "api/deletesong/{id}")
    public String deleteSong(@PathVariable UUID id){
        Song deletedSong = songRepo.findById(id).get();
        songRepo.delete(deletedSong);
        return "Deleted Song with the id "+id;
    }
}
