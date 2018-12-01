package com.clas.expandablerecyclertest;

import com.bignerdranch.expandablerecyclerview.Model.ParentObject;

import java.util.List;
import java.util.UUID;

public class ParentRecycler implements ParentObject {
    private List<Object> children;
    UUID id;
    String title;

    ParentRecycler(String title){
        this.title =title;
        id = UUID.randomUUID();
    };

    public UUID getId() {return id;}
    public void setId(UUID id) {this.id = id;}

    public String getTitle() {return title;}
    public void setTitle(String title) {this.title = title;}

    @Override
    public List<Object> getChildObjectList() {
        return children;
    }

    @Override
    public void setChildObjectList(List<Object> list) {
        children = list;
    }
}
