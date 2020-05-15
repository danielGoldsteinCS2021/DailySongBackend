package com.example.DailySong.dao;
import com.example.DailySong.model.Song;
import java.util.UUID;

public interface SongDao {
    int insertSong(Song song);
    default int addPerson(Song song){
        return insertSong(song);
    }
}
