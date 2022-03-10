package com.example.service;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class commentsAdapter extends ArrayAdapter<comments> {


    private Context mContext;
    private int mResource;
    public commentsAdapter(@NonNull Context context, int resource, @NonNull ArrayList<comments> objects) {
        super(context, resource, objects);

        this.mContext = context;
        this.mResource = resource;

    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {


        LayoutInflater layoutInflater= LayoutInflater.from(mContext);

        convertView= layoutInflater.inflate(mResource,parent,false);

        ImageView pic = convertView.findViewById(R.id.pic);
        ImageView one = convertView.findViewById(R.id.one);
        ImageView two = convertView.findViewById(R.id.two);
        ImageView three = convertView.findViewById(R.id.three);
        ImageView four = convertView.findViewById(R.id.four);
        ImageView five = convertView.findViewById(R.id.five);
        TextView uname = convertView.findViewById(R.id.uname);
        TextView comment = convertView.findViewById(R.id.comment);


        pic.setImageResource(getItem(position).getPic());
        one.setImageResource(getItem(position).getOne());
        two.setImageResource(getItem(position).getTwo());
        three.setImageResource(getItem(position).getThree());
        four.setImageResource(getItem(position).getFour());
        five.setImageResource(getItem(position).getFive());
        uname.setText(getItem(position).getUname());
        comment.setText(getItem(position).getComment());



        return convertView;
    }
}
