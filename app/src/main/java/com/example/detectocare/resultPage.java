package com.example.detectocare;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class resultPage extends Activity {
    String symptomsn;
    TextView tvresult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_page);
        Intent intent = getIntent();
        symptomsn = intent.getStringExtra("Symptoms");
        tvresult = findViewById(R.id.tvResult);
        tvresult.setText(symptomsn);


    }
}