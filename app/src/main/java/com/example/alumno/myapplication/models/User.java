package com.example.alumno.myapplication.models;

import java.util.ArrayList;

public class User {
    int User_ID;
    String UserName;
    String Password;

    public User (int user_ID,String UserName, String Password){
        this.User_ID = user_ID;
        this.UserName = UserName;
        this.Password = Password;
    }
    public ArrayList<User> list = new ArrayList<User>();

    public ArrayList<User> getList() {
        list.add((new User(1,"","")));
        list.add((new User(2,"","")));
        return list;
    }
}