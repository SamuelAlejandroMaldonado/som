package com.example.ca;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity implements View.OnClickListener
{
private EditText txt;
private Button btn1,btn2,btsuma,btnigual,btn4,btn5,btn6,btn7,btn8,btn9,btn0,btn3,btresta,btmulti,btdi,btcuadrado,btporcentaje,btmasmenos,flech,nmc,nmc2,raiz,punto,x1;

double Resultado;
int operacion;
    public double opera1;
    public double opera2;
    public double opera3=1;
    public double opera4=0;
    public double resul;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initializeVariables();
    }
  public void  initializeVariables(){
        btn1 = findViewById(R.id.num1);
        btn2=findViewById(R.id.num2);
      btn3 = findViewById(R.id.num3);
      btn4=findViewById(R.id.num4);
      btn5 = findViewById(R.id.num5);
      btn6=findViewById(R.id.num6);
      btn7 = findViewById(R.id.num7);
      btn8=findViewById(R.id.num8);
      btn9 = findViewById(R.id.num9);
      btn0=findViewById(R.id.num0);
        btsuma= findViewById(R.id.sum);
      btresta = findViewById(R.id.resta);
      btmulti=findViewById(R.id.multi);
      btdi=findViewById(R.id.div);
        txt = findViewById(R.id.t1);
         btnigual=findViewById(R.id.igual);
      btcuadrado=findViewById(R.id.cuadrado);
      btporcentaje=findViewById(R.id.porcentaje2);
      btmasmenos=findViewById(R.id.masmenos);
      flech=findViewById(R.id.numflechita);
      nmc=findViewById(R.id.numc);
      nmc2=findViewById(R.id.numc2);
      raiz=findViewById(R.id.numr);
      punto=findViewById(R.id.punto);
      x1 = findViewById(R.id.unox);
//txt.setInputType(InputType.TYPE_NULL);
      btnigual.setOnClickListener(this);
      btn1.setOnClickListener(this);
      btn2.setOnClickListener(this);
      btn3.setOnClickListener(this);
      btn4.setOnClickListener(this);
      btn5.setOnClickListener(this);
      btn6.setOnClickListener(this);
      btn7.setOnClickListener(this);
      btn8.setOnClickListener(this);
      btn9.setOnClickListener(this);
      btn0.setOnClickListener(this);
      btmasmenos.setOnClickListener(this);
      btsuma.setOnClickListener(this);
      btresta.setOnClickListener(this);
      btmulti.setOnClickListener(this);
      btdi.setOnClickListener(this);
      btcuadrado.setOnClickListener(this);
      btporcentaje.setOnClickListener(this);
      flech.setOnClickListener(this);
      nmc.setOnClickListener(this);
      nmc2.setOnClickListener(this);
      raiz.setOnClickListener(this);
      punto.setOnClickListener(this);
      x1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.num1:
                String dato = txt.getText().toString();
                dato=dato+"1";
                txt.setText(dato);
                break;
            case R.id.num2:
                String dato1 = txt.getText().toString();
                dato1=dato1+"2";
                txt.setText(dato1);
                break;

            case R.id.num3:
                String dato2 = txt.getText().toString();
                dato2=dato2+"3";
                txt.setText(dato2);
                break;
            case R.id.num4:
                String dato3 = txt.getText().toString();
                dato3=dato3+"4";
                txt.setText(dato3);
                break;
            case R.id.num5:
                String dato4 = txt.getText().toString();
                dato4=dato4+"5";
                txt.setText(dato4);
                break;
            case R.id.num6:
                String dato5 = txt.getText().toString();
                dato5=dato5+"6";
                txt.setText(dato5);
                break;
            case R.id.num7:
                String dato6 = txt.getText().toString();
                dato6=dato6+"7";
                txt.setText(dato6);
                break;
            case R.id.num8:
                String dato7 = txt.getText().toString();
                dato7=dato7+"8";
                txt.setText(dato7);
                break;
            case R.id.num9:
                String dato8 = txt.getText().toString();
                dato8=dato8+"9";
                txt.setText(dato8);
                break;
            case R.id.num0:
                String dato9 = txt.getText().toString();
                dato9=dato9+"0";
                txt.setText(dato9);
                break;
            case R.id.punto:

                txt.setText(".");
                break;
            case R.id.cuadrado:
cuadra();
                break;
            case R.id.masmenos:
                Double op,res;
                String auxi = txt.getText().toString();
               op=Double.parseDouble(auxi);
                res = op*(-1);
                txt.setText(""+res);

              break;
            case R.id.sum:
                suma();
                break;
            case R.id.resta:
                resta();
                break;
            case R.id.multi:
                multip();
                break;
            case R.id.div:
              divic();
                break;
            case R.id.igual:

                signos();

                break;
            case R.id.porcentaje2:
               porcen();
                break;
            case R.id.numflechita:
                String dlt = txt.getText().toString();

                    dlt = dlt.substring(0, dlt.length() - 1);
                if(dlt.length()>0) {
                    txt.setText(dlt);
                    dlt = dlt.substring(0, dlt.length() - 1);
                }

                break;
            case R.id.numc:
                txt.setText("");
                break;
            case R.id.numc2:
                txt.setText("");
                break;
            case R.id.numr:
                Double res1,op2,op3;
                String auxi3 = txt.getText().toString();
                op2=Double.parseDouble(auxi3);
              op3=  Math.sqrt(op2);
                txt.setText(""+op3);
                break;
            case R.id.unox:
                Double res2,op4,op5;
                String auxi4 = txt.getText().toString();
                op5=Double.parseDouble(auxi4);
                op4=1/op5;
                txt.setText(""+op4);
                break;
        }
    }


    public void signos()
    {
        try
        {
            String auxi2 = txt.getText().toString();
            opera2 = Double.parseDouble(auxi2);


        }
        catch (NumberFormatException e){
        }

        txt.setText("");
        if(operacion==1)
        {
            resul=opera1+opera2;
        }
        else if(operacion==2)
        {
            resul=opera1-opera2;
        }
        else if(operacion==3)
        {
            resul=opera1*opera2;
        }
        else if(operacion==4)
        {
            if(operacion==0)
            {
                txt.setText("Error al ingresar");
            }
            else
            {
                resul=opera1/opera2;
            }
        }
        else if(operacion==5)
        {

                resul=opera1;


        }
        else if(operacion==6)
        {

            resul=opera1*opera2/100;


        }
        txt.setText(""+resul);
        opera1=0.0;
        opera3=1.0;
opera4=0;
    }

    public void suma()
    {
            String auxi = txt.getText().toString();
            opera1 = opera1 +Double.parseDouble(auxi);
        txt.setText("");
        operacion = 1;
    }
    public void resta()
    {
        opera1=0;
        if(opera4<1){
            String auxi = txt.getText().toString();
            opera1 = Double.parseDouble(auxi)-opera1;
            opera3=opera1;
        }
        else if(opera4>0){
            String auxi = txt.getText().toString();
            opera1 = opera3-Double.parseDouble(auxi);
        }

        opera4++;
        txt.setText("");
        operacion = 2;
    }

    public void multip()
    {

            opera1=1;
            String auxi = txt.getText().toString();

            opera1 =opera3*Double.parseDouble(auxi);
opera3=opera1;


        txt.setText("");
        operacion = 3;
    }
    public void divic()
    {


if(opera4<1){
    String auxi = txt.getText().toString();
    opera1 = Double.parseDouble(auxi)/opera3;
    opera3=opera1;
}
else{
    String auxi = txt.getText().toString();
    opera1 = opera3/Double.parseDouble(auxi);
    opera3=opera1;
}


        opera4++;
        txt.setText("");
        operacion = 4;
    }
    public void cuadra(){
        try {


            String auxi = txt.getText().toString();
            Double a = Double.parseDouble(auxi);
            opera1 = Math.pow(a,2);
        }
        catch (NumberFormatException e){
        }
        txt.setText("");
        operacion = 5;
    }
    public void porcen(){
        try {


            String auxi = txt.getText().toString();
            opera1 =Double.parseDouble(auxi);
        }
        catch (NumberFormatException e){
        }
        txt.setText("");
        operacion = 6;
    }

}
