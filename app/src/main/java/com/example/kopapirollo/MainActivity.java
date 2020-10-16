package com.example.kopapirollo;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.media.ImageReader;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ImageView img;
    ImageView gimg;
    Random r;
    int computerPont = 0;
    int emberPont = 0;

    String dontetlen = "Döntetlen";
    String onNyert = "Ön nyert!";
    String onVesztett = "Ön veszett!";
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
        TextView embipont = findViewById(R.id.emberEredmeny);
        TextView compipont = findViewById(R.id.computerEredmeny);

        r = new Random();

        btnKo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img.setImageResource(R.drawable.rock);
                int randomGeneralt = r.nextInt(kepek.length);
                gimg.setImageResource(kepek[randomGeneralt]);
                gimg.setTag(kepek[randomGeneralt]);
                Integer resource = (Integer) gimg.getTag();
                if (resource == R.drawable.rock){
                    Toast.makeText(getApplicationContext(), dontetlen, Toast.LENGTH_SHORT).show();
                }
                if (resource == R.drawable.paper){
                    Toast.makeText(getApplicationContext(), onVesztett, Toast.LENGTH_SHORT).show();
                    computerPont++;
                    compipont.setText(String.valueOf(computerPont));

                }
                if (resource == R.drawable.scissors){
                    Toast.makeText(getApplicationContext(), onNyert, Toast.LENGTH_SHORT).show();
                    emberPont++;
                    embipont.setText(String.valueOf(emberPont));
                }

            }



        });
        btnPapir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img.setImageResource(R.drawable.paper);
                int randomGeneralt = r.nextInt(kepek.length);
                gimg.setImageResource(kepek[randomGeneralt]);
                gimg.setTag(kepek[randomGeneralt]);
                Integer resource = (Integer) gimg.getTag();
                if (resource == R.drawable.rock){
                    Toast.makeText(getApplicationContext(), onNyert, Toast.LENGTH_SHORT).show();
                    emberPont++;
                    embipont.setText(String.valueOf(emberPont));
                }
                if (resource == R.drawable.paper){
                    Toast.makeText(getApplicationContext(), dontetlen, Toast.LENGTH_SHORT).show();
                }
                if (resource == R.drawable.scissors){
                    Toast.makeText(getApplicationContext(), onVesztett, Toast.LENGTH_SHORT).show();
                    computerPont++;
                    compipont.setText(String.valueOf(computerPont));
                }

            }
        });
        btnOllo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img.setImageResource(R.drawable.scissors);
                int randomGeneralt = r.nextInt(kepek.length);
                gimg.setImageResource(kepek[randomGeneralt]);
                gimg.setTag(kepek[randomGeneralt]);
                Integer resource = (Integer) gimg.getTag();
                if (resource == R.drawable.rock){
                    Toast.makeText(getApplicationContext(), onVesztett, Toast.LENGTH_SHORT).show();
                    computerPont++;
                    compipont.setText(String.valueOf(computerPont));
                }
                if (resource == R.drawable.paper){
                    Toast.makeText(getApplicationContext(), onNyert, Toast.LENGTH_SHORT).show();
                    emberPont++;
                    embipont.setText(String.valueOf(emberPont));
                }
                if (resource == R.drawable.scissors){
                    Toast.makeText(getApplicationContext(), dontetlen, Toast.LENGTH_SHORT).show();
                }

            }
        });



    }
}