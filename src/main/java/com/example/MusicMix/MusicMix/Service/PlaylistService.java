package com.example.MusicMix.MusicMix.Service;

import com.example.MusicMix.MusicMix.Models.Playlist;
import com.example.MusicMix.MusicMix.Repo.PlaylistRepo;
import com.example.MusicMix.MusicMix.Repo.SongRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlaylistService {

    @Autowired
    private PlaylistRepo playlistRepo;

    public List<Playlist> getAllPlaylists(){
        return playlistRepo.findAll();
    }
}
