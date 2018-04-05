package com.example.android.musicalstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Artists extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artists);

        // Find the view that shows the coldplay artist page
        TextView coldplay = (TextView) findViewById(R.id.coldplay_textview);

        // Set a click listener on that view
        coldplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create a new intent to open the {@link ArtistPage}
                Intent artistPageIntent = new Intent(Artists.this, ArtistPage.class);

                // Start the new activity
                startActivity(artistPageIntent);
            }
        });

        // Find the view that shows the ed sheeran artist page
        TextView edsheeran = (TextView) findViewById(R.id.edsheeran_textview);

        // Set a click listener on that view
        edsheeran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Display a toast rather than create a new intent to open the {@link ArtistPage}
                Toast.makeText(Artists.this, getString(R.string.open_edsheeran_toast), Toast.LENGTH_SHORT).show();
            }
        });

        // Find the view that shows the james bay artist page
        TextView jamesbay = (TextView) findViewById(R.id.jamesbay_textview);

        // Set a click listener on that view
        jamesbay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Display a toast rather than create a new intent to open the {@link ArtistPage}
                Toast.makeText(Artists.this, getString(R.string.open_jamesbay_toast), Toast.LENGTH_SHORT).show();
            }
        });

        // Find the view that shows the john legend artist page
        TextView johnlegend = (TextView) findViewById(R.id.johnlegend_textview);

        // Set a click listener on that view
        johnlegend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Display a toast rather than create a new intent to open the {@link ArtistPage}
                Toast.makeText(Artists.this, getString(R.string.open_johnlegend_toast), Toast.LENGTH_SHORT).show();
            }
        });

        // MENU BAR BUTTONS

        // Find the view that shows the Main Button
        Button mainButton = (Button) findViewById(R.id.artists_activity_main_btn);

        // Set a click listener on that view
        mainButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create a new intent to open the {@link NowPlaying Activity}
                Intent mainButtonIntent = new Intent(Artists.this, MainActivity.class);

                // Start the new activity
                startActivity(mainButtonIntent);
            }
        });

        // Find the view that shows the Art Button
        Button artButton = (Button) findViewById(R.id.artists_activity_art_btn);

        // Set a click listener on that view
        artButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create a new intent to open the {@link NowPlaying Activity}
                Intent artButtonIntent = new Intent(Artists.this, Artists.class);

                // Start the new activity
                startActivity(artButtonIntent);
            }
        });

        // Find the view that shows the Art Page Button
        Button artpageButton = (Button) findViewById(R.id.artists_activity_artpage_btn);

        // Set a click listener on that view
        artpageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create a new intent to open the {@link NowPlaying Activity}
                Intent artpageButtonIntent = new Intent(Artists.this, ArtistPage.class);

                // Start the new activity
                startActivity(artpageButtonIntent);
            }
        });

        // Find the view that shows the Main Button
        Button nowplayButton = (Button) findViewById(R.id.artists_activity_nowplay_btn);

        // Set a click listener on that view
        nowplayButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create a new intent to open the {@link NowPlaying Activity}
                Intent nowplayButtonIntent = new Intent(Artists.this, NowPlaying.class);

                // Start the new activity
                startActivity(nowplayButtonIntent);
            }
        });

        // Find the view that shows the Main Button
        Button payButton = (Button) findViewById(R.id.artists_activity_pay_btn);

        // Set a click listener on that view
        payButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create a new intent to open the {@link NowPlaying Activity}
                Intent payButtonIntent = new Intent(Artists.this, Payment.class);

                // Start the new activity
                startActivity(payButtonIntent);
            }
        });
    }
}
