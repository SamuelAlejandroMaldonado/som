package com.example.examenhito3.App;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.examenhito3.R;

import java.text.BreakIterator;

public class CalcCustom extends AppCompatActivity implements View.OnClickListener {
    private EditText txt;
    private Button cerrar, btn1,btn2,btn3,btn4,btn0,btncl,btnshift,btsuma,btnigual,btres,btmulti,btdi,cm1,cm2,cm3,cm4;
    int operaciones;
    double operan1,operan2;
    double operan3=1;
    double operan4=0;
    double resul;
    int clicks = 1;
    private TextView tvShowU2,tvShows2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc_custom);
        initializeVariables();
    }

    public void  initializeVariables(){
        tvShowU2 = findViewById(R.id.tvShowU2);
        tvShows2 = findViewById(R.id.tvShowS2);
        String username = getIntent().getStringExtra("US");
        String select = getIntent().getStringExtra("AS");
        String msg1 = "App: " + select;
        String msg = "Bienvenido: " + username;

        tvShowU2.setText(msg);
        tvShows2.setText(msg1);








        btn1 = findViewById(R.id.nt1);
        btn2=findViewById(R.id.nt2);
        btn3 = findViewById(R.id.nt3);
        btn4 = findViewById(R.id.nt4);
        btn0=findViewById(R.id.nt0);
        btsuma= findViewById(R.id.ntmas);
        btres= findViewById(R.id.ntmenos);
        btmulti=findViewById(R.id.ntmulti);
        btdi=findViewById(R.id.ntdi);
        txt = findViewById(R.id.txt);
        btnigual=findViewById(R.id.ntiual);
        btnshift=findViewById(R.id.ntshf);
        cm1=findViewById(R.id.c1);
        cm2=findViewById(R.id.c2);
        cm3=findViewById(R.id.c3);
        cm4=findViewById(R.id.c4);
        cerrar=findViewById(R.id.cls);
        btncl=findViewById(R.id.ntclean);
        cerrar.setOnClickListener(this);
        btncl.setOnClickListener(this);
        btnigual.setOnClickListener(this);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btnshift.setOnClickListener(this);
        cm1.setOnClickListener(this);
        cm2.setOnClickListener(this);
        cm3.setOnClickListener(this);
        cm4.setOnClickListener(this);
        btn0.setOnClickListener(this);
        btsuma.setOnClickListener(this);
        btres.setOnClickListener(this);
        btmulti.setOnClickListener(this);
        btdi.setOnClickListener(this);

    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.cls:
            finish();
            break;
            case R.id.ntclean:
                txt.setText("");
                break;
            case R.id.nt1:
                String dato = txt.getText().toString();
                dato = dato + "1";
                txt.setText(dato);
                break;
            case R.id.nt2:
                String dato1 = txt.getText().toString();
                dato1 = dato1 + "2";
                txt.setText(dato1);
                break;

            case R.id.nt3:
                String dato2 = txt.getText().toString();
                dato2 = dato2 + "3";
                txt.setText(dato2);
                break;
            case R.id.nt4:
                String dato4 = txt.getText().toString();
                dato4 = dato4 + "4";
                txt.setText(dato4);
                break;
            case R.id.nt0:
                String dato3 = txt.getText().toString();
                dato3 = dato3 + "0";
                txt.setText(dato3);
                break;
            case R.id.ntmas:
                String sum = txt.getText().toString();
                if (sum.equals("")) {
                    Toast.makeText(this, "Introducir números", Toast.LENGTH_SHORT).show();
                } else {
                    operan1 = operan1 + Double.parseDouble(sum);
                    txt.setText("");
                    operaciones = 1;
                }
                break;
            case R.id.ntmenos:
                operan1 = 0;
                if (operan4 < 1) {
                    String auxi = txt.getText().toString();
                    operan1 = Double.parseDouble(auxi) - operan1;
                    operan3 = operan1;
                } else if (operan4 > 0) {
                    String auxi = txt.getText().toString();
                    operan1 = operan3 - Double.parseDouble(auxi);
                }

                operan4++;
                txt.setText("");
                operaciones = 2;
                break;
            case R.id.ntmulti:
                operan1 = 1;
                String multi = txt.getText().toString();

                operan1 = operan3 * Double.parseDouble(multi);
                operan3 = operan1;


                txt.setText("");
                operaciones = 3;

                break;
            case R.id.ntdi:
                if (operan4 < 1) {
                    String di = txt.getText().toString();
                    operan1 = Double.parseDouble(di) / operan3;
                    operan3 = operan1;
                } else {
                    String di = txt.getText().toString();
                    operan1 = operan3 / Double.parseDouble(di);
                    operan3 = operan1;
                }
                operan4++;
                txt.setText("");
                operaciones = 4;
                break;
            case R.id.c2:
                String auxcm4;
                auxcm4 = cm2.getText().toString();
                if (auxcm4.equals("x3")) {
                    Double res, res1;
                    String cua = txt.getText().toString();
                    res = Double.parseDouble(cua);
                    res1 = Math.pow(res, 3);
                    txt.setText("" + res1);
                }
                else{
                    String par = txt.getText().toString();
                    operan1 = Double.parseDouble(par);
                    txt.setText("");
                    operaciones = 5;



                }

                break;
            case R.id.c1:
                String axcm1;
                axcm1 = cm1.getText().toString();
                if (axcm1.equals("x2")) {
                    Double res, res1;
                    String cua = txt.getText().toString();
                    res = Double.parseDouble(cua);
                    res1 = Math.pow(res, 2);
                    txt.setText("" + res1);

                } else {
                    Double res, res1;
                    String cua = txt.getText().toString();
                    res = Double.parseDouble(cua);
                    res1 = Math.pow(res, 3);
                    txt.setText("" + res1);
                }
                break;
            case R.id.c3:
                String auxcm3;
                auxcm3 = cm3.getText().toString();
                if (auxcm3.equals("!n")) {
                    double factorial = 1;
                    String fac = txt.getText().toString();
                    Double op11 = Double.parseDouble(fac);
                    for (double i = op11; i > 0; i--) {
                        factorial = factorial * i;
                    }
                    txt.setText("" + factorial);
                }
                else{
                    try {
                        String auxi = txt.getText().toString();
                        operan1 = Double.parseDouble(auxi);
                        int cw =0;
                        int w1 =1;
                        int w2;
                        int sums =0;
                        for(double i = 1;i<=operan1;i++)
                        {
                            w2 = cw;
                            cw = w1 +cw;
                            w1 = w2;
                            sums = sums + w1;
                        }
                        txt.setText(""+sums);
                        operan1=0;
                    }
                    catch (Exception E)
                    {
                        Toast.makeText(getApplicationContext(),"Revise los datos",Toast.LENGTH_LONG).show();
                    } }
                break;
            case R.id.c4:
                String acm4;

                acm4 = cm4.getText().toString();
                if (acm4.equals("Σn")) {
                    try {
                        double ar=0;
                        String auxi = txt.getText().toString();
                        Double aux11 = Double.parseDouble(auxi);
                        for(Double i = aux11;i>0;i--)
                        {
                            ar = ar+i;
                        }
                        txt.setText(""+ar);
                    }
                    catch (Exception a)
                    {
                        Toast.makeText(getApplicationContext(),"Revise los datos",Toast.LENGTH_LONG).show();
                    }}
                else{
                    try {

                        String auxi = txt.getText().toString();
                        operan1 = Double.parseDouble(auxi);
                        txt.setText("");
                        operaciones=6;
                    }
                    catch (Exception a)
                    {
                        Toast.makeText(getApplicationContext(),"Revise los datos",Toast.LENGTH_LONG).show();
                    }

                }
                    break;







                    case R.id.ntshf:
                clicks++;
                if(clicks%2==0){
                    datosbtones2();
                }
                else {
                    datosbtones1();
                }
                break;

            case R.id.ntiual:
                String captura = txt.getText().toString();
                if (captura.equals("")) {
                    Toast.makeText(this, "Introducir números", Toast.LENGTH_SHORT).show();
                }
                else{
                    operan2 = Double.parseDouble(captura);
                    txt.setText("");
                    if (operaciones == 1) {
                        resul = operan1 + operan2;
                    }
                    else if (operaciones == 2)
                    {
                        resul = operan1 - operan2;
                    }
                    else if (operaciones == 3)
                    {
                        resul = operan1 * operan2;
                    }
                    else if (operaciones == 4)
                    {
                        if (operaciones == 0) {
                            txt.setText("Error al ingresar");
                        }
                        else {
                            resul = operan1 / operan2;
                        }
                    }
                    else if (operaciones == 5) {
                        resul =Math.pow(operan1,operan2);
                    }
                    else if(operaciones==6)
                    {
                        for(Double i = operan1;i<=operan2;i++)
                        {
                            resul = resul+i;
                        }
                    }
                    txt.setText("" + resul);
                    operan1 = 0.0;
                    operan3 = 1.0;
                    operan4 = 0;}
                break;
        }
    }
    public void datosbtones1(){
        cm1.setText("x2");
        cm2.setText("x3");
        cm3.setText("!n");
        cm4.setText("Σn");
    }
    public void datosbtones2(){
        cm1.setText("x3");
        cm2.setText("XY");
        cm3.setText("Σfibo");
        cm4.setText("Σnxy");
    }





}
