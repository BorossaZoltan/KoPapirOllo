package com.example.kopapirollo;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
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


    Button btnKo, btnPapir, btnOllo;
    TextView embipont, compipont;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img = findViewById(R.id.enKepem);
        gimg = findViewById(R.id.gepKepe);

        btnKo = findViewById(R.id.btnKo);
        btnPapir = findViewById(R.id.btnPapir);
        btnOllo = findViewById(R.id.btnOllo);
        embipont = findViewById(R.id.emberEredmeny);
        compipont = findViewById(R.id.computerEredmeny);

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
                jatekVege();
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
                jatekVege();

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
                jatekVege();

            }
        });


    }

    public void jatekVege() {
        embipont = findViewById(R.id.emberEredmeny);
        compipont = findViewById(R.id.computerEredmeny);
        if (emberPont == 3 || computerPont == 3){
            AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
            builder.setMessage("Szeretne új játékot játszani?")
                    .setPositiveButton("Igen", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            emberPont = 0;
                            computerPont = 0;
                            embipont.setText("0");
                            compipont.setText("0");
                            img.setImageResource(R.drawable.rock);
                            gimg.setImageResource(R.drawable.rock);

                        }
                    }).setNegativeButton("Nem", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    System.exit(0);
                }
            });
            AlertDialog alert = builder.create();
            alert.show();

        }
    }
}