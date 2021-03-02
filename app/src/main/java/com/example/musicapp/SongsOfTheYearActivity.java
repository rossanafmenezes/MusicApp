package com.example.musicapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class SongsOfTheYearActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.music_list);

        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song ("Blind Lights", "The Weekend"));
        songs.add( new Song ("Don't Start Now", "Dua Lipa"));
        songs.add(new Song ("Dance Monkey", "Tones and I"));
        songs.add(new Song ("WAP", "Cardi B"));
        songs.add(new Song ("The Box", "Roddy Ricch"));
        songs.add(new Song("Say So", "Doja Cat"));

        SongAdapter adapter = new SongAdapter(this, songs);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

        Button playNext = findViewById(R.id.playNext);

        playNext.setOnClickListener (new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Intent workout = new Intent(SongsOfTheYearActivity.this, WorkoutActivity.class);

                startActivity(workout);
            }
        });

    }

}

