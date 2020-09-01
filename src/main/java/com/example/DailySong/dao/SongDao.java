package com.example.DailySong.dao;
import com.example.DailySong.model.Song;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.UUID;

public interface SongDao extends MongoRepository<Song, String> {
}
