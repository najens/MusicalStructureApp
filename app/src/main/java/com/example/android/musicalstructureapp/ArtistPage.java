package com.example.android.musicalstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import static com.example.android.musicalstructureapp.R.id.coldplay_artist1_textview;
import static com.example.android.musicalstructureapp.R.id.coldplay_artist2_textview;
import static com.example.android.musicalstructureapp.R.id.coldplay_artist3_textview;
import static com.example.android.musicalstructureapp.R.id.coldplay_artist4_textview;
import static com.example.android.musicalstructureapp.R.id.coldplay_image1_imageview;
import static com.example.android.musicalstructureapp.R.id.coldplay_image2_imageview;
import static com.example.android.musicalstructureapp.R.id.coldplay_image3_imageview;
import static com.example.android.musicalstructureapp.R.id.coldplay_image4_imageview;
import static com.example.android.musicalstructureapp.R.id.coldplay_song1_textview;
import static com.example.android.musicalstructureapp.R.id.coldplay_song2_textview;
import static com.example.android.musicalstructureapp.R.id.coldplay_song3_textview;
import static com.example.android.musicalstructureapp.R.id.coldplay_song4_textview;

public class ArtistPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artist_page);

        // Find the view that shows the song 1 image
        ImageView img1 = (ImageView) findViewById(coldplay_image1_imageview);

        // Set a click listener on that view
        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Display a toast rather than create a new intent to open the {@link Now Playing Activity}
                Toast.makeText(ArtistPage.this, getString(R.string.play_song1_toast), Toast.LENGTH_SHORT).show();
            }
        });

        // Find the view that shows the song 1 title
        TextView song1 = (TextView) findViewById(coldplay_song1_textview);

        // Set a click listener on that view
        song1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Display a toast rather than create a new intent to open the {@link Now Playing Activity}
                Toast.makeText(ArtistPage.this, getString(R.string.play_song1_toast), Toast.LENGTH_SHORT).show();
            }
        });

        // Find the view that shows the song 1 artist
        TextView song1artist = (TextView) findViewById(coldplay_artist1_textview);

        // Set a click listener on that view
        song1artist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Display a toast rather than create a new intent to open the {@link Now Playing Activity}
                Toast.makeText(ArtistPage.this, getString(R.string.play_song1_toast), Toast.LENGTH_SHORT).show();
            }
        });

        // Find the view that shows the song 2 image
        ImageView img2 = (ImageView) findViewById(coldplay_image2_imageview);

        // Set a click listener on that view
        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Display a toast rather than create a new intent to open the {@link Now Playing Activity}
                Toast.makeText(ArtistPage.this, getString(R.string.play_song2_toast), Toast.LENGTH_SHORT).show();
            }
        });

        // Find the view that shows the song 2 title
        TextView song2 = (TextView) findViewById(coldplay_song2_textview);

        // Set a click listener on that view
        song2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Display a toast rather than create a new intent to open the {@link Now Playing Activity}
                Toast.makeText(ArtistPage.this, getString(R.string.play_song2_toast), Toast.LENGTH_SHORT).show();
            }
        });

        // Find the view that shows the song 1 artist
        TextView song2artist = (TextView) findViewById(coldplay_artist2_textview);

        // Set a click listener on that view
        song2artist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Display a toast rather than create a new intent to open the {@link Now Playing Activity}
                Toast.makeText(ArtistPage.this, getString(R.string.play_song2_toast), Toast.LENGTH_SHORT).show();
            }
        });

        // Find the view that shows the song 3 image
        ImageView img3 = (ImageView) findViewById(coldplay_image3_imageview);

        // Set a click listener on that view
        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Display a toast rather than create a new intent to open the {@link Now Playing Activity}
                Toast.makeText(ArtistPage.this, getString(R.string.play_song3_toast), Toast.LENGTH_SHORT).show();
            }
        });

        // Find the view that shows the song 3 title
        TextView song3 = (TextView) findViewById(coldplay_song3_textview);

        // Set a click listener on that view
        song3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Display a toast rather than create a new intent to open the {@link Now Playing Activity}
                Toast.makeText(ArtistPage.this, getString(R.string.play_song3_toast), Toast.LENGTH_SHORT).show();
            }
        });

        // Find the view that shows the song 3 artist
        TextView song3artist = (TextView) findViewById(coldplay_artist3_textview);

        // Set a click listener on that view
        song3artist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Display a toast rather than create a new intent to open the {@link Now Playing Activity}
                Toast.makeText(ArtistPage.this, getString(R.string.play_song3_toast), Toast.LENGTH_SHORT).show();
            }
        });

        // Find the view that shows the song 4 image
        ImageView img4 = (ImageView) findViewById(coldplay_image4_imageview);

        // Set a click listener on that view
        img4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Display a toast rather than create a new intent to open the {@link Now Playing Activity}
                Toast.makeText(ArtistPage.this, getString(R.string.play_song4_toast), Toast.LENGTH_SHORT).show();
            }
        });

        // Find the view that shows the song 4 title
        TextView song4 = (TextView) findViewById(coldplay_song4_textview);

        // Set a click listener on that view
        song4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Display a toast rather than create a new intent to open the {@link Now Playing Activity}
                Toast.makeText(ArtistPage.this, getString(R.string.play_song4_toast), Toast.LENGTH_SHORT).show();
            }
        });

        // Find the view that shows the song 4 artist
        TextView song4artist = (TextView) findViewById(coldplay_artist4_textview);

        // Set a click listener on that view
        song4artist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Display a toast rather than create a new intent to open the {@link Now Playing Activity}
                Toast.makeText(ArtistPage.this, getString(R.string.play_song4_toast), Toast.LENGTH_SHORT).show();
            }
        });

        // MENU BAR BUTTONS

        // Find the view that shows the Main Button
        Button mainButton = (Button) findViewById(R.id.artistpage_activity_main_btn);

        // Set a click listener on that view
        mainButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create a new intent to open the {@link NowPlaying Activity}
                Intent mainButtonIntent = new Intent(ArtistPage.this, MainActivity.class);

                // Start the new activity
                startActivity(mainButtonIntent);
            }
        });

        // Find the view that shows the Art Button
        Button artButton = (Button) findViewById(R.id.artistpage_activity_art_btn);

        // Set a click listener on that view
        artButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create a new intent to open the {@link NowPlaying Activity}
                Intent artButtonIntent = new Intent(ArtistPage.this, Artists.class);

                // Start the new activity
                startActivity(artButtonIntent);
            }
        });

        // Find the view that shows the Art Page Button
        Button artpageButton = (Button) findViewById(R.id.artistpage_activity_artpage_btn);

        // Set a click listener on that view
        artpageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create a new intent to open the {@link NowPlaying Activity}
                Intent artpageButtonIntent = new Intent(ArtistPage.this, ArtistPage.class);

                // Start the new activity
                startActivity(artpageButtonIntent);
            }
        });

        // Find the view that shows the Main Button
        Button nowplayButton = (Button) findViewById(R.id.artistpage_activity_nowplay_btn);

        // Set a click listener on that view
        nowplayButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create a new intent to open the {@link NowPlaying Activity}
                Intent nowplayButtonIntent = new Intent(ArtistPage.this, NowPlaying.class);

                // Start the new activity
                startActivity(nowplayButtonIntent);
            }
        });

        // Find the view that shows the Main Button
        Button payButton = (Button) findViewById(R.id.artistpage_activity_pay_btn);

        // Set a click listener on that view
        payButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create a new intent to open the {@link NowPlaying Activity}
                Intent payButtonIntent = new Intent(ArtistPage.this, Payment.class);

                // Start the new activity
                startActivity(payButtonIntent);
            }
        });
    }
}
