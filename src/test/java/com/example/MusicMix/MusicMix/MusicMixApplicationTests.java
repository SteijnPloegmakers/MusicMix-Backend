package com.example.MusicMix.MusicMix;

import com.example.MusicMix.MusicMix.Service.SongService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MusicMixApplicationTests {

	@Test
	void contextLoads() {
		SongService songService = new SongService();
	}

}
