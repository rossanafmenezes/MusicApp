package com.example.musicapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class DailyMixActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.music_list);

        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song ("Beds are Burning", "Midnight Oil"));
        songs.add( new Song ("Another one bites the dust", "Queen"));
        songs.add(new Song ("Bleeding Eyes", "Masterplan"));
        songs.add(new Song ("Wake me up", "Avicii"));
        songs.add(new Song ("Fuel", "Metallica"));
        songs.add(new Song("I'm Looking Through you", "The Beatles"));

        SongAdapter adapter = new SongAdapter(this, songs);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

        Button playNext = findViewById(R.id.playNext);

        playNext.setOnClickListener (new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Intent favoriteSongs = new Intent(DailyMixActivity.this, FavoritesActivity.class);

                startActivity(favoriteSongs);
            }
        });

    }

}
