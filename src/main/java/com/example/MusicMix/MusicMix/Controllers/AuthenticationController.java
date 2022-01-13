package com.example.MusicMix.MusicMix.Controllers;

import com.example.MusicMix.MusicMix.Models.GoogleAccount;
import com.example.MusicMix.MusicMix.Repo.GoogleAccountRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class AuthenticationController {

    @Autowired
    private GoogleAccountRepo googleAccountRepo;

    @PostMapping(value = "api/login/oauth2/google")
    public String saveGoogleAccount(GoogleAccount googleAccount){

        googleAccountRepo.save(googleAccount);

        return "Saved GoogleAccount";
    }
}
