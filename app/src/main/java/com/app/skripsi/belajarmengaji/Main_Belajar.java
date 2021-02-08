package com.app.skripsi.belajarmengaji;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.app.Activity;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.media.MediaPlayer;
import android.view.View.OnClickListener;




public class Main_Belajar extends Activity implements View.OnClickListener{
    ImageButton next_button,help;
    MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_belajar);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        mp = MediaPlayer.create(getBaseContext(), R.raw.backsound);
        help = (ImageButton) findViewById(R.id.help);
        help.setOnClickListener(this);
        //Untuk Menambahkan Button Suara
        final MediaPlayer SuaraButton = MediaPlayer.create(this, R.raw.button);
        ImageButton ButtonBelajar = (ImageButton) this.findViewById(R.id.button_hijaiyah_2);

        ButtonBelajar.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                SuaraButton.start();
            }
        });


        //Button Berpindah Actvity
        next_button = (ImageButton) findViewById(R.id.button_hijaiyah_2);
        next_button.setOnClickListener(new OnClickListener() {

            /*Perpindahan ke Main Belajar apabila di klik Button belajar */
            public void onClick(View v) {

                // TODO Auto-generated method stub
                SuaraButton.start(); // Membuat suara button
                Intent explicit_intent = new Intent(Main_Belajar.this,
                        Belajar_Hijaiyah_2.class); //Tujuan Class
                startActivity(explicit_intent);
                mp.stop();
            }

        });

        //Button Berpindah Actvity
        next_button = (ImageButton) findViewById(R.id.button_hijaiyah_3);
        next_button.setOnClickListener(new OnClickListener() {

            /*Perpindahan ke Main Belajar apabila di klik Button belajar */
            public void onClick(View v) {
                // TODO Auto-generated method stub
                SuaraButton.start(); // Membuat suara button
                Intent explicit_intent = new Intent(Main_Belajar.this,
                        Belajar_Harokat_1.class); //Tujuan Class
                startActivity(explicit_intent);
                mp.stop();
            }

        });

        //Button Berpindah Actvity
        next_button = (ImageButton) findViewById(R.id.button_hijaiyah_4);
        next_button.setOnClickListener(new OnClickListener() {

            /*Perpindahan ke Main Belajar apabila di klik Button belajar */
            public void onClick(View v) {
                // TODO Auto-generated method stub
                SuaraButton.start(); // Membuat suara button
                Intent explicit_intent = new Intent(Main_Belajar.this,
                        Belajar_Tanwin_1.class); //Tujuan Class
                startActivity(explicit_intent);
                mp.stop();
            }

        });

        //Button Berpindah Actvity
        next_button = (ImageButton) findViewById(R.id.back);
        next_button.setOnClickListener(new OnClickListener() {
            /*Perpindahan ke Main Belajar apabila di klik Button belajar */
            public void onClick(View v) {
                // TODO Auto-generated method stub
                SuaraButton.start(); // Membuat suara button
                Intent explicit_intent = new Intent(Main_Belajar.this,
                        Main.class); //Tujuan Class
                startActivity(explicit_intent);
            }
        });
    }
    public void onClick (View v){
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(this);
        builder.setMessage("Silahkan pilih menu belajar sesuai dengan pilihan anda !!!").setCancelable(false)
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                        mp.stop();
                    }
                }).show();
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
