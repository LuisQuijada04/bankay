package com.example.alumno.myapplication.models;

import java.util.ArrayList;

public class UserGroup {
    int Group_ID;
    int User_ID;

    public UserGroup (int group_ID,int user_ID){
        this.Group_ID = group_ID;
        this.User_ID = user_ID;
    }
    public ArrayList<UserGroup> list = new ArrayList<UserGroup>();

    public ArrayList<UserGroup> getList() {
        list.add((new UserGroup(1,1)));
        list.add((new UserGroup(1,2)));
        return list;
    }
}

