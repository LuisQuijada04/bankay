package com.example.alumno.myapplication.activities;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

import com.example.alumno.myapplication.R;
import com.example.alumno.myapplication.helpers.QueueUtils;
import  com.example.alumno.myapplication.models.Product;

public class ProductActivity extends AppCompatActivity{
    Product productObject;
    TextView productName;
    TextView textDescription;
    QueueUtils.QueueObject queue = null;
    ArrayList<Product> items;
    Button btnBuy;
    Button btnWholesaleBuy;
    int _productId;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);
        Intent myIntent = getIntent(); // gets the previously created intent
        _productId = myIntent.getIntExtra("productId", 0);
        queue = QueueUtils.getInstance(this.getApplicationContext());
        btnBuy = (Button)findViewById(R.id.btnBuy);
        btnWholesaleBuy = (Button)findViewById(R.id.btnWholesaleBuy);

        items = new ArrayList<>();

        Product.injectProductsFromCloud(queue,items,this);

        btnBuy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent o = new Intent(ProductActivity.this, CarActivity.class);
                startActivity(o);
            }
        });

        //btnWholesaleBuy.setOnClickListener(new View.OnClickListener() {
       //     @Override
       //     public void onClick(View view) {
       //         Intent o = new Intent(ProductActivity.this, WholesaleOrderActivity.class);
       //         startActivity(o);//    }
       // });
    }
    public void refreshList() {
        for(Product i : items) {
            if ( i.getId() == _productId ) {
                fill(i);
                return;
            }
        }
        Intent o = new Intent(ProductActivity.this, ProductListActivity.class);
        o.putExtra("status", "error");
        startActivity(o);
        finish();
        return;
    }
    public void fill(Product productObject) {
        productName = (TextView)findViewById(R.id.textViewName);
        textDescription = (TextView)findViewById(R.id.textDescription);
        productName.setText(productObject.getName());
        textDescription.setText(productObject.getDescription());
    }
}
