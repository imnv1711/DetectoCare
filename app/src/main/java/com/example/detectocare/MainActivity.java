package com.example.detectocare;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends Activity {
    Timer t;
    TextView tvDet;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t= new Timer();
        tvDet = findViewById(R.id.tvDet);
        t.schedule(new TimerTask() {
            @Override
            public void run() {
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.slide_animation);
                tvDet.startAnimation(animation);
                Intent ii = new Intent(getApplicationContext(),loginPage.class);
                startActivity(ii);
                finish();
            }
        },500);
    }
}