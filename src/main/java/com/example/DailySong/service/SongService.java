package com.example.DailySong.service;
import com.example.DailySong.dao.SongDataAccessService;
import com.example.DailySong.model.Song;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class SongService {
    private final SongDataAccessService songDataObject;

    @Autowired
    public SongService(@Qualifier("songDaoQ")  SongDataAccessService obj){
        this.songDataObject = obj;
    }
    public void addSong(Song song){
        songDataObject.insertSong(song);
    }
    public Song getRandomSong(){
        return songDataObject.selectRandomSong();
    }
}
