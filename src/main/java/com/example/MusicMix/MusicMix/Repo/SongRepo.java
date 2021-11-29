package com.example.MusicMix.MusicMix.Repo;

import com.example.MusicMix.MusicMix.Models.Song;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SongRepo extends JpaRepository<Song, Long> {
}
