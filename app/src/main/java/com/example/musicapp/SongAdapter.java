package com.example.musicapp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class SongAdapter extends ArrayAdapter<Song> {

    public SongAdapter (Activity context, ArrayList<Song> songs) {

        super(context, 0, songs);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Song currentSong = getItem(position);

        TextView bandTextView = (TextView) listItemView.findViewById(R.id.Band_text_view);

        bandTextView.setText(currentSong.getBandName());

        TextView songTextView = (TextView) listItemView.findViewById(R.id.Song_text_view);
        songTextView.setText(currentSong.getSongName());

        return listItemView;
    }

}



