package com.example.myapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class result_activity extends AppCompatActivity {
    private TextView txt_result;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.result_activity);
        txt_result=findViewById(R.id.txt_result);
        Intent i=getIntent();
        String s=i.getStringExtra("my");
        txt_result.setText(s);
    }
}

