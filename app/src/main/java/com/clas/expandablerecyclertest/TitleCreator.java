package com.clas.expandablerecyclertest;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

public class TitleCreator {
    static TitleCreator tc;
    List<ParentRecycler> parentTitles;

    public TitleCreator(Context c){
        parentTitles = new ArrayList<>();
        for (int i=0; i < 16;i++){
            parentTitles.add(new ParentRecycler("Option "+i));
        }
    }

    public static TitleCreator get(Context c){
        if(tc == null){
            tc = new TitleCreator(c);
        }
        return tc;
    }

    public List<ParentRecycler> getParentTitles() {
        return parentTitles;
    }
}
