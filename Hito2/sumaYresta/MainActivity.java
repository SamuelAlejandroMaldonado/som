package com.example.secondapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
private EditText et1,et2;
private TextView tv1,tvResp;
private Button btSumar,btresta;
String n1,n2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initializeVariables();
    }
    public void initializeVariables(){
        et1= findViewById(R.id.etNumber1);
        et2= findViewById(R.id.etNumber2);
        tv1= findViewById(R.id.Tv1);
        tv1.setText("Calculadora básica");
        tvResp= findViewById(R.id.Tv2);
        btSumar= findViewById(R.id.btn1);
        btresta= findViewById(R.id.btn2);

        btSumar = findViewById(R.id.btn1);
        btSumar.setOnClickListener(this);
        btresta = findViewById(R.id.btn2);
        btresta.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
switch (v.getId()){

    case R.id.btn1:
         n1 = et1.getText().toString();
         n2 = et2.getText().toString();
        int respuesta = Integer.parseInt(n1)+Integer.parseInt(n2);
        tvResp.setText(""+ respuesta);
        break;

    case R.id.btn2:
        n1 = et1.getText().toString();
        n2 = et2.getText().toString();
       respuesta = Integer.parseInt(n1)-Integer.parseInt(n2);
        tvResp.setText(""+ respuesta);
        break;
}

    }
}
