package com.clas.expandablerecyclertest;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.VideoView;

import com.bignerdranch.expandablerecyclerview.Adapter.ExpandableRecyclerAdapter;
import com.bignerdranch.expandablerecyclerview.Model.ParentObject;

import java.util.List;


public class ExpandingAdapter extends ExpandableRecyclerAdapter<ParentVH,ChildVH> {
    LayoutInflater inflater;

    public ExpandingAdapter(Context c, List<ParentObject> parents){
        super(c,parents);
        inflater = LayoutInflater.from(c);
    }

    @Override
    public ParentVH onCreateParentViewHolder(ViewGroup viewGroup) {
        View v = inflater.inflate(R.layout.parent_card,viewGroup,false);
        return new ParentVH(v);
    }

    @Override
    public ChildVH onCreateChildViewHolder(ViewGroup viewGroup) {
       View v = inflater.inflate(R.layout.child_layout,viewGroup,false);
       return new ChildVH(v);
    }

    @Override
    public void onBindParentViewHolder(ParentVH parentVH, int i, Object o) {
        ParentRecycler r = (ParentRecycler)o;
        parentVH.setText(r.getTitle());
    }

    @Override
    public void onBindChildViewHolder(ChildVH childVH, int i, Object o) {
        childVH.setText((String) o);
    }
}
