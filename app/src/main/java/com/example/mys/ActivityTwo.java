package com.example.mys;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.view.View.OnClickListener;


public class ActivityTwo extends AppCompatActivity implements OnClickListener {


    EditText etLog;
    EditText etPass;
    EditText etLName;
    EditText etFName;

    Button btnSubmit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);

        etLog = (EditText) findViewById(R.id.etLog);
        etPass= (EditText) findViewById(R.id.etPass);
        etLName = (EditText) findViewById(R.id.etLName);
        etFName = (EditText) findViewById(R.id.etFName);

        btnSubmit = (Button) findViewById(R.id.btnSubmit);
        btnSubmit.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this, ActivityThree.class);
        intent.putExtra("fName", etFName.getText().toString());
        intent.putExtra("lName", etLName.getText().toString());
        intent.putExtra("log", etLog.getText().toString());
        intent.putExtra("pass", etPass.getText().toString());
        startActivity(intent);
    }
}