package com.example.DailySong.service;
import com.example.DailySong.dao.SongDataAccessService;
import com.example.DailySong.model.Song;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Random;

@Service
public class SongService {
    private final SongDataAccessService songDataAccessServiceObject;

    @Autowired
    public SongService(@Qualifier("songDaoQualifier")  SongDataAccessService dao){
        this.songDataAccessServiceObject = dao;
    }
    public void addSong(Song song){
        songDataAccessServiceObject.insertSong(song);
    }
    public Song getRandomSong(String genre){
        List<Song> songsForGenre = songDataAccessServiceObject.getAllSongsForGenre(genre);
        Random randObject = new Random();
        return songsForGenre.get(randObject.nextInt(songsForGenre.size()));
    }
}
