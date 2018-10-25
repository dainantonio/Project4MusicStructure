package com.example.dainr.project4musicstructure;

//We create an instance of a single album using a class. This class will model the data for the audio file(song name and artist name)

public class Songs {
    //class declaration with 2 instance variables for the song
    private final String songName;
    private final String artistName;

    // constructor method in which we instantiate the instance variables
    public Songs(String songName,String artistName){
        this.songName = songName;
        this.artistName = artistName;
    }

    // get methods for the instance variables
    public String getsongName() {
        return songName;
    }

    // getartistName Method will return a String artistName
    public String getartistName() {
        return artistName;
    }
}
