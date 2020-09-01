package com.example.DailySong.model;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.Arrays;

@Document(collection = "DailySong")
public class Song {
    @Id
    private final String id;
    private final String title;
    private final String artist;
    private final String year;
    private final String web_url;
    private final String[] genre;


    public Song(@JsonProperty("_id") String id, @JsonProperty("genre") String[] genre,
                @JsonProperty("title") String title, @JsonProperty("artist") String artist,
                @JsonProperty("year") String year, @JsonProperty("web_url") String web_url){
        this.title = title;
        this.artist = artist;
        this.year = year;
        this.web_url = web_url;
        this.genre = genre;
        this.id = id;
    }

    public String getTitle() {
        return title;
    }
    public String getArtist(){
        return artist;
    }
    public String getYear(){ return year; }
    public String getWeb_url(){
        return web_url;
    }
    public String getId() { return id; }
    public String[] getGenre() { return genre; }

    @Override
    public String toString() {
        return "Title: "+getTitle()+'\n'+
                "Artist: "+getArtist()+'\n'+
                "Year: "+getYear()+'\n'+
                "Web_url: "+getWeb_url()+'\n'+
                "_id: "+getId()+'\n'+
                "Genre(s): "+Arrays.toString(getGenre()) +'\n';
    }
}