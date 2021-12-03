package com.example.MusicMix.MusicMix.Repo;

import com.example.MusicMix.MusicMix.Models.Playlist;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PlaylistRepo extends JpaRepository<Playlist, UUID> {

}
