package com.example.hp1.finalapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btlogin,btsignup;
    TextView tvlogin,tvsignup;
    EditText etusername,etpassword;
    ImageView ivmyndlift;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btlogin=(Button)findViewById(R.id.btlogin);
        btlogin.setOnClickListener(this);
        btsignup=(Button)findViewById(R.id.btsignup);
        btsignup.setOnClickListener(this);
        tvlogin=(TextView)findViewById(R.id.tvlogin);
        tvsignup=(TextView)findViewById(R.id.tvsignup);
        etusername=(EditText)findViewById(R.id.etusername);
        etusername=(EditText)findViewById(R.id.etpassword);
        ivmyndlift=(ImageView)findViewById(R.id.ivmyndlift);

    }

    @Override
    public void onClick(View view) {

    }
}
