package com.example.MusicMix.MusicMix;

import com.example.MusicMix.MusicMix.Controllers.SongController;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;



@SpringBootTest
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
}
