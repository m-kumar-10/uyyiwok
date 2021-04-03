package com.example.android.miwok;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter<getterSetter> {

    public CustomAdapter(@NonNull Context context, int resource, @NonNull ArrayList<getterSetter> objects) {
        super(context, resource, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View AdapterView = convertView;


        if (AdapterView==null)
            AdapterView = LayoutInflater.from(getContext()).inflate(R.layout.custom_list_view,parent,false);


        getterSetter getPosition = getItem(position);
        ImageView image = (ImageView)AdapterView.findViewById(R.id.imageID);
        image.setImageResource(getPosition.getImageResID());
        TextView headText = (TextView) AdapterView.findViewById(R.id.miwokText);
        headText.setText(getPosition.getMiwok());
        TextView defaultText = (TextView) AdapterView.findViewById(R.id.defaultText);
        defaultText.setText(getPosition.getDefault());

        return AdapterView;
//        return super.getView(position, convertView, parent);
    }
}
