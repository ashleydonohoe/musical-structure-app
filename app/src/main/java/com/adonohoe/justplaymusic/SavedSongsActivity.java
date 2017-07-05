package com.adonohoe.justplaymusic;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class SavedSongsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saved_songs);

        // After the user completes the authentication flow through the Spotifty app or WebView presented by the Android Spotify APK, then the user is taken to a list of their saved songs via the SavedSongsActivity
        TextView selectedSong = (TextView) findViewById(R.id.select_song_text_view);
        selectedSong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nowPlayingIntent = new Intent(SavedSongsActivity.this, NowPlayingActivity.class);
                startActivity(nowPlayingIntent);
            }
        });
    }
}
