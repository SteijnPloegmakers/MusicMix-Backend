package com.example.MusicMix.MusicMix.Controllers;

import com.example.MusicMix.MusicMix.Models.GoogleAccount;
import com.example.MusicMix.MusicMix.Models.Playlist;
import com.example.MusicMix.MusicMix.Repo.GoogleAccountRepo;
import com.example.MusicMix.MusicMix.Repo.PlaylistRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class AuthenticationController {

    @Autowired
    private GoogleAccountRepo googleAccountRepo;

    @GetMapping
    public List<GoogleAccount> getGoogleAccounts() {return googleAccountRepo.findAll();}

    @PostMapping(value = "api/login/oauth2/google/{token}")
    public String saveGoogleAccount(@PathVariable String token, @RequestBody GoogleAccount googleAccount){

        GoogleAccount savedGoogleAccount = googleAccountRepo.save(googleAccount);
        return "Saved GoogleAccount...";
    }
}
