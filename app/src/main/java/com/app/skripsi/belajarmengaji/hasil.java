package com.app.skripsi.belajarmengaji;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;



public class hasil extends Activity{
    ImageButton next;
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil);
        final MediaPlayer SuaraButton = MediaPlayer.create(this, R.raw.alif);

        /*Button Berpindah ke Actvity Belajar */
        next = (ImageButton) findViewById(R.id.kembali);
        next.setOnClickListener(new View.OnClickListener() {

            /*Perpindahan ke Main Belajar apabila di klik Button belajar */
            public void onClick(View v) {

                // TODO Auto-generated method stub
                SuaraButton.start(); //Memanggil Suara Button
                Intent explicit_intent = new Intent(hasil.this,
                        Main.class);
                startActivity(explicit_intent);
            }
        });
    }
}
