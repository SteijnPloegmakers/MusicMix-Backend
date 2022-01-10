package com.example.MusicMix.MusicMix.Controllers;

import com.example.MusicMix.MusicMix.Models.GoogleAccount;
import com.example.MusicMix.MusicMix.Repo.GoogleAccountRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
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
    @Async
    public String saveGoogleAccount(@PathVariable("token") GoogleAccount token){

        try {
            GoogleAccount savedGoogleAccount = googleAccountRepo.save(token);
        }catch (Exception e){
            e.printStackTrace();
        }
        return "Saved GoogleAccount...";
    }
}
