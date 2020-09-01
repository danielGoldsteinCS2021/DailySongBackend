package com.example.DailySong.model;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;

@Document(collection = "DailySong")
public class Song {
    private final String title;
    private final String artist;
    private final String year;
    private final String web_url;
    @Id
    private final String id;

    public Song(@JsonProperty("_id") String id,
                @JsonProperty("title") String title, @JsonProperty("artist") String artist,
                @JsonProperty("year") String year, @JsonProperty("web_url") String web_url){
        this.title = title;
        this.artist = artist;
        this.year = year;
        this.web_url = web_url;
        this.id = id;
    }

    /*
        Didn't create any setters as user can only retrieve data for now
     */
    public String getTitle() {
        return title;
    }
    public String getArtist(){
        return artist;
    }
    public String getYear(){
        return year;
    }
    public String getWeb_url(){
        return web_url;
    }
    @Override
    public String toString() {
        return '\n'+this.title+'\n';
    }
}