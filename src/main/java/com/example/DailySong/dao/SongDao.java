package com.example.DailySong.dao;
import com.example.DailySong.model.Song;

import java.util.List;
import java.util.UUID;

public interface SongDao {
    void insertSong(Song song);
    Song selectRandomSong();
}
