/*
Cameron Biel
UNIVERSITY OF PITTSBURGH AT BRADFORD
FALL 2020
 */
import java.util.Hashtable;

public class SongCollection {   //Song collection holds all of the information for the songs in the library
    //attribute
    private String name;
    private Hashtable<String, Song> songs;

    //constructor
    public SongCollection(String name) {
        this.name = name;
        songs = new Hashtable<String, Song>();
    }

    //getters
    public Hashtable getSongs(){
        return songs;
    }

    public String getName() {
        return this.name;
    }

    //setters
    public void setName(String name){
        this.name = name;
    }

    //methods
    public Song lookUpSong(String title) {
        return this.songs.get(title);
    }

    public void addSong(Song song) { //This method adds songs to the library
        this.songs.put(song.getTitle(), song);
    }

    public void printSongs() {  //This method prints out the details for every song once the user has finished the library
        this.songs.forEach((title, song) -> {
            String artist = song.getArtist();
            String genre = song.getGenre();
            System.out.println("--------------------");
            System.out.println("Title: " + title);
            System.out.println("Artist: " + artist);
            System.out.println("Genre: " + genre);
            });

    }
}
