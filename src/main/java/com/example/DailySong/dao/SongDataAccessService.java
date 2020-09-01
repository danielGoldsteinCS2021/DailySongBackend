package com.example.DailySong.dao;

import com.example.DailySong.model.Song;
import org.springframework.stereotype.Repository;
import java.util.*;


@Repository("songDaoQualifier")
public class SongDataAccessService {
    private final SongDao DB;

    public SongDataAccessService(SongDao db) {
        DB = db;
    }

    public void insertSong(Song song) {
        System.out.println("insert not ready "+song);
    }

    public List<Song> getAllSongsForGenre(String genre){
        return DB.findAllByGenreContains(new String[]{ genre });
    }
}
