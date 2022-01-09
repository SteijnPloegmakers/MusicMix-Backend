package com.example.MusicMix.MusicMix;

import com.example.MusicMix.MusicMix.Controllers.SongController;
import com.example.MusicMix.MusicMix.Models.Song;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class SongTests {

    @Test
    void TestIfStringGetsLogged() {
        SongController controller = new SongController();

        String response = controller.getPage();

        Assertions.assertEquals("Welcome to MusicMix", response);
    }

    @Test
    void TestIfStringDoesNotGetLogged() {
        SongController controller = new SongController();

        String response = controller.getPage();

        Assertions.assertNotEquals("Welcome to America", response);
    }

    /*@Test
    void TestIfListGetsFetched(){
        SongController controller = new SongController();

        List<Song> response = controller.getSongs();
        List<Song> songs = new ArrayList<>();
        songs.add(new Song());

        Assertions.assertEquals(songs, response);


    }*/

}
