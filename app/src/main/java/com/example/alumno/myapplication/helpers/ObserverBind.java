package com.example.alumno.myapplication.helpers;
import android.util.Log;
import java.util.Observable;
import java.util.Observer;

public class ObserverBind implements Observer {
    private Callback callback;

    @Override
    public void update(Observable o, Object arg) {
        Log.v("bankai", "update <<<<");
        if (this.callback != null) {
            this.callback.doThis(o, arg);
        }
    }

    public void setCallback(Callback callback) {
        if (callback == null) {
            return;
        }
        this.callback = callback;
    }
}