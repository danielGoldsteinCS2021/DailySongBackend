package com.example.DailySong.api;

import com.example.DailySong.model.Song;
import com.example.DailySong.service.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.Document;
import java.util.List;

@RequestMapping("api/v1/song")
@RestController
public class SongController {
    private final SongService songService;

    @Autowired
    public SongController(SongService songService) {
        this.songService = songService;
    }

    @PostMapping
    public void addSong(@RequestBody Song song) {
        songService.addSong(song);
    }

    @GetMapping
    public String getRandomSong(@RequestParam String genre){
        // need to print the song!!
        System.out.println("\n\n\n"+genre+"\n\n\n");
        System.out.println(songService.getRandomSong().toString());
        return songService.getRandomSong().toString(); }
}