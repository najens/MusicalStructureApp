package com.example.android.musicalstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import static com.example.android.musicalstructureapp.R.id.buy_song;

public class Payment extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);

        // Find the view that shows the buy button
        Button buysong = (Button) findViewById(buy_song);

        // Set a click listener on that view
        buysong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Display a toast rather than create a new intent to open the {@link Braintree Client Activity}
                Toast.makeText(Payment.this, getString(R.string.braintree_toast), Toast.LENGTH_SHORT).show();
            }
        });

        // MENU BAR BUTTONS

        // Find the view that shows the Main Button
        Button mainButton = (Button) findViewById(R.id.payment_activity_main_btn);

        // Set a click listener on that view
        mainButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create a new intent to open the {@link NowPlaying Activity}
                Intent mainButtonIntent = new Intent(Payment.this, MainActivity.class);

                // Start the new activity
                startActivity(mainButtonIntent);
            }
        });

        // Find the view that shows the Art Button
        Button artButton = (Button) findViewById(R.id.payment_activity_art_btn);

        // Set a click listener on that view
        artButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create a new intent to open the {@link NowPlaying Activity}
                Intent artButtonIntent = new Intent(Payment.this, Artists.class);

                // Start the new activity
                startActivity(artButtonIntent);
            }
        });

        // Find the view that shows the Art Page Button
        Button artpageButton = (Button) findViewById(R.id.payment_activity_artpage_btn);

        // Set a click listener on that view
        artpageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create a new intent to open the {@link NowPlaying Activity}
                Intent artpageButtonIntent = new Intent(Payment.this, ArtistPage.class);

                // Start the new activity
                startActivity(artpageButtonIntent);
            }
        });

        // Find the view that shows the Main Button
        Button nowplayButton = (Button) findViewById(R.id.payment_activity_nowplay_btn);

        // Set a click listener on that view
        nowplayButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create a new intent to open the {@link NowPlaying Activity}
                Intent nowplayButtonIntent = new Intent(Payment.this, NowPlaying.class);

                // Start the new activity
                startActivity(nowplayButtonIntent);
            }
        });

        // Find the view that shows the Main Button
        Button payButton = (Button) findViewById(R.id.payment_activity_pay_btn);

        // Set a click listener on that view
        payButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create a new intent to open the {@link NowPlaying Activity}
                Intent payButtonIntent = new Intent(Payment.this, Payment.class);

                // Start the new activity
                startActivity(payButtonIntent);
            }
        });
    }
}
