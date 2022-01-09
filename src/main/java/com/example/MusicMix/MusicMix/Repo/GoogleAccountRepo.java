package com.example.MusicMix.MusicMix.Repo;

import com.example.MusicMix.MusicMix.Models.GoogleAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface GoogleAccountRepo extends JpaRepository<GoogleAccount, String> {

}
