package com.example.DailySong.service;
import com.example.DailySong.dao.SongDao;
import com.example.DailySong.model.Song;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class SongService {
    private final SongDao songDao;

    @Autowired
    public SongService(@Qualifier("songDao")  SongDao songDao){
        this.songDao = songDao;
    }
    public int addSong(Song song){
        return songDao.addPerson(song); // he uses inset i use add to avoid creating UUID - maybe should change for no
                                        // UUID
    }

}