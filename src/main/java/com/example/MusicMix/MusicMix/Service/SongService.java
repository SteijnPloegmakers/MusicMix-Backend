package com.example.MusicMix.MusicMix.Service;


import com.example.MusicMix.MusicMix.Models.Song;
import com.example.MusicMix.MusicMix.Repo.SongRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SongService {

    @Autowired
    private SongRepo songRepo;

    public List<Song> getAllSongs(){
        return songRepo.findAll();
    }
}
