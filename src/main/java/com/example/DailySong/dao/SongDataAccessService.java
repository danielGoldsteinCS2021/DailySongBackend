package com.example.DailySong.dao;

import com.example.DailySong.model.Song;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.*;

@Document(collection = "DailySong")
@Repository("songDaoQ")
public class SongDataAccessService {
    @Autowired
    private SongDao DB;
    private static int numOfEntry = 1;
    private static Random rand = new Random();


    public void insertSong(Song song) {
        numOfEntry++;
      //  DB.add(song); // different from tutorial - this area could cause errors
    }


    public Song selectRandomSong(){
        int songLocation = 0;
        System.out.println("BEFORE LOOP BEGINS");
        for (Song song : DB.findAll()) {
            System.out.println(song);
        }
        return DB.findAll().get(0);
    }
}
