/*
Cameron Biel
UNIVERSITY OF PITTSBURGH AT BRADFORD
FALL 2020
 */

public class Playlist extends SongCollection {  //Playlist is the child class of song collection
    //attributes
    private String description;

    //constructor
    public Playlist(String name, String description) {
        super(name);    // super takes the name attribute from songCollection
        this.description = description;
    }

    //getter
    public String getDescription(){
        return this.description;
    }

    //setter
    public void setDescription(String description)
    {
        this.description = description;
    }
}
