package com.example.DailySong.model;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;

@Document(collection = "DailySong")
public class Song {
    private UUID id; // not sure if it's the right type
    private String title;
    private String artist;
    private String year;
    private String web_url;

    /*
        Didn't create any setters yet just getters - plan is to only be able
        to retrieve data for now
     */
    public UUID getId(){
        return id; // again not sure if will work due to JSON type potentially being different
    }
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
}