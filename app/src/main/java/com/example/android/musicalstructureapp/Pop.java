package com.example.android.musicalstructureapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import static com.example.android.musicalstructureapp.R.id.buy_textview;
import static com.example.android.musicalstructureapp.R.id.download_textview;
import static com.example.android.musicalstructureapp.R.id.view_album_textview;
import static com.example.android.musicalstructureapp.R.id.view_artist_textview;

/**
 * Created by Nate on 9/19/2017.
 */

public class Pop extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.popupwindow);

        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width = dm.widthPixels;
        int height = dm.heightPixels;

        getWindow().setLayout((width), (int) (height * 0.31));


        // Find the view that shows the download text
        TextView downloadsong = (TextView) findViewById(download_textview);

        // Set a click listener on that view
        downloadsong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Display a toast rather than create a new intent to download the song
                Toast.makeText(Pop.this, getString(R.string.download_toast), Toast.LENGTH_SHORT).show();
            }
        });

        // Find the view that shows the buy song category
        TextView buysong = (TextView) findViewById(buy_textview);

        // Set a click listener on that view
        buysong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create a new intent to open the {@link Payment Activity}
                Intent buysongIntent = new Intent(Pop.this, Payment.class);

                // Start the new activity
                startActivity(buysongIntent);
            }
        });

        // Find the view that shows the view album category
        TextView albumpage = (TextView) findViewById(view_album_textview);

        // Set a click listener on that view
        albumpage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Display a toast rather than create a new intent to open the {@link Albums Activity}
                Toast.makeText(Pop.this, getString(R.string.view_album_toast), Toast.LENGTH_SHORT).show();
            }
        });

        // Find the view that shows the view artist category
        TextView artistpage = (TextView) findViewById(view_artist_textview);

        // Set a click listener on that view
        artistpage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create a new intent to open the {@link Artists Activity}
                Intent artistpageIntent = new Intent(Pop.this, ArtistPage.class);

                // Start the new activity
                startActivity(artistpageIntent);
            }
        });
    }
}
