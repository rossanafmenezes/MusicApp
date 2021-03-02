package com.example.musicapp;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        TextView favorites = (TextView) findViewById(R.id.favorites);

        favorites.setOnClickListener (new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent favoritesIntent = new Intent(MainActivity.this, FavoritesActivity.class);

                startActivity(favoritesIntent);
            }
        });

        TextView songsoftheyear = (TextView) findViewById(R.id.songsOfTheYear);

        songsoftheyear.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent songsOfTheYearIntent = new Intent(MainActivity.this, SongsOfTheYearActivity.class);

                startActivity(songsOfTheYearIntent);
            }
        });

        TextView workout = (TextView) findViewById(R.id.workoutSongs);

        workout.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent workoutIntent = new Intent(MainActivity.this, WorkoutActivity.class);

                startActivity(workoutIntent);
            }
        });

        TextView dailyMix = (TextView) findViewById(R.id.dailyMix);

        dailyMix.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent dailyMixIntent = new Intent(MainActivity.this, DailyMixActivity.class);

                startActivity(dailyMixIntent);
            }
        });
    }

}

