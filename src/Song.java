/*
Cameron Biel
UNIVERSITY OF PITTSBURGH AT BRADFORD
FALL 2020
 */

public class Song { //Song contains the various information for every song added to the library
    //attributes
    private String title;
    private String artist;
    private String genre;

    //constructor
    public Song(String title, String artist, String genre) {
        this.title = title;
        this.artist = artist;
        this.genre = genre;
    }

    //getters
    public String getTitle() {
        return this.title;
    }

    public String getArtist() {
        return this.artist;
    }

    public String getGenre(){
        return this.genre;
    }

    //setters
    public void setTitle(String title) {
        this.title = title;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
