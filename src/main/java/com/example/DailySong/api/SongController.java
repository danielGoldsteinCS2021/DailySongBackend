package com.example.DailySong.api;

import com.example.DailySong.model.Song;
import com.example.DailySong.service.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("api/v1/song")
@RestController
public class SongController {
    private final SongService songService;

    @Autowired
    public SongController(SongService songService){
        this.songService = songService;
    }
    @PostMapping
    public void addSong(@RequestBody Song song){
        songService.addSong(song);
    }
}
