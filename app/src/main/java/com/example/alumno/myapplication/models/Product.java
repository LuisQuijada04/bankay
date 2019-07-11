package com.example.alumno.myapplication.models;

import java.util.ArrayList;
import java.util.List;
import java.util.NavigableMap;

public class Product {

    public String toString(){
        return String.format("%s - %s - %s - %s - %s", this.Product_ID,this.Name,this.Precio,this.Category_ID,this.Descripcion);
    }

    int Product_ID;
    int Category_ID;
    String Name;
    String Descripcion;
    double Precio;

    public Product(int product_ID, int category_ID,String _name,String descripcion,double precio) {
        //Constructor
        this.Product_ID = product_ID;
        this.Category_ID = category_ID;
        this.Name = _name;
        this.Descripcion = descripcion;
        this.Precio = precio;
    }
    public static ArrayList getdata() {
        ArrayList<Product> list = new ArrayList<Product>();
        list.add(new Product(1, 1, "mashiro", "figura coleccionable", 3.20));
        list.add(new Product(2, 2, "dodoro", "figura coleccionable", 3.10));
        list.add(new Product(3, 3, "haruka", "figura coleccionable", 3.20));
        list.add(new Product(4, 4, "sorata", "figura coleccionable", 3.30));
        list.add(new Product(5, 5, "Goku ssj God Blue", "figura coleccionable", 3.40));
        list.add(new Product(6, 6, "Vegetta", "figura coleccionable", 3.50));
        list.add(new Product(7, 7, "Goku Black", "figura coleccionable", 3.60));
        list.add(new Product(8, 8, "Glod Frezzer", "figura coleccionable", 3.70));
        list.add(new Product(9, 9, "figura", "en observacion", 3.80));
        list.add(new Product(10, 10, "mashiro", "figura coleccionable", 3.90));
        return list;
    }

    public int getId(){
        return this.Product_ID;
    }
    public String getName() {
        return getName();
    }
/*
    public static Product getByld(int product_ID){
        for (Product o : Product.getdata()) {
            if (o.Product_ID == product_ID) {
                return o;
            }
        }
        return null;
    }*/
}
