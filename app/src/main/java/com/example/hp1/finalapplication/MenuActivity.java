package com.example.hp1.finalapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MenuActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    ListView lvtepulem;
    ArrayList<lvtepul> tepulim=new ArrayList<lvtepul>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        lvtepulem=(ListView)findViewById(R.id.lvItems);
        tepulim.add(new lvtepul("More About us",R.drawable.logoo));
        tepulim.add(new lvtepul("Your Account Details",R.drawable.lvpic));
        tepulim.add(new lvtepul("Your Therapy Classes",R.drawable.lvpic));
        tepulim.add(new lvtepul("Contact Us",R.drawable.lvpic));

        customadapter custom=new customadapter(this,R.layout.custom_row,tepulim);
        lvtepulem.setAdapter(custom);


    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        if(position==0){

        }
    }
}
