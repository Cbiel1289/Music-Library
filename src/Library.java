/*
Cameron Biel
UNIVERSITY OF PITTSBURGH AT BRADFORD
FALL 2020
 */
import java.io.IOException;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.Scanner;
import java.nio.file.*;
import java.io.*;


public class Library {  //Creating the library to hold songs and playlist information
    // attributes
    private String ownerName;
    private SongCollection home;
    private Hashtable<String, Playlist> playlists;

    //constructor
    public Library (String ownerName) {
        this.ownerName = ownerName;
        this.home = new SongCollection("home");
        this.playlists = new Hashtable<String, Playlist>();
    }

    //getters
    public String getOwnerName(){ //getter for the owner name of playlist
        return this.ownerName;
    }

    public SongCollection getHome(){  //getter for the collection of songs
        return this.home;
    }

    //methods
    public void uploadDemoSongs() {
        Path file = Paths.get("./demo_songs.txt");   // This method reads the lines from the text file demo_songs.txt and adds them to the user library
        InputStream input = null;

        try {
            input = Files.newInputStream(file);
            BufferedReader reader = new BufferedReader(new InputStreamReader(input)); //Creates a new buffered reader
            String s = null;
            System.out.println("Demo songs were added to the library.");

            while ((s = reader.readLine()) != null) {
                String songDetails[] = s.split(","); //the song details are split with a ','
                String title = songDetails[0]; //This line and the next 2 are reading from the text file to get to information for song, artist and genre
                String artist = songDetails[1]; //artist info from text file
                String genre = songDetails[2]; //genre info from text file
                //    System.out.println(Arrays.toString(songDetails));   Lists all songs in the array
                Song song = new Song(title, artist, genre);
                this.home.addSong(song);
            }
            input.close();
        }
        catch (IOException e) {
            System.out.println(e);
        }
    }

    public Playlist createPlaylist(Scanner inputDevice) { // This method allows the user to create a playlist, while adding in various information regarding songs,artists and more.
    System.out.print("What is the name of the playlist?: ");
    String name = inputDevice.nextLine();
    System.out.print("Please give a description: ");
    String description = inputDevice.nextLine();
    Playlist playlist = new Playlist(name, description); // creates a new playlist with the information the user provided.
    char addAnother = 'n'; //For adding more playlists

    do { //This do while loop will take user inputs as long as the user chooses to keep adding playlists.
        System.out.println("Lets add a song to the " + name + " playlist"); //Name is saved from earlier when the user inputs it at the start of the process.
        System.out.print("Enter song name: ");
        String title = inputDevice.nextLine();
        System.out.print("Enter artist name: ");
        String artist = inputDevice.nextLine();
        System.out.print("Enter genre: ");
        String genre = inputDevice.nextLine();
        System.out.print("Would you like to add another song to " + name + " playlist? (y/n) ");
        addAnother = inputDevice.nextLine().charAt(0); //adding another playlist
       Song song = new Song(title, artist, genre); //creating a new song with the information the user provided
       playlist.addSong(song); //adding the new song to the playlist
    }
    while(Character.toLowerCase(addAnother) == 'y'); // loop repeats if the user chooses 'y' for yes.
    return playlist;
    }

    public void addPlaylist(Playlist playlist){ //this allows playlists to be added with the information for the songs
        this.playlists.put(playlist.getName(), playlist);
        playlist.getSongs().forEach((title, song) -> {
            this.home.addSong((Song) song);

        });
    }

    public Hashtable<String, Playlist> getPlaylists() { //creates hashtable for playlists
        return playlists;
    }

    public void printLibrary() { //this prints out all of the information that the user input and displays in a clean, easy to read format.
        System.out.println("\nLIBRARY OWNER: " + ownerName); //uses the name that the user specified for owner name
        System.out.println("\nSONGS IN LIBRARY: " );
        this.home.printSongs(); //lists all of the songs that were added by the user, including demo songs
       this.playlists.forEach((name, playlist) -> { // each playlist is listed after one another
           System.out.println("\nPLAYLIST NAME: " + playlist.getName()); //states name of playlist based on user input
           System.out.println("PLAYLIST DESCRIPTION: " + playlist.getDescription()); //states name of description of playlist based on user input
        playlist.printSongs();
       });



    }
}
