package com.app.skripsi.belajarmengaji;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageButton;


public class Belajar_Tanwin_1 extends Activity {
    ImageButton next_button;
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tanwin);
        final MediaPlayer SuaraButton = MediaPlayer.create(this, R.raw.button);
        ImageButton ButtonBelajar = (ImageButton)this.findViewById(R.id.tanwin_fathah);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        ButtonBelajar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                SuaraButton.start();
            }
        });

        //Button Berpindah Actvity
        next_button = (ImageButton) findViewById(R.id.tanwin_fathah);
        next_button.setOnClickListener(new View.OnClickListener() {

            /*Perpindahan ke Main Belajar apabila di klik Button belajar */
            public void onClick(View v) {

                // TODO Auto-generated method stub
                SuaraButton.start(); // Membuat suara button
                Intent explicit_intent = new Intent(Belajar_Tanwin_1.this,
                        Belajar_Tanwin_Fathah_Tain.class); //Tujuan Class
                startActivity(explicit_intent);
            }
        });

        //Button Berpindah Actvity
        next_button = (ImageButton) findViewById(R.id.tanwin_kasroh);
        next_button.setOnClickListener(new View.OnClickListener() {

            /*Perpindahan ke Main Belajar apabila di klik Button belajar */
            public void onClick(View v) {

                // TODO Auto-generated method stub
                SuaraButton.start(); // Membuat suara button
                Intent explicit_intent = new Intent(Belajar_Tanwin_1.this,
                        Belajar_Tanwin_Kasroh_Tain.class); //Tujuan Class
                startActivity(explicit_intent);
            }
        });

        //Button Berpindah Actvity
        next_button = (ImageButton) findViewById(R.id.tanwin_dhomah);
        next_button.setOnClickListener(new View.OnClickListener() {

            /*Perpindahan ke Main Belajar apabila di klik Button belajar */
            public void onClick(View v) {

                // TODO Auto-generated method stub
                SuaraButton.start(); // Membuat suara button
                Intent explicit_intent = new Intent(Belajar_Tanwin_1.this,
                        Belajar_Tanwin_Domah_Tain.class); //Tujuan Class
                startActivity(explicit_intent);
            }
        });

        //Button Berpindah Actvity
        next_button = (ImageButton) findViewById(R.id.back);
        next_button.setOnClickListener(new View.OnClickListener() {
            /*Perpindahan ke Main Belajar apabila di klik Button belajar */
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent explicit_intent = new Intent(Belajar_Tanwin_1.this,
                        Main_Belajar.class); //Tujuan Class
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
