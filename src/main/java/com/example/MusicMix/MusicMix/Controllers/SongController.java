package com.example.MusicMix.MusicMix.Controllers;

import com.example.MusicMix.MusicMix.Models.Song;
import com.example.MusicMix.MusicMix.Repo.SongRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.UUID;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class SongController {

    private static String UPLOAD_FOLDER = "/Apps/MusicMix/wwwroot/UploadedSongs/";

    @Autowired
    private SongRepo songRepo;

    @GetMapping(value = "/api")
    public String getPage() {return "Welcome on MusicMix";}

    @GetMapping(value = "api/songs")
    public List<Song> getSongs() {return songRepo.findAll();}

    @PostMapping(value = "api/song/save")
    public String saveSong(Song song, @RequestParam("file") MultipartFile file, RedirectAttributes redirectAttributes){
        if (file.isEmpty()) {
            redirectAttributes.addFlashAttribute("message", "Please select a file to upload");
            return "redirect:uploadStatus";
        }

        try{
            byte[] bytes = file.getBytes();
            Path path = Paths.get(UPLOAD_FOLDER + file.getOriginalFilename());
            Files.write(path, bytes);
        }catch (IOException e){
            e.printStackTrace();
        }

        Song savedSong = songRepo.save(song);
        //savedSong.setAudio(song.getAudio()) = path;
        return "Saved song...";
    }

    @PutMapping(value = "api/song/update/{id}")
    public String updateSong(@PathVariable UUID id, @RequestBody Song song){
        Song updatedSong = songRepo.findById(id).get();

        updatedSong.setTitle(song.getTitle());
        updatedSong.setArtist(song.getArtist());
        updatedSong.setYear(song.getYear());

        songRepo.save(updatedSong);
        return "Updated Song...";
    }

    @DeleteMapping(value = "api/song/delete/{id}")
    public String deleteSong(@PathVariable UUID id){
        Song deletedSong = songRepo.findById(id).get();
        songRepo.delete(deletedSong);
        return "Deleted Song with the id "+id;
    }
}
