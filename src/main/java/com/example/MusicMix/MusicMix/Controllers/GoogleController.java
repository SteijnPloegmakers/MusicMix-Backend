package com.example.MusicMix.MusicMix.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GoogleController {

    @GetMapping("/restricted")
    public String restricted() {
        return "To see this text you need to be logged in";
    }
}
