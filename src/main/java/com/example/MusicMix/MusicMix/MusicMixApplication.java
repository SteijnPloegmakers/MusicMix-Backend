package com.example.MusicMix.MusicMix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;


@SpringBootApplication
@EnableAsync
public class MusicMixApplication {

	public static void main(String[] args) {
		SpringApplication.run(MusicMixApplication.class, args);
	}
}
