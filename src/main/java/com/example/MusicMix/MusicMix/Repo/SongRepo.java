package com.example.MusicMix.MusicMix.Repo;

import com.example.MusicMix.MusicMix.Models.Song;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface SongRepo extends JpaRepository<Song, UUID> {
}
