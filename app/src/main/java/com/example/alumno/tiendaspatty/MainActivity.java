package com.example.alumno.tiendaspatty;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.alumno.tiendaspatty.activities.LoginActivity;
import com.example.alumno.tiendaspatty.activities.ProductActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
      Button btn_iniciar;
      Button btn_registrar;
      EditText EditUsuario;
      EditText edit_Password;
      ArrayList<Users> listUsuarios = new ArrayList<>();

      //@Override
     // protected void (Bundle savedIntanceState) {
     //     super.onCreate(savedIntanceState);
     //     setContentView(R.layout.activity_login);
     //     User user1 = user();
     //     user1.setUsername=("")
     // }}

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent o = new Intent(MainActivity.this, LoginActivity.class);
        startActivity(o);
        finish();

        btn_iniciar = findViewById(R.id.btn_iniciar);
        btn_iniciar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String usuario = ((EditText) findViewById(R.id.EditUsuario)).getText().toString();
                String password = ((EditText) findViewById(R.id.edit_Password)).getText().toString();
                if (usuario.equals("admin") && password.equals("admin"))
                {
                    Intent intProd = new Intent(MainActivity.this, ProductActivity.class);
                    startActivity(intProd);
                }
                else
                {
                 Toast.makeText(getApplicationContext(),"Usuario incorrecto",Toast.LENGTH_SHORT).show();
                }
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
