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
import android.widget.TextView;


public class ActivityThree extends AppCompatActivity {

    TextView tvView;
    TextView tvView2;
    TextView tvView3;
    TextView tvView4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three);

        tvView = (TextView) findViewById(R.id.tvView);
        tvView2 = (TextView) findViewById(R.id.tvView2);
        tvView3 = (TextView) findViewById(R.id.tvView3);
        tvView4 = (TextView) findViewById(R.id.tvView4);

        Intent intent = getIntent();

        String fName = intent.getStringExtra("fName");
        String lName = intent.getStringExtra("lName");
        String Log = intent.getStringExtra("log");
        String Password = intent.getStringExtra("pass");

        tvView.setText("Твое имя " + fName);
        tvView2.setText("Твоя Фамилия " + lName);
        tvView3.setText("Твой логин " + Log);
        tvView4.setText("Твой пароль " + Password);


    }
}