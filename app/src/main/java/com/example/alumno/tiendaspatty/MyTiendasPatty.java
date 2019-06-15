package com.example.alumno.tiendaspatty;

import android.app.Application;
import android.os.SystemClock;

public class MyTiendasPatty extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        SystemClock.sleep(2000);
    }
}
