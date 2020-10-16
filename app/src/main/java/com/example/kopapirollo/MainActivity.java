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

    ImageView img, gimg, gt1, gt2, gt3, jt1, jt2, jt3;
    Random r;
    int computerPont = 0;
    int emberPont = 0;
    int dontetlenPont = 0;

    String dontetlen = "Döntetlen";
    String onNyert = "Ön nyert!";
    String onVesztett = "Ön veszett!";
    Integer[] kepek = {
            R.drawable.rock,
            R.drawable.paper,
            R.drawable.scissors
    };


    Button btnKo, btnPapir, btnOllo;
    TextView embipont, compipont, dontetlenpont;
    Toast toast;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img = findViewById(R.id.enKepem);
        gimg = findViewById(R.id.gepKepe);
        gt1 = findViewById(R.id.gepSziv1);
        gt2 = findViewById(R.id.gepSziv2);
        gt3 = findViewById(R.id.gepSziv3);
        jt1 = findViewById(R.id.jatekosSziv1);
        jt2 = findViewById(R.id.jatekosSziv2);
        jt3 = findViewById(R.id.jatekosSziv3);



        btnKo = findViewById(R.id.btnKo);
        btnPapir = findViewById(R.id.btnPapir);
        btnOllo = findViewById(R.id.btnOllo);
        embipont = findViewById(R.id.emberEredmeny);
        compipont = findViewById(R.id.computerEredmeny);
        dontetlenpont = findViewById(R.id.dontetlenEredmeny);

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
                    toastMethod(dontetlen);
                    dontetlenPont++;
                    dontetlenpont.setText(String.valueOf(dontetlenPont));
                    //Toast.makeText(getApplicationContext(), dontetlen, Toast.LENGTH_SHORT).show();
                }
                if (resource == R.drawable.paper){
                    toastMethod(onVesztett);
                    //Toast.makeText(getApplicationContext(), onVesztett, Toast.LENGTH_SHORT).show();
                    computerPont++;
                    compipont.setText(String.valueOf(computerPont));
                    if (computerPont == 1){
                        jt1.setImageResource(R.drawable.heart1);
                    }
                    if (computerPont == 2){
                        jt2.setImageResource(R.drawable.heart1);
                    }
                    if (computerPont == 3){
                        jt3.setImageResource(R.drawable.heart1);
                    }

                }
                if (resource == R.drawable.scissors){
                    toastMethod(onNyert);
                    //Toast.makeText(getApplicationContext(), onNyert, Toast.LENGTH_SHORT).show();
                    emberPont++;
                    embipont.setText(String.valueOf(emberPont));
                    if (emberPont == 1){
                        gt1.setImageResource(R.drawable.heart1);
                    }
                    if (emberPont == 2){
                        gt2.setImageResource(R.drawable.heart1);
                    }
                    if (emberPont == 3){
                        gt3.setImageResource(R.drawable.heart1);
                    }
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
                    toastMethod(onNyert);
                    //Toast.makeText(getApplicationContext(), onNyert, Toast.LENGTH_SHORT).show();
                    emberPont++;
                    embipont.setText(String.valueOf(emberPont));
                    if (emberPont == 1){
                        gt1.setImageResource(R.drawable.heart1);
                    }
                    if (emberPont == 2){
                        gt2.setImageResource(R.drawable.heart1);
                    }
                    if (emberPont == 3){
                        gt3.setImageResource(R.drawable.heart1);
                    }

                }
                if (resource == R.drawable.paper){
                    toastMethod(dontetlen);
                    dontetlenPont++;
                    dontetlenpont.setText(String.valueOf(dontetlenPont));
                    //Toast.makeText(getApplicationContext(), dontetlen, Toast.LENGTH_SHORT).show();
                }
                if (resource == R.drawable.scissors){
                    toastMethod(onVesztett);
                    //Toast.makeText(getApplicationContext(), onVesztett, Toast.LENGTH_SHORT).show();
                    computerPont++;
                    compipont.setText(String.valueOf(computerPont));
                    if (computerPont == 1){
                        jt1.setImageResource(R.drawable.heart1);
                    }
                    if (computerPont == 2){
                        jt2.setImageResource(R.drawable.heart1);
                    }
                    if (computerPont == 3){
                        jt3.setImageResource(R.drawable.heart1);
                    }

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
                    toastMethod(onVesztett);
                    //Toast.makeText(getApplicationContext(), onVesztett, Toast.LENGTH_SHORT).show();
                    computerPont++;
                    compipont.setText(String.valueOf(computerPont));
                    if (computerPont == 1){
                        jt1.setImageResource(R.drawable.heart1);
                    }
                    if (computerPont == 2){
                        jt2.setImageResource(R.drawable.heart1);
                    }
                    if (computerPont == 3){
                        jt3.setImageResource(R.drawable.heart1);
                    }

                }
                if (resource == R.drawable.paper){
                    toastMethod(onNyert);
                    //Toast.makeText(getApplicationContext(), onNyert, Toast.LENGTH_SHORT).show();
                    emberPont++;
                    embipont.setText(String.valueOf(emberPont));
                    if (emberPont == 1){
                        gt1.setImageResource(R.drawable.heart1);
                    }
                    if (emberPont == 2){
                        gt2.setImageResource(R.drawable.heart1);
                    }
                    if (emberPont == 3){
                        gt3.setImageResource(R.drawable.heart1);
                    }

                }
                if (resource == R.drawable.scissors){
                    toastMethod(dontetlen);
                    dontetlenPont++;
                    dontetlenpont.setText(String.valueOf(dontetlenPont));
                    //Toast.makeText(getApplicationContext(), dontetlen, Toast.LENGTH_SHORT).show();
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
                            dontetlenPont = 0;
                            dontetlenpont.setText("0");
                            embipont.setText("0");
                            compipont.setText("0");
                            img.setImageResource(R.drawable.rock);
                            gimg.setImageResource(R.drawable.rock);
                            gt1.setImageResource(R.drawable.heart2);
                            gt2.setImageResource(R.drawable.heart2);
                            gt3.setImageResource(R.drawable.heart2);
                            jt1.setImageResource(R.drawable.heart2);
                            jt2.setImageResource(R.drawable.heart2);
                            jt3.setImageResource(R.drawable.heart2);

                        }
                    }).setNegativeButton("Nem", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    System.exit(0);
                }
            });
            AlertDialog alert = builder.create();
            alert.show();
            alert.setCanceledOnTouchOutside(false);

        }
    }
    public void toastMethod(String message){
        if (toast != null) {
            toast.cancel();
        }
        toast = Toast.makeText(getApplicationContext(), message, Toast.LENGTH_LONG);
        toast.show();
    }
}