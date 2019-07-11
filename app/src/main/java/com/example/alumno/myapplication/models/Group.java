package com.example.alumno.myapplication.models;

import java.util.ArrayList;

public class Group {
    int Group_ID;


    public Group (int group_ID){
        this.Group_ID = group_ID;
    }
    public ArrayList<Group> list = new ArrayList<Group>();

    public ArrayList<Group> getList() {
        list.add((new Group(1)));
        list.add((new Group(2)));
        return list;
    }
}
