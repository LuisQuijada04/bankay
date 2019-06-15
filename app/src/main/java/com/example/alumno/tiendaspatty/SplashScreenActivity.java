package com.example.alumno.tiendaspatty;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;
import android.view.WindowManager;

import javax.xml.datatype.Duration;

public class SplashScreenActivity extends AppCompatActivity {

    private final int DURACION_SPLASH = 2000;

    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent o = new Intent(SplashScreenActivity.this, MainActivity.class);
                startActivity(o);
                finish();
            };
        }, DURACION_SPLASH);

    }
}
