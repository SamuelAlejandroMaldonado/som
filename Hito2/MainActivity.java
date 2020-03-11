package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
private Button butt1;
private TextView txt;
private EditText et;
private TextView nu1;
    private TextView nu2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initializeVariables();

    }
    public void  initializeVariables(){

        butt1=findViewById(R.id.button1);
        et=findViewById(R.id.t3);
       txt=findViewById(R.id.t2);

        butt1.setText("INGRESAR");


        butt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String contenido = et.getText().toString();
                txt.setText(contenido.toString());

            }
        });


    }
}
