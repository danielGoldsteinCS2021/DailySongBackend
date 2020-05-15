package com.example.DailySong.dao;
import com.example.DailySong.model.Song;

import java.util.List;
import java.util.UUID;

public interface SongDao {
    int insertSong(Song song);
    default int addPerson(Song song){
        return insertSong(song);
    }
    List<Song> selectAllSongs();
}
