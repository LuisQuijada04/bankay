package com.example.alumno.myapplication.models;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;

import com.example.alumno.myapplication.activities.ProductActivity;
import com.example.alumno.myapplication.activities.ProductListActivity;
import com.example.alumno.myapplication.fragments.ProductListFragment;
import com.example.alumno.myapplication.helpers.QueueUtils;

public class Product {
    private int id;
    private String name;
    private String description;
    private String category;
    private String smallImage;
    private float price;
    private Context contexto;

    public Product(int i, String name) {
        this.id = i;
        this.name = name;
    }

    public Product(int i, String name, String description) {
        this.id = i;
        this.name = name;
        this.description = description;
    }

    public Product(int i, String name, String description, String category, String price, String smallImage) {
        this.id = i;
        this.name = name;
        this.description = description;
        this.category = category;
        this.price = 12;
        this.smallImage = smallImage;
    }

    public int getId(){
        return this.id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }
    public String getCategory(){
        return this.category;
    }
    public float getPrice(){
        return this.price;
    }
    public String getPriceText(){
        return String.format("%.2f", this.price);
    }
    public Float getSmallBitMap(){
        return this.price;
    }

    public String getSmallImage() {
        return this.smallImage;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public static void injectProductsFromCloud(final QueueUtils.QueueObject o,
                                               final ArrayList<Product> products,
                                               final ProductListFragment _interface) {
        String url = "https://reqres.in/api/products";
        url = "http://still-fjord-66322.herokuapp.com/frutapp";
        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest
                (Request.Method.GET, url, null, new Response.Listener<JSONObject>() {

                    @Override
                    public void onResponse(JSONObject response) {
                        if (response.has("data")) {

                            try {
                                JSONArray list = response.getJSONArray("data");
                                for (int i=0; i < list.length(); i++) {
                                    JSONObject o = list.getJSONObject(i);
                                    products.add(new Product(o.getInt("id"),
                                            o.getString("name"),
                                            o.getString("description"),
                                            o.getString("category"),
                                            o.getString("price"),
                                            o.getString("image")));
                                }

                            } catch (JSONException e) {
                                e.printStackTrace();
                            }
                            _interface.refreshList();
                        }
                    }
                }, new Response.ErrorListener() {

                    @Override
                    public void onErrorResponse(VolleyError error) {
                        // TODO: Handle error
                        int b = 2;
                        b += 1;

                    }
                });
        o.addToRequestQueue(jsonObjectRequest);
    }
    public static void injectProductsFromCloud(final QueueUtils.QueueObject o,
                                               final ArrayList<Product> products,
                                               final ProductActivity _interface) {
        String url = "https://reqres.in/api/products";
        url = "http://still-fjord-66322.herokuapp.com/frutapp";
        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest
                (Request.Method.GET, url, null, new Response.Listener<JSONObject>() {

                    @Override
                    public void onResponse(JSONObject response) {
                        if (response.has("data")) {

                            try {
                                JSONArray list = response.getJSONArray("data");
                                for (int i=0; i < list.length(); i++) {
                                    JSONObject o = list.getJSONObject(i);
                                    products.add(new Product(o.getInt("id"),
                                            o.getString("name"),
                                            o.getString("description"),
                                            o.getString("category"),
                                            o.getString("price"),
                                            o.getString("image")));
                                }

                            } catch (JSONException e) {
                                e.printStackTrace();
                            }
                            _interface.refreshList();
                        }
                    }
                }, new Response.ErrorListener() {

                    @Override
                    public void onErrorResponse(VolleyError error) {
                        // TODO: Handle error
                        int b = 2;
                        b += 1;

                    }
                });
        o.addToRequestQueue(jsonObjectRequest);
    }

    public static void injectProductsFromCloud(final QueueUtils.QueueObject o,
                                               final ArrayList<Product> products,
                                               final ProductListActivity _interface) {
        String url = "https://reqres.in/api/products";
        url = "http://still-fjord-66322.herokuapp.com/frutapp";
        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest
                (Request.Method.GET, url, null, new Response.Listener<JSONObject>() {

                    @Override
                    public void onResponse(JSONObject response) {
                        if (response.has("data")) {

                            try {
                                JSONArray list = response.getJSONArray("data");
                                for (int i=0; i < list.length(); i++) {
                                    JSONObject o = list.getJSONObject(i);
                                    products.add(new Product(o.getInt("id"),
                                            o.getString("name"),
                                            o.getString("description"),
                                            o.getString("category"),
                                            o.getString("price"),
                                            o.getString("image")));
                                }

                            } catch (JSONException e) {
                                e.printStackTrace();
                            }
                            _interface.refreshList();
                        }
                    }
                }, new Response.ErrorListener() {

                    @Override
                    public void onErrorResponse(VolleyError error) {
                        // TODO: Handle error
                        int b = 2;
                        b += 1;

                    }
                });
        o.addToRequestQueue(jsonObjectRequest);
    }

    public static ArrayList<Product> getProductsAsString() {
        ArrayList<Product> o = new ArrayList<>();
        o.add(new Product(1,"Granolas"));
        o.add(new Product(2, "Galletas Integrales"));
        o.add(new Product(3, "Granolas con Miel"));
        o.add(new Product(4,"Granolas de Trigo"));
        o.add(new Product(4,"Salvado de Trigo"));
        o.add(new Product(5,"Quiwicha con miel"));
        o.add(new Product(6,"Miel de eucalipto"));
        o.add(new Product(7,"Pecanas"));
        o.add(new Product(8,"Avellanas"));
        o.add(new Product(9,"Mani"));
        o.add(new Product(10,"Frutos secos"));
        o.add(new Product(11,"Almendras"));
        o.add(new Product(12,"Leche de Almendras"));
        o.add(new Product(13,"Leche de soja"));
        o.add(new Product(14,"Colageno"));
        o.add(new Product(16,"Galle de algarrobina"));
        o.add(new Product(17,"Galleta integral"));
        return o;
    }

    public String toString() {
        return this.name;
    }
    public static Product getById(int _id) {
        for (Product product : Product.getProductsAsString()) {
            if (product.getId() == _id) {
                return product;
            }
        }
        return null;

    }

    private Bitmap descargarImagen (String imageHttpAddress){
        URL imageUrl = null;
        Bitmap image = null;

        String name = imageHttpAddress.replace("http://alpacanow.com", "_");
        name = name.replace("http://cdn.alpacanow.com", "_");
        name = name.replace("http://cdn.classicalpaca.com", "_");
        name = name.replace("/", "_");

        ContextWrapper cw = new ContextWrapper(contexto);
        String archivos_rutas = cw.getFilesDir().getAbsolutePath();

        String files_dir = "/data/data/com.sixquark.blanca.blanca/files/";
        File file = new File(files_dir+name);
        if (file.exists()) {
            Bitmap myBitmap = BitmapFactory.decodeFile(file.getAbsolutePath());
            return myBitmap;
        }else {
            try {
                imageUrl = new URL(imageHttpAddress);
                HttpURLConnection conn = (HttpURLConnection) imageUrl.openConnection();
                conn.connect();
                image = BitmapFactory.decodeStream(conn.getInputStream());
                String ruta = guardarImagen(contexto, name, image);
                return image;
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            return image;
        }

    }

    private String guardarImagen (Context context, String nombre, Bitmap imagen){
        ContextWrapper cw = new ContextWrapper(context);
        File myPath = new File(cw.getFilesDir(), nombre);
        FileOutputStream fos = null;
        try{
            fos = new FileOutputStream(myPath);
            imagen.compress(Bitmap.CompressFormat.JPEG, 60, fos);
            fos.flush();
        }catch (FileNotFoundException ex){
            ex.printStackTrace();
        }catch (IOException ex){
            ex.printStackTrace();
        }
        return myPath.getAbsolutePath();
    }

}

