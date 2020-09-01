package com.example.DailySong.dao;
import com.example.DailySong.model.Song;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;

public interface SongDao extends MongoRepository<Song, String> {
    List<Song> findAllByGenreContains(String[] genre);
}
