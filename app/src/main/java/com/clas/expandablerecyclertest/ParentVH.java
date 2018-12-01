package com.clas.expandablerecyclertest;

import android.view.View;
import android.widget.TextView;

public class ParentVH extends com.bignerdranch.expandablerecyclerview.ViewHolder.ParentViewHolder {
    private TextView tv;

    public ParentVH(View itemView) {
        super(itemView);
        tv = (TextView) itemView.findViewById(R.id.parentTitle);

    }

    public void setText(String text) {
        this.tv.setText(text);
    }
}
