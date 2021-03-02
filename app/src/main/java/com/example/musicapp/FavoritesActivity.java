package com.example.musicapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class FavoritesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.music_list);

        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song ("one", "Metallica"));
        songs.add( new Song ("Letting Go", "Andre Matos"));
        songs.add(new Song ("Valhalla", "Blind Guardian"));
        songs.add(new Song ("Rainbow in the Dark", "Dio"));
        songs.add(new Song ("9-2-9", "Edguy"));
        songs.add(new Song("Terminated World", "Heaves's Gate"));
        songs.add(new Song("Father time", "Stratovarius"));
        songs.add(new Song("Mistery of a Blood Red Rose", "Avantasia"));
        songs.add(new Song("Aces High", "Iron Maiden"));
        songs.add( new Song("Sleeping Sun", "Nightwish"));

        SongAdapter adapter = new SongAdapter(this, songs);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

        Button playNext = findViewById(R.id.playNext);

        playNext.setOnClickListener (new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent songsOfTheYear = new Intent(FavoritesActivity.this, SongsOfTheYearActivity.class);

                startActivity(songsOfTheYear);
            }
        });

    }
}

