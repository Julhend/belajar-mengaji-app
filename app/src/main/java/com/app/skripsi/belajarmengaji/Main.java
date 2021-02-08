package com.app.skripsi.belajarmengaji;

import android.os.Bundle;
import android.app.Activity;
import android.view.KeyEvent;
import android.view.Window;
import android.view.View;
import android.view.WindowManager;
import android.content.Intent;
import android.media.MediaPlayer;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;



public class Main extends Activity{
    ImageButton next_button;
    MediaPlayer mp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);




      //  mp = MediaPlayer.create(getBaseContext(), R.raw.backsound);
      //  mp.start(); //suara

        final Animation animScale = AnimationUtils.loadAnimation(this, R.anim.anim_alpha);

        //Untuk Menambahkan Button Suara
        final MediaPlayer SuaraButton = MediaPlayer.create(this, R.raw.button);
        ImageButton ButtonBelajar = (ImageButton) this.findViewById(R.id.button_quiz);
        ButtonBelajar.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                SuaraButton.start();
            }
        });


        ImageButton exit = (ImageButton) findViewById(R.id.exit);
        exit.setOnClickListener(new OnClickListener() {


            public void onClick(View v) {
                // TODO Auto-generated method stub
                finish();
               // mp.stop();
              //  int code;
                System.exit(0);
            }
        });

/*===============================================================================================*/
        /*Button Berpindah ke Actvity Belajar */
        next_button = (ImageButton) findViewById(R.id.button_belajar);
        next_button.startAnimation(animScale);
            next_button.setOnClickListener(new OnClickListener() {

                /*Perpindahan ke Main Belajar apabila di klik Button belajar */
                public void onClick(View v) {

                    // TODO Auto-generated method stub
                    SuaraButton.start(); //Memanggil Suara Button
                    v.startAnimation(animScale);
                    Intent explicit_intent = new Intent(Main.this,
                            Main_Belajar.class);
                    startActivity(explicit_intent);
                    mp.stop();
                }
            });

        /*Button Berpindah ke Actvity Quiz */
            next_button = (ImageButton) findViewById(R.id.button_quiz);
            next_button.startAnimation(animScale);
            next_button.setOnClickListener(new OnClickListener() {
                /*Perpindahan ke Main Belajar apabila di klik Button belajar */
                public void onClick(View v) {

                    // TODO Auto-generated method stub
                    SuaraButton.start(); // Memanggil Suara Button
                    Intent explicit_intent = new Intent(Main.this, Quis_Bacaan.class);
                    startActivity(explicit_intent);
                    v.startAnimation(animScale);
                    mp.stop();
                }
            });


        }
        @Override
        public boolean onKeyDown ( int keyCode, KeyEvent event){
            if (keyCode == KeyEvent.KEYCODE_MEDIA_CLOSE) {
                //preventing default implementation previous to android.os.Build.VERSION_CODES.ECLAIR
                return true;
            }
            return super.onKeyDown(keyCode, event);
        }



}