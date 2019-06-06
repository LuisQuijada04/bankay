package com.example.tiendaspattty;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.example.tiendaspattty.activities.AboutUsActivity;
import com.example.tiendaspattty.activities.MenuActivity;
import com.example.tiendaspattty.activities.RegistroActivity;
import com.example.tiendaspattty.generals.Settings;

public class MainActivity  extends AppCompatActivity {

    TextView tv_registrar;
    Button btn_nosotros;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_registrar = findViewById(R.id.textView);
        tv_registrar.setOnClickListener(new View.OnClickListener() {
            @Override
             public void onClick(View v) {
                Intent intentReg = new Intent(MainActivity.this, RegistroActivity.class);
                MainActivity.this.startActivity(intentReg);
              }
        });
         btn_nosotros = findViewById(R.id.btn_nosotros);
         btn_nosotros.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent intentNos = new Intent(MainActivity.this, AboutUsActivity.class);
                 MainActivity.this.startActivity(intentNos);
             }
         });
   }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(Settings.DEBUG, "La aplicacion entró en start");
    }
    @Override
    public void onResume(){
        super.onResume();
        Log.d(Settings.DEBUG, "La aplicacion entró en resume");

    }
    @Override
    protected void onStop() {
        // call the superclass method first
        super.onStop();
        Log.d(Settings.DEBUG, "La aplicacion entró en stop");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.v(Settings.DEBUG, "La aplicacion entró en pause");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(Settings.DEBUG, "La aplicacion entró en destroy");
    }
}
