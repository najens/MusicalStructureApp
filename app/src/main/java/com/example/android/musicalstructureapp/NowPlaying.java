package com.example.android.musicalstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class NowPlaying extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);

        ImageView ham = (ImageView) findViewById(R.id.hamburger_imageview);

        ham.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(NowPlaying.this, Pop.class));
            }
        });

        // Find the view that shows the previous song button
        ImageView previoussong = (ImageView) findViewById(R.id.previous_song_imageview);

        // Set a click listener on that view
        previoussong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Display a toast rather than create a new intent to play the previous song
                Toast.makeText(NowPlaying.this, getString(R.string.play_previous_string), Toast.LENGTH_SHORT).show();
            }
        });

        // Find the view that shows the play button
        ImageView playsong = (ImageView) findViewById(R.id.play_imageview);

        // Set a click listener on that view
        playsong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Display a toast rather than create a new intent to play or pause the current song
                Toast.makeText(NowPlaying.this, getString(R.string.play_pause_toast), Toast.LENGTH_SHORT).show();
            }
        });

        // Find the view that shows the next song button
        ImageView nextsong = (ImageView) findViewById(R.id.next_song_imageview);

        // Set a click listener on that view
        nextsong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Display a toast rather than create a new intent to play the next song
                Toast.makeText(NowPlaying.this, getString(R.string.play_next_toast), Toast.LENGTH_SHORT).show();
            }
        });

        // MENU BAR BUTTONS

        // Find the view that shows the Main Button
        Button mainButton = (Button) findViewById(R.id.nowplaying_activity_main_btn);

        // Set a click listener on that view
        mainButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create a new intent to open the {@link NowPlaying Activity}
                Intent mainButtonIntent = new Intent(NowPlaying.this, MainActivity.class);

                // Start the new activity
                startActivity(mainButtonIntent);
            }
        });

        // Find the view that shows the Art Button
        Button artButton = (Button) findViewById(R.id.nowplaying_activity_art_btn);

        // Set a click listener on that view
        artButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create a new intent to open the {@link NowPlaying Activity}
                Intent artButtonIntent = new Intent(NowPlaying.this, Artists.class);

                // Start the new activity
                startActivity(artButtonIntent);
            }
        });

        // Find the view that shows the Art Page Button
        Button artpageButton = (Button) findViewById(R.id.nowplaying_activity_artpage_btn);

        // Set a click listener on that view
        artpageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create a new intent to open the {@link NowPlaying Activity}
                Intent artpageButtonIntent = new Intent(NowPlaying.this, ArtistPage.class);

                // Start the new activity
                startActivity(artpageButtonIntent);
            }
        });

        // Find the view that shows the Main Button
        Button nowplayButton = (Button) findViewById(R.id.nowplaying_activity_nowplay_btn);

        // Set a click listener on that view
        nowplayButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create a new intent to open the {@link NowPlaying Activity}
                Intent nowplayButtonIntent = new Intent(NowPlaying.this, NowPlaying.class);

                // Start the new activity
                startActivity(nowplayButtonIntent);
            }
        });

        // Find the view that shows the Main Button
        Button payButton = (Button) findViewById(R.id.nowplaying_activity_pay_btn);

        // Set a click listener on that view
        payButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create a new intent to open the {@link NowPlaying Activity}
                Intent payButtonIntent = new Intent(NowPlaying.this, Payment.class);

                // Start the new activity
                startActivity(payButtonIntent);
            }
        });
    }
}
