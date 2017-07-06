package com.adonohoe.justplaymusic;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class NowPlayingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);

        // Tapping the play button will either start the song or stop it if it's already playing
        Button playOrStopButton = (Button) findViewById(R.id.play_or_stop_button);
        playOrStopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(NowPlayingActivity.this, "Playing or stopping song", Toast.LENGTH_LONG).show();
            }
        });

        // Tapping Buy moves on to the payment screen
        Button buySongButton = (Button) findViewById(R.id.buy_song_button);
        buySongButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent buySongIntent = new Intent(NowPlayingActivity.this, PaymentActivity.class);
                startActivity(buySongIntent);
            }
        });
    }
}
