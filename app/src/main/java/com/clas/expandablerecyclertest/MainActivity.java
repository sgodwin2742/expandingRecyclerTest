package com.clas.expandablerecyclertest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Button;

import com.bignerdranch.expandablerecyclerview.Model.ParentObject;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rv;
    private ExerciseDB exerciseDb;

    @Override
    protected void onSaveInstanceState(Bundle outstate) {
        super.onSaveInstanceState(outstate);
        ((ExpandingAdapter)rv.getAdapter()).onSaveInstanceState(outstate);
    }
        
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        exerciseDb = ExerciseDB.getInstance(this);
        
        rv = (RecyclerView) findViewById(R.id.recycler);
        rv.setLayoutManager(new LinearLayoutManager(this));
        
        ExpandingAdapter adapter = new ExpandingAdapter(this,init_data());
        adapter.setParentClickableViewAnimationDefaultDuration();
        adapter.setParentAndIconExpandOnClick(true);

        rv.setAdapter(adapter);
    }

    private List<ParentObject> init_data() {
        final ReentrantLock l = new ReentrantLock();
        TitleCreator tc = TitleCreator.get(this);
        List<ParentRecycler> titles = tc.getParentTitles();
        List<ParentObject> parentObjects = new ArrayList<>();
        for(ParentRecycler p:titles){
            List<Object> children = new ArrayList<>();
            children.add("You should be able to see this");
            p.setChildObjectList(children);
            parentObjects.add(p);
        }
        return parentObjects;
    }
}
