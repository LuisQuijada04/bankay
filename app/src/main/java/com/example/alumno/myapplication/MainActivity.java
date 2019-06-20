package com.example.alumno.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.alumno.myapplication.helpers.Callback;
import com.example.alumno.myapplication.helpers.MonitorObservable;
import com.example.alumno.myapplication.helpers.ObserverBind;
import com.example.alumno.myapplication.models.Client;

import java.util.Observable;

public class MainActivity extends AppCompatActivity {

    Button btn_edad ;
    MonitorObservable monitorObservable;
    ObserverBind observerBind;
    Client clientObjet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        clientObjet = new Client();
        clientObjet.setYear_olb(19);
        //aqui brindamos el objeto cone un obervador
        monitorObservable = new MonitorObservable(clientObjet);
        observerBind = new ObserverBind();
        observerBind.setCallback(new Callback() {
            @Override
            public void doThis (Observable o, Object x){
                //todo lo que yo quiera
                Log.v("bankai", "xxx");
                Toast.makeText(MainActivity.this,clientObjet.getYear_olb() + "",
                        Toast.LENGTH_SHORT).show();
            }
        });
        monitorObservable.addObserver(observerBind);

        btn_edad = (Button)findViewById(R.id.btn_edad);
        btn_edad.setOnClickListener((new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            clientObjet.setYear_olb(clientObjet.getYear_olb() +1);
            monitorObservable.setWachedValue(clientObjet);
        }
    }));
    }
}
