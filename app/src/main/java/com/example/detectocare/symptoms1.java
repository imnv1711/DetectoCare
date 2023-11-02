package com.example.detectocare;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Toast;

public class symptoms1 extends Activity {
    Button btNext;
    EditText etTrial;
    CheckBox c[] = new CheckBox[9];
    int id[] = {R.id.itch,R.id.skinrash,R.id.shivering,R.id.jointpain,R.id.stomachpain,R.id.acidity,
            R.id.ulcers,R.id.vomiting,R.id.fatigue};

    static String symptoms="";


    public symptoms1(String symptomsn) {
        symptomsn=symptoms;
    }
    public symptoms1(){

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_symptoms1);
        int i;
        etTrial=findViewById(R.id.etTrial);
        btNext = findViewById(R.id.btNext);
        for(i=0;i<c.length;i++){
            c[i] = findViewById(id[i]);
            c[i].setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                    CheckBox c = (CheckBox)compoundButton;
                    symptoms +=" "+c.getText();
                    etTrial.setText(symptoms);
                }
            });
        }


        btNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ii = new Intent(getApplicationContext(),symptoms2.class);
                ii.putExtra("Symptoms",symptoms);
                startActivity(ii);
            }
        });
    }
}