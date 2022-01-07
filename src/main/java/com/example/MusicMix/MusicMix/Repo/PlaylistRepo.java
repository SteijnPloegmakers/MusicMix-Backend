package com.example.MusicMix.MusicMix.Repo;

import com.example.MusicMix.MusicMix.Models.Playlist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface PlaylistRepo extends JpaRepository<Playlist, UUID> {

}
