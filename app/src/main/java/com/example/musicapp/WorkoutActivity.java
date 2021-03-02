package com.example.musicapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class WorkoutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.music_list);

        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song ("Amazed", "The Offspring"));
        songs.add( new Song ("Another one bites the dust", "Queen"));
        songs.add(new Song ("Blime", "Stina Talling"));
        songs.add(new Song ("La Isla Bonita", "Madonna"));
        songs.add(new Song ("Jeunesse Oubliee", "Tibz"));
        songs.add(new Song("Maniac (Feat. Eric Martin)", "Avantasia"));

        SongAdapter adapter = new SongAdapter(this, songs);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

        Button playNext = findViewById(R.id.playNext);

        playNext.setOnClickListener (new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Intent workout = new Intent(WorkoutActivity.this, DailyMixActivity.class);

                startActivity(workout);
            }
        });

    }
}

