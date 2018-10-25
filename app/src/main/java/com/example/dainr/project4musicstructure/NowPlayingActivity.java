package com.example.dainr.project4musicstructure;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class NowPlayingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_items);

        // Create an ArrayList of Songs; instantiated here
        ArrayList<Songs> song = new ArrayList<Songs>();
        song.add(new Songs("Black is beautiful", "Chronix"));
        song.add(new Songs("Christina", "Chronix"));
        song.add(new Songs("Country Bwoy", "Chronix"));
        song.add(new Songs("Ghetto Paradise", "Chronix"));
        song.add(new Songs("I know love", "Chronix"));
        song.add(new Songs("Legend", "Chronix"));
        song.add(new Songs("Lonliness","Chronix" ));
        song.add(new Songs("Selassie Children", "Chronix"));
        song.add(new Songs("Skankin Sweet", "Chronix"));
        song.add(new Songs("Spanish Town Rockin' ", "Chronix"));
        song.add(new Songs("Tell me", "Chronix"));

        // Create an {@link ArrayAdapter}, whose data source is a list of Strings. The
        // adapter knows how to create layouts for each item in the list, using the
        // list_item_xml layout resource defined in the Android framework.
        // This list item layout contains a single {@link TextView}, which the adapter will set to
        // display a single word.
        SongsAdapter adapter= new SongsAdapter(this, song);


        // The songs stored in the list will be displayed in the ListView instance in the list_items xml layout
        ListView listView = findViewById(R.id.list);

        // Make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the
        // {@link ListView} will display list items for each song name in the list of songs.
        // Do this by calling the setAdapter method on the {@link ListView} object and pass in
        // 1 argument, which is the {@link ArrayAdapter} with the variable name itemsAdapter.
        listView.setAdapter(adapter);
    }

}
