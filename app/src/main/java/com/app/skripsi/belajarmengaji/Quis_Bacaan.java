package com.app.skripsi.belajarmengaji;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;


public class Quis_Bacaan extends Activity {
    ImageButton next_button,exit;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bacaan);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        /*Button Berpindah ke Actvity Belajar */
        next_button = (ImageButton) findViewById(R.id.bacaan_hijaiyah);
        final Animation animScale = AnimationUtils.loadAnimation(this, R.anim.anim_alpha);

        //Untuk Menambahkan Button Suara
        final MediaPlayer SuaraButton = MediaPlayer.create(this, R.raw.button);
        ImageButton ButtonBelajar = (ImageButton) this.findViewById(R.id.bacaan_hijaiyah);
        ButtonBelajar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                SuaraButton.start();
            }
        });
        next_button = (ImageButton) findViewById(R.id.bacaan_hijaiyah);
        next_button.setOnClickListener(new View.OnClickListener() {

            /*Perpindahan ke Main Belajar apabila di klik Button belajar */
            public void onClick(View v) {

                // TODO Auto-generated method stub
                SuaraButton.start(); //Memanggil Suara Button
                v.startAnimation(animScale);
                Intent explicit_intent = new Intent(Quis_Bacaan.this,
                        Quis_Bacaan_Hijaiyah.class);
                startActivity(explicit_intent);
            }
        });

        next_button = (ImageButton) findViewById(R.id.bacaa_harokat);
        next_button.setOnClickListener(new View.OnClickListener() {

            /*Perpindahan ke Main Belajar apabila di klik Button belajar */
            public void onClick(View v) {

                // TODO Auto-generated method stub
                SuaraButton.start(); //Memanggil Suara Button
                v.startAnimation(animScale);
                Intent explicit_intent = new Intent(Quis_Bacaan.this,
                        Quis_Bacaan_Harokat.class);
                startActivity(explicit_intent);
            }
        });

        next_button = (ImageButton) findViewById(R.id.bacaan_tanwin);
        next_button.setOnClickListener(new View.OnClickListener() {

            /*Perpindahan ke Main Belajar apabila di klik Button belajar */
            public void onClick(View v) {

                // TODO Auto-generated method stub
                SuaraButton.start(); //Memanggil Suara Button
                v.startAnimation(animScale);
                Intent explicit_intent = new Intent(Quis_Bacaan.this,
                        Quis_Bacaan_Tanwin.class);
                startActivity(explicit_intent);
            }
        });


        //Button Berpindah Actvity
        next_button = (ImageButton) findViewById(R.id.back);
        next_button.setOnClickListener(new View.OnClickListener() {
            /*Perpindahan ke Main Belajar apabila di klik Button belajar */
            public void onClick(View v) {
                // TODO Auto-generated method stub
                SuaraButton.start(); // Membuat suara button
                Intent explicit_intent = new Intent(Quis_Bacaan.this,
                        Main.class); //Tujuan Class
                startActivity(explicit_intent);

            }

        });
    }
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            //preventing default implementation previous to android.os.Build.VERSION_CODES.ECLAIR
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }
}
