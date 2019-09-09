package com.example.soundboardtest;

import android.media.MediaPlayer;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final MediaPlayer bruh = MediaPlayer.create(this, R.raw.bruh_mom);
        final MediaPlayer cheese =  MediaPlayer.create(this, R.raw.cheesepizza);
        final MediaPlayer ping = MediaPlayer.create(this, R.raw.ping);
        final MediaPlayer cric = MediaPlayer.create(this,R.raw.cricket);
        Button bestBruh = (Button) this.findViewById(R.id.bestBruh);
        bestBruh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bruh.start();
            }
        });
        Button gay = (Button) findViewById(R.id.gay);
        gay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cheese.start();
            }
        });
        Button yes = (Button) this.findViewById(R.id.ping);
        yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ping.start();
            }
        });
        Button no = (Button) this.findViewById(R.id.cricbut);
        no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cric.start();
            }
        });


    }
}
