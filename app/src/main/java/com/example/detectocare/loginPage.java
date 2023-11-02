package com.example.detectocare;

import static java.lang.String.valueOf;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class loginPage extends Activity {
    EditText etMail,etPwd;
    Button btSign,btLogin;
    String mail="",Password="";
    TextView tvHello;

    static String dbName="profile.db";
    String dbPath = "/data/data/com.example.DetectoCare/databases/";
    SQLiteDatabase db = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);
        etMail = findViewById(R.id.etMail);
        etPwd = findViewById(R.id.etPwd);
        btSign = findViewById(R.id.btSign);
        btLogin=findViewById(R.id.btLogin);
        tvHello = findViewById(R.id.tvHello);
        btLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ii = new Intent(getApplicationContext(),trial.class);
                startActivity(ii);
            }
        });
        btSign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mail = etMail.getText().toString();
                Password = etPwd.getText().toString();

                        Intent ii = new Intent(getApplicationContext(),symptoms1.class);
                        startActivity(ii);

                    Toast.makeText(loginPage.this, "Try Again " + mail + Password, Toast.LENGTH_LONG).show();

                }




        });
    }
}