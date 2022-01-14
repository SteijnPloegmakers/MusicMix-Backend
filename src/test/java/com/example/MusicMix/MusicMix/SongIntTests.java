package com.example.MusicMix.MusicMix;

import com.example.MusicMix.MusicMix.Models.Song;
import com.example.MusicMix.MusicMix.Repo.SongRepo;
import com.example.MusicMix.MusicMix.Service.SongService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;


@WebMvcTest()
@ContextConfiguration(classes = SongRepo.class)
public class SongIntTests {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void ShouldNotGetWelcomeMessage() throws Exception {
        RequestBuilder request = MockMvcRequestBuilders.get("/api");
        MvcResult result = mockMvc.perform(request).andReturn();
        assertNotEquals("Welcome on America", result.getResponse().getContentAsString());
    }

    @Test
    void ShouldNotGetWelcomeMessageAsWell() throws Exception {
        RequestBuilder request = MockMvcRequestBuilders.get("/api");
        MvcResult result = mockMvc.perform(request).andReturn();
        assertNotEquals("Welcome", result.getResponse().getContentAsString());
    }
}

