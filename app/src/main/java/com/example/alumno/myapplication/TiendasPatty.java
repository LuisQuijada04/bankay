package com.example.alumno.myapplication;

import android.app.Application;
import android.os.SystemClock;

public class TiendasPatty extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        SystemClock.sleep(2000);
    }
}
