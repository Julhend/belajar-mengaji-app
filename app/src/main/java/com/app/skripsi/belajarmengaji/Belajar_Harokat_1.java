package com.app.skripsi.belajarmengaji;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageButton;


public class Belajar_Harokat_1 extends Activity {
    protected void onCreate(Bundle savedInstanceState) {
        ImageButton next_button;
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_harokat);
        final MediaPlayer SuaraButton = MediaPlayer.create(this, R.raw.button);
        ImageButton ButtonBelajar = (ImageButton)this.findViewById(R.id.harokat_fathah);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        ButtonBelajar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                SuaraButton.start();
            }
        });

        //Button Berpindah Actvity
        next_button = (ImageButton) findViewById(R.id.harokat_fathah);
        next_button.setOnClickListener(new View.OnClickListener() {

            /*Perpindahan ke Main Belajar apabila di klik Button belajar */
            public void onClick(View v) {

                // TODO Auto-generated method stub
                SuaraButton.start(); // Membuat suara button
                Intent explicit_intent = new Intent(Belajar_Harokat_1.this,
                        Belajar_Harokat_Fathah.class); //Tujuan Class
                startActivity(explicit_intent);
            }
        });

        //Button Berpindah Actvity
        next_button = (ImageButton) findViewById(R.id.harokat_kasroh);
        next_button.setOnClickListener(new View.OnClickListener() {

            /*Perpindahan ke Main Belajar apabila di klik Button belajar */
            public void onClick(View v) {

                // TODO Auto-generated method stub
                SuaraButton.start(); // Membuat suara button
                Intent explicit_intent = new Intent(Belajar_Harokat_1.this,
                        Belajar_Harokat_Kasroh.class); //Tujuan Class
                startActivity(explicit_intent);
            }
        });
        //Button Berpindah Actvity
        next_button = (ImageButton) findViewById(R.id.harokat_dhomah);
        next_button.setOnClickListener(new View.OnClickListener() {

            /*Perpindahan ke Main Belajar apabila di klik Button belajar */
            public void onClick(View v) {

                // TODO Auto-generated method stub
                SuaraButton.start(); // Membuat suara button
                Intent explicit_intent = new Intent(Belajar_Harokat_1.this,
                        Belajar_Harokat_Dhomah.class); //Tujuan Class
                startActivity(explicit_intent);
            }
        });

        //Button Berpindah Actvity
        next_button = (ImageButton) findViewById(R.id.back);
        next_button.setOnClickListener(new View.OnClickListener() {
            /*Perpindahan ke Main Belajar apabila di klik Button belajar */
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent explicit_intent = new Intent(Belajar_Harokat_1.this,
                        Main_Belajar.class); //Tujuan Class
                startActivity(explicit_intent);
            }

        });

    }
}
