package com.example.alumno.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;

import com.example.alumno.myapplication.activities.AboutUsActivity;
import com.example.alumno.myapplication.activities.ProductListActivity;
import com.example.alumno.myapplication.generals.Settings;
import com.example.alumno.myapplication.models.*;

public class MainActivity extends AppCompatActivity {
    Button btnGO;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnProducts = (Button) findViewById(R.id.btnEnter);
        btnAboutUs = (Button) findViewById(R.id.btnAboutUs);
        btnProducts.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Log.i(Settings.INFO, "Products");
                Intent i = new Intent(MainActivity.this, ProductListActivity.class);
                startActivity(i);
            }
        });
        btnAboutUs.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Log.i(Settings.INFO, "About us");
                Intent i = new Intent(MainActivity.this, AboutUsActivity.class);
                startActivity(i);
            }
        });
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.v("patty", "la aplicacion acaba de ingresar a onStart");
    }
    @Override
    protected void onResume(){
        Toast.makeText(this, "gracias por usar", Toast.LENGTH_SHORT).show();
        super.onResume();
        Log.v("patty", "la aplicacion acaba de ingresar a onResume");
    }
    @Override
    protected void onPause(){
        super.onPause();
        Log.v("patty", "la aplicacion acaba de ingresar a onPause");
    }
    @Override
    protected void onStop(){
        super.onStop();
        Log.v("patty", "la aplicacion acaba de ingresar a onStop");
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.v("patty", "la aplicacion acaba de ingresar a onDestroy");
    }
}
