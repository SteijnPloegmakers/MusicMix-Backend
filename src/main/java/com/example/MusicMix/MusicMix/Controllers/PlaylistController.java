package com.example.MusicMix.MusicMix.Controllers;

import com.example.MusicMix.MusicMix.Models.Playlist;
import com.example.MusicMix.MusicMix.Repo.PlaylistRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class PlaylistController {

    @Autowired
    private PlaylistRepo playlistRepo;

    @GetMapping(value = "api/playlists")
    public List<Playlist> getPlaylists() {return playlistRepo.findAll();}

    @PostMapping(value = "api/playlist/save")
    @Async
    public String savePlaylist(@RequestBody Playlist playlist){

        try {
            Playlist savedPlaylist = playlistRepo.save(playlist);
        }catch (Exception e){
            e.printStackTrace();
        }
        return "Saved Playlist...";
    }

    @PutMapping(value = "api/playlist/update/{id}")
    public String updatePlaylist(@PathVariable UUID id, @RequestBody Playlist playlist){
        Playlist updatedPlaylist = playlistRepo.findById(id).get();

        updatedPlaylist.setTitle(playlist.getTitle());
        updatedPlaylist.setDescription(playlist.getDescription());

        playlistRepo.save(updatedPlaylist);
        return "Updated Playlist...";
    }

    @DeleteMapping(value = "api/playlist/delete/{id}")
    public String deletePlaylist(@PathVariable UUID id){
        Playlist deletedPlaylist = playlistRepo.findById(id).get();
        playlistRepo.delete(deletedPlaylist);
        return "Deleted Playlist with the id " +id;
    }
}
