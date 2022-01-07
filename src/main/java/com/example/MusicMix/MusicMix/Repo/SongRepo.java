package com.example.MusicMix.MusicMix.Repo;

import com.example.MusicMix.MusicMix.Models.Song;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface SongRepo extends JpaRepository<Song, UUID> {

}
