package com.example.dainr.project4musicstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // This will locate the now playing songs activity by the view id
        TextView nowPlaying = findViewById(R.id.nowPlaying);

        //the now playing textview will have a OnClicklistener on it
        nowPlaying.setOnClickListener (new View.OnClickListener(){

            //Method onClick is called when user clicks the TextView and code executed
            @Override
            public void onClick(View v) {

                // Explicit intent that calls to open now playing activity
                Intent nowplayingIntent = new Intent(MainActivity.this, NowPlayingActivity.class);
                // Start the new activity
                startActivity(nowplayingIntent);
            }
        });


        // This will locate the playlist activity by the view id
        TextView playlist = findViewById(R.id.playlist);

        //the playlist textview will have a OnClicklistener on it
        playlist.setOnClickListener(new View.OnClickListener(){

            //Method onClick is called when user clicks the TextView and code executed
            @Override
            public void onClick(View v) {

                // Explicit intent that calls to open playlistactivity
                Intent playlistIntent = new Intent(MainActivity.this, PlaylistActivity.class);
                // Start the new activity
                startActivity(playlistIntent);
            }
        });

        // This will locate the genre activity by the view id
        TextView genre = findViewById(R.id.genre);

        //the genre textview will have a OnClicklistener on it
        genre.setOnClickListener (new View.OnClickListener(){

            //Method onClick is called when user clicks the TextView and code executed
            @Override
            public void onClick(View v) {

                // Explicit intent that calls to open genreactivity
                Intent genreIntent = new Intent(MainActivity.this, GenreActivity.class);
                // Start the new activity
                startActivity(genreIntent);
            }
        });


        // This will locate the genre activity by the view id
        TextView album = findViewById(R.id.album);

        //the album textview will have a OnClicklistener on it
        album.setOnClickListener(new View.OnClickListener(){

            //Method onClick is called when user clicks the TextView and code executed
            @Override
            public void onClick(View v) {

                // Explicit intent that calls to open albumactivity
                Intent albumIntent = new Intent(MainActivity.this, AlbumActivity.class);
                // Start the new activity
                startActivity(albumIntent);
            }
        });

    }}

