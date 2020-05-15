package com.example.DailySong.dao;

import com.example.DailySong.model.Song;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository("songDao")
public class SongDataAccessService implements SongDao{

    private static List<Song> DB = new ArrayList<>();

    @Override
    public int insertSong(Song song) {
        DB.add(song); // different from tutorial - this area could cause errors
        return 1;
    }

    public List<Song> selectAllSongs(){
        return DB;
    }
}
