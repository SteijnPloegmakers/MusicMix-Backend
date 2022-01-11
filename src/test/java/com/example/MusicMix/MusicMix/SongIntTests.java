package com.example.MusicMix.MusicMix;

import com.example.MusicMix.MusicMix.Repo.SongRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.junit.jupiter.api.Assertions.assertEquals;


@WebMvcTest()
@ContextConfiguration(classes = SongRepo.class)
public class SongIntTests {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void ShouldGetWelcomeMessage() throws Exception {
        RequestBuilder request = MockMvcRequestBuilders.get("/api");
        MvcResult result = mockMvc.perform(request).andReturn();
        assertEquals("Welcome on MusicMix", result.getResponse().getContentAsString());
    }
}

