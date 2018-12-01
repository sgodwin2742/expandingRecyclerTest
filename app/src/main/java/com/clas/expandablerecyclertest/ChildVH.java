package com.clas.expandablerecyclertest;

import android.view.View;
import android.widget.TextView;
import android.widget.VideoView;

import com.bignerdranch.expandablerecyclerview.ViewHolder.ChildViewHolder;

public class ChildVH extends ChildViewHolder {
    private TextView tv;

    public ChildVH(View itemView) {
        super(itemView);
        tv = (TextView) itemView.findViewById(R.id.child_text);
    }

    public void setText(String text){
        tv.setText(text);
    }
}
