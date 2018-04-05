package com.example.android.musicalstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the view that shows the artists category
        TextView artists = (TextView) findViewById(R.id.artists_textview);

        // Set a click listener on that view
        artists.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create a new intent to open the {@link Artists Activity}
                Intent artistsIntent = new Intent(MainActivity.this, Artists.class);

                // Start the new activity
                startActivity(artistsIntent);
            }
        });

        // Find the view that shows the albums page
        TextView albums = (TextView) findViewById(R.id.albums_textview);

        // Set a click listener on that view
        albums.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Display a toast rather than create a new intent to open the {@link Albums Activity}
                Toast.makeText(MainActivity.this, getString(R.string.open_albums_toast), Toast.LENGTH_SHORT).show();
            }
        });

        // Find the view that shows the songs page
        TextView songs = (TextView) findViewById(R.id.songs_textview);

        // Set a click listener on that view
        songs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Display a toast rather than create a new intent to open the {@link Songs Activity}
                Toast.makeText(MainActivity.this, getString(R.string.open_songs_toast), Toast.LENGTH_SHORT).show();
            }
        });

        // Find the view that shows the playlists page
        TextView playlists = (TextView) findViewById(R.id.playlists_textview);

        // Set a click listener on that view
        playlists.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Display a toast rather than create a new intent to open the {@link Playlists Activity}
                Toast.makeText(MainActivity.this, getString(R.string.open_playlists_toast), Toast.LENGTH_SHORT).show();
            }
        });

        // Find the view that shows the now playing title
        TextView nowPlaying = (TextView) findViewById(R.id.now_playing_textview);

        // Set a click listener on that view
        nowPlaying.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create a new intent to open the {@link NowPlaying Activity}
                Intent nowPlayingIntent = new Intent(MainActivity.this, NowPlaying.class);

                // Start the new activity
                startActivity(nowPlayingIntent);
            }
        });

        // Find the view that shows the now playing image
        ImageView nowplayingimg = (ImageView) findViewById(R.id.now_playing_imageview);

        // Set a click listener on that view
        nowplayingimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create a new intent to open the {@link NowPlaying Activity}
                Intent nowplayingimgIntent = new Intent(MainActivity.this, NowPlaying.class);

                // Start the new activity
                startActivity(nowplayingimgIntent);
            }
        });

        // Find the view that shows the play button
        ImageView playbtn = (ImageView) findViewById(R.id.play_imageview);

        // Set a click listener on that view
        playbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Display a toast rather than create a new intent to play or pause the current song
                Toast.makeText(MainActivity.this, getString(R.string.play_pause_toast), Toast.LENGTH_SHORT).show();
            }
        });

        // Find the view that shows the next song button
        ImageView nextsong = (ImageView) findViewById(R.id.next_imageview);

        // Set a click listener on that view
        nextsong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Display a toast rather than create a new intent to play the next song
                Toast.makeText(MainActivity.this, getString(R.string.play_next_toast), Toast.LENGTH_SHORT).show();
            }
        });

        /**
         * MENU BAR BUTTONS
         */
        // Find the view that shows the Main Button
        Button mainButton = (Button) findViewById(R.id.main_activity_main_btn);

        // Set a click listener on that view
        mainButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create a new intent to open the {@link NowPlaying Activity}
                Intent mainButtonIntent = new Intent(MainActivity.this, MainActivity.class);

                // Start the new activity
                startActivity(mainButtonIntent);
            }
        });

        // Find the view that shows the Art Button
        Button artButton = (Button) findViewById(R.id.main_activity_art_btn);

        // Set a click listener on that view
        artButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create a new intent to open the {@link NowPlaying Activity}
                Intent artButtonIntent = new Intent(MainActivity.this, Artists.class);

                // Start the new activity
                startActivity(artButtonIntent);
            }
        });

        // Find the view that shows the Art Page Button
        Button artpageButton = (Button) findViewById(R.id.main_activity_artpage_btn);

        // Set a click listener on that view
        artpageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create a new intent to open the {@link NowPlaying Activity}
                Intent artpageButtonIntent = new Intent(MainActivity.this, ArtistPage.class);

                // Start the new activity
                startActivity(artpageButtonIntent);
            }
        });

        // Find the view that shows the Main Button
        Button nowplayButton = (Button) findViewById(R.id.main_activity_nowplay_btn);

        // Set a click listener on that view
        nowplayButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create a new intent to open the {@link NowPlaying Activity}
                Intent nowplayButtonIntent = new Intent(MainActivity.this, NowPlaying.class);

                // Start the new activity
                startActivity(nowplayButtonIntent);
            }
        });

        // Find the view that shows the Main Button
        Button payButton = (Button) findViewById(R.id.main_activity_pay_btn);

        // Set a click listener on that view
        payButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create a new intent to open the {@link NowPlaying Activity}
                Intent payButtonIntent = new Intent(MainActivity.this, Payment.class);

                // Start the new activity
                startActivity(payButtonIntent);
            }
        });
    }
}
