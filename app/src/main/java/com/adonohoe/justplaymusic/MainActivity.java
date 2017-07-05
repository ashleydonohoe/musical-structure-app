package com.adonohoe.justplaymusic;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // After the user completes the authentication flow through the Spotifty app or WebView presented by the Android Spotify APK, then the user is taken to a list of their saved songs via the SavedSongsActivity
        Button spotifyLoginButton = (Button) findViewById(R.id.spotify_login_button);
        spotifyLoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent savedSongsIntent = new Intent(MainActivity.this, SavedSongsActivity.class);
                startActivity(savedSongsIntent);
            }
        });
    }
}
