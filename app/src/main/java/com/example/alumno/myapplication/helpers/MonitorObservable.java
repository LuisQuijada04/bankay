package com.example.alumno.myapplication.helpers;

import com.example.alumno.myapplication.models.Client;

import java.util.Observable;

public class MonitorObservable extends Observable {
    Client WachedValue;
    public MonitorObservable(Client o) {
        this.WachedValue = o;
    }
    public void setWachedValue(Client o) {
        if (o!=null && o.getYear_olb() != this.WachedValue.getYear_olb()){
            this.WachedValue = o;
        setChanged();
        notifyObservers(o);
    }else {
        setChanged();
        // trigger notification
        notifyObservers(o);
    }}
}
