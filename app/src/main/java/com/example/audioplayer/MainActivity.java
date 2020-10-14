package com.example.audioplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
     MediaPlayer mediaPlayer;
     Button play,pause,reset;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mediaPlayer= MediaPlayer.create(this,R.raw.joshturner);
        play=(Button)findViewById(R.id.button_play);
        pause=(Button)findViewById(R.id.button_pause);
        reset=(Button)findViewById(R.id.button_reset);
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                mediaPlayer.start();
            }
        });
        pause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                mediaPlayer.pause();
            }
        });
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                mediaPlayer.reset();

            }
        });
    }
}