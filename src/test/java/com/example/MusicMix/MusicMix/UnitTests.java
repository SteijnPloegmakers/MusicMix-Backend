package com.example.MusicMix.MusicMix;

import com.example.MusicMix.MusicMix.Controllers.SongController;
import com.example.MusicMix.MusicMix.Models.Song;
import com.example.MusicMix.MusicMix.Repo.SongRepo;
import com.example.MusicMix.MusicMix.Service.SongService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import java.util.Arrays;
import java.util.List;


@SpringBootTest
@ContextConfiguration(classes = SongRepo.class)
class UnitTests {

    @Test
    void TestIfStringGetsLogged() {
        SongController controller = new SongController();

        String response = controller.getPage();

        Assertions.assertEquals("Welcome on MusicMix", response);
    }

    @Test
    void TestIfStringDoesNotGetLogged() {
        SongController controller = new SongController();

        String response = controller.getPage();

        Assertions.assertNotEquals("Welcome to America", response);
    }

    /*@Test
    void TestIfListGetsFetched(){
        SongService songService = new SongService();
        SongController songController = new SongController();

        List<Song> songList = songService.getAllSongs();
        List<Song> response = songController.getSongs();

        Assertions.assertEquals(songList, response);

    }*/
}
