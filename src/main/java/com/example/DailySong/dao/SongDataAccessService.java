package com.example.DailySong.dao;

import com.example.DailySong.model.Song;
import org.springframework.stereotype.Repository;
import java.util.Random;
import java.util.ArrayList;
import java.util.List;

import java.util.UUID;

@Repository("songDao")
public class SongDataAccessService implements SongDao{
    private static List<Song> DB = new ArrayList<>();
    private static int numOfEntry = DB.size();
    private static Random rand = new Random();

    @Override
    public void insertSong(Song song) {
        numOfEntry++;
        DB.add(song); // different from tutorial - this area could cause errors
    }

    @Override
    public Song selectRandomSong(){
        int songLocation = rand.nextInt(numOfEntry);
        return DB.get(songLocation);
    }
}
