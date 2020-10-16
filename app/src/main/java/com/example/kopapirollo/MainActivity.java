package com.example.kopapirollo;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ImageView img;
    ImageView gimg;
    Random r;

    Integer[] kepek = {
            R.drawable.rock,
            R.drawable.paper,
            R.drawable.scissors
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img = findViewById(R.id.enKepem);
        gimg = findViewById(R.id.gepKepe);

        Button btnKo = findViewById(R.id.btnKo);
        Button btnPapir = findViewById(R.id.btnPapir);
        Button btnOllo = findViewById(R.id.btnOllo);

        r = new Random();

        btnKo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img.setImageResource(R.drawable.rock);
                gimg.setImageResource(kepek[r.nextInt(kepek.length)]);
            }



        });
        btnPapir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img.setImageResource(R.drawable.paper);
                gimg.setImageResource(kepek[r.nextInt(kepek.length)]);

            }
        });
        btnOllo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img.setImageResource(R.drawable.scissors);
                gimg.setImageResource(kepek[r.nextInt(kepek.length)]);

            }
        });



    }
}