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

public class symptoms2 extends Activity {
    EditText etTrial2;
    String symptomsn="";
    symptoms1 s1 = new symptoms1(symptomsn);
    Button btNext2;
    CheckBox c[] = new CheckBox[9];
    int id[] = {R.id.anxiety,R.id.coldhands,R.id.moodswings,R.id.headache,R.id.fever,R.id.diarrhea,
            R.id.sunkeneye,R.id.runnynose,R.id.constipation};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_symptoms2);
        etTrial2 = findViewById(R.id.etTrial2);
        btNext2 = findViewById(R.id.btNext2);
        Intent intent = getIntent();
        symptomsn = intent.getStringExtra("Symptoms");
        etTrial2.setText(symptomsn);
        int i;
        for(i=0;i<c.length;i++){
            c[i] = findViewById(id[i]);
            c[i].setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                    CheckBox c = (CheckBox)compoundButton;
                    symptomsn +=" "+c.getText();
                    etTrial2.setText(symptomsn);
                }
            });
        }
        btNext2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ii = new Intent(getApplicationContext(),resultPage.class);
                ii.putExtra("Symptoms",symptomsn);
                startActivity(ii);

            }
        });




    }
}