package com.app.skripsi.belajarmengaji;


import com.app.skripsi.belajarmengaji.loading.LoadingTaskFinishedListener;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.WindowManager;
import android.widget.ProgressBar;

public class Intro_App extends Activity implements LoadingTaskFinishedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loading);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        ProgressBar progressBar = (ProgressBar) findViewById(R.id.progressbar_Horizontal);
        new loading(progressBar, this).execute("");

    }

    @Override
    public void onTaskFinished() {
        completeSplash();
    }
    private void completeSplash(){
        startApp();
        finish(); // Don't forget to finish this Splash Activity so the user can't return to it!
    }
    private void startApp() {
        Intent intent = new Intent(Intro_App.this, Main.class);
        startActivity(intent);
    }

}