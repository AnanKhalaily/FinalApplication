package com.example.hp1.finalapplication;

import android.content.ClipData;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;
import java.util.zip.Inflater;

/**
 * Created by Hp1 on 27/09/2017.
 */

public class customadapter extends ArrayAdapter<lvtepul> {

    public customadapter(Context context, int resource, List<lvtepul> objects) {
        super(context, R.layout.custom_row, objects);
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        LayoutInflater imageInflater=LayoutInflater.from(getContext());
        View cuView=imageInflater.inflate(R.layout.custom_row,parent, false);


        lvtepul lvtepul = getItem(position);
        TextView title=(TextView)cuView.findViewById(R.id.textView61313);
        ImageView image =(ImageView)cuView.findViewById(R.id.imageView31313);

        title.setText(lvtepul.getTitle());
        image.setImageResource(lvtepul.getImageid());
        return cuView;
    }
}


