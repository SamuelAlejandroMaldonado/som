package com.example.a2daapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{
    private  EditText edt1, edt2;
    private TextView tv1, tv2;
    private Button btSuma, btResta, btMultplicar, btDividir,btnclean,cal2;
    private int res1;
    private String n1, n2;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initializeVariables();
    }

    public void initializeVariables()
    {
        edt1 = findViewById(R.id.etNum1);
        edt2 = findViewById(R.id.etNum2);
        tv1 = findViewById(R.id.tv1);
        tv2 = findViewById(R.id.tv2);

        tv1.setText("Calculadora Basica");

        btSuma = findViewById(R.id.btnSumar);
        btResta = findViewById(R.id.btnRestar);
        btMultplicar = findViewById(R.id.btnMultiplicar);
        btDividir = findViewById(R.id.btnDividir);
        btnclean = findViewById(R.id.btnclean);
        cal2= findViewById(R.id.cal2);

        btSuma.setOnClickListener(this);
        btResta.setOnClickListener(this);
        btMultplicar.setOnClickListener(this);
        btDividir.setOnClickListener(this);
        btnclean.setOnClickListener(this);
        cal2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v)
    {
        switch (v.getId())
        {
            case R.id.btnSumar:
                n1 = edt1.getText().toString();
                n2 = edt2.getText().toString();

                res1= Integer.parseInt(n1) + Integer.parseInt(n2);
                tv2.setText(" " + res1);
                break;
            case R.id.btnRestar:
                n1 = edt1.getText().toString();
                n2 = edt2.getText().toString();

                res1= Integer.parseInt(n1) - Integer.parseInt(n2);
                tv2.setText(" " + res1);
                break;
            case R.id.btnMultiplicar:
                n1 = edt1.getText().toString();
                n2 = edt2.getText().toString();

                res1= Integer.parseInt(n1) * Integer.parseInt(n2);
                tv2.setText(" " + res1);
                break;
            case R.id.btnDividir:
                n1 = edt1.getText().toString();
                n2 = edt2.getText().toString();

                res1= Integer.parseInt(n1) / Integer.parseInt(n2);
                tv2.setText(" " + res1);
                break;
            case R.id.btnclean:
                edt1.setText("");
                edt2.setText("");
                Toast.makeText(this.getApplication(),"Click ", Toast.LENGTH_LONG).show();
                break;
            case R.id.cal2:
                Intent intent= new Intent(this,calc.class);
                startActivity(intent);
                break;
        }
    }
}
