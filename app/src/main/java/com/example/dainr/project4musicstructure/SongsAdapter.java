package com.example.dainr.project4musicstructure;

import android.content.Context;
import android.support.annotation.NonNull;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;


import java.util.ArrayList;

//class declaration to specify that the SongsAdapter extends or inherits behavior from the ArrayAdapter class.
//Adapter will map song info to listView
class SongsAdapter extends ArrayAdapter<Songs>{
    SongsAdapter(Context context, ArrayList<Songs> song) {
        super(context, 0,song);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;
        if(listItemView == null) {
            //The inflator is used to map the song name and artist name to the TextView in the
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.songs_list, parent, false);
        }
        //Get Songs object located at this position in the list
        Songs currentSongs = getItem(position);

        //Find the TextView in the song_list xml layout with the TextView ID
        TextView songNameTextView = listItemView.findViewById(R.id.songName);

        // get the artist name from the {currentSongs} object and set this text on the artistName TextView
        assert currentSongs != null;

        //get song name
        songNameTextView.setText(currentSongs.getsongName());

        //Find the TextView in the songs_list xml layout with the TextView ID
        TextView artistNameTextView = listItemView.findViewById(R.id.artistName);

        //get artist name
        artistNameTextView.setText(currentSongs.getartistName());

        //return the whole list item layout so that it can be shown in the listView
        return listItemView;
    }
}
