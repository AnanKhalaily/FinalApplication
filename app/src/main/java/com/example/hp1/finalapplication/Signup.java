package com.example.hp1.finalapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Signup extends AppCompatActivity implements View.OnClickListener {
    TextView username,email,age,password;
    EditText id,pass,mail,age1;
    Button signupbt;
    DatabaseReference MRootRef = FirebaseDatabase.getInstance().getReference();

    private Object Menu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup);
        username=(TextView)findViewById(R.id.username1);
        email=(TextView)findViewById(R.id.tvmail);
        age=(TextView)findViewById(R.id.tvage);
        password=(TextView)findViewById(R.id.tvpass);
        id=(EditText)findViewById(R.id.etusername);
        pass=(EditText)findViewById(R.id.etpasswordd);
        mail=(EditText)findViewById(R.id.etemail);
        age1=(EditText)findViewById(R.id.etage);
        signupbt=(Button)findViewById(R.id.btsignupp);
        signupbt.setOnClickListener(this);






    }

    @Override
    public void onClick(View v) {

    }
}
