package com.example.detectocare;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class trial extends Activity {
    Button btlogin1;
    LinearLayout liTrial;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trial);
        btlogin1=findViewById(R.id.btlogin1);
        liTrial=findViewById(R.id.liTrial);
        liTrial.setBackgroundColor(Color.parseColor("#ffff00"));
        btlogin1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ii = new Intent(getApplicationContext(),homePage.class);
                startActivity(ii);
            }
        });
    }
}