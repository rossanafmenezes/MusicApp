package com.example.musicapp;

public class Song {

    private String mSongName;

    private  String mBandName;

    public Song (String songName, String bandName) {

        mSongName = songName;
        mBandName = bandName;
    }

    public String getSongName() {

        return mSongName;
    }

    public String getBandName() {

        return mBandName;
    }
}
