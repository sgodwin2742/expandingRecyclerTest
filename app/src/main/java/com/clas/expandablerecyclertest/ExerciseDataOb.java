package com.clas.expandablerecyclertest;

import com.bignerdranch.expandablerecyclerview.Model.ParentObject;

import java.util.ArrayList;
import java.util.List;

public class ExerciseDataOb implements ParentObject {
    private String name;
    private List<Object> children;

    public ExerciseDataOb(ExerciseDBObject ex){
        name = ex.getName();
        children = new ArrayList<>();
        children.add(ex);
    }

    public String getName() {return name;}

    @Override
    public List<Object> getChildObjectList() {
        return children;
    }

    @Override
    public void setChildObjectList(List<Object> list) {
        children = list;
    }
}
