package com.example.tiendaspattty;

import android.app.Application;
import android.os.SystemClock;

public class MyTiendasPattty extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        SystemClock.sleep(2000);
    }
}
